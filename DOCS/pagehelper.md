# pagehelper

## 依赖

org.mybatis.spring.boot:mybatis-spring-boot-starter:2.0.0
com.github.pagehelper:pagehelper-spring-boot-starter:1.2.10


## 配置

```yml
mybatis:
  mapper-locations: classpath:mybatis/mapper/*.xml
  type-aliases-package: cn.vic.init.bean

pagehelper:
  helper-dialect: mysql
  reasonable: true
  support-methods-arguments: true
  params: count=countSql

# 日志打印不是必须的但是建议加上
logging:
  level:
    root: WARN # 控制台日志只打印 WARN 级别的
    cn.vic.init.mapper.*: debug # mybatis 打印 SQL 语句
```


## xml 配置

mapper 的书写与之前的搜索结果集别无二致，只在调用查询方法之前多做处理即可


## 使用分页

```java
// 第几页，每页数目，还有第三参数，按照哪个字段的升降序排列
PageHelper.startPage(2, 3);
Page<User> users = userService.findAll();
```


## 处理分页数据

默认返回的分页对象无法直接被序列化（直接序列化只会直接得到数据列表，而丢失其他信息）

### 使用 pagehelper 提供的 PageInfo 类处理分页对象

```java
import com.github.pagehelper.PageHelper;

PageHelper.startPage(2, 3);
Page<User> users = userService.findAll();
// 这般处理之后所有信息都能被序列化，但是数据太多，而且字段名无法改变
PageInfo<User> pageInfo = new PageInfo<>(us);
return pageInfo;
```

### 自己使用 HashMap 来处理

```java
Map<String, Object> data = new HashMap<>();
PageHelper.startPage(2, 3);
Page<User> users = userService.findAll();
data.put("total", users.getTotal());
data.put("nowPage", users.getPageNum());
data.put("data", users);
return data;
```

### 构建自己的 PageInfo 类

```java
// 自己的 PageInfo 类
@SuppressWarnings({"rawtypes", "unchecked"})
public class PageInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int pageNum;
    private int pageSize;
    private long total;
    private int pages;
    private List<T> list;
    private boolean isFirstPage = false;
    private boolean isLastPage = false;

    public PageInfo() {
    }

    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        } else if (list != null) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if (list != null) {
            judgePageBoundary();
        }
    }

    private void judgePageBoundary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
    }

// toString getter setter
```

接下来的用法与 pagehelper 默认提供的 PageInfo 类一致。
