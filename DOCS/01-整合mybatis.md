## 引入依赖

mybatis: org.mybatis.spring.boot:mybatis-spring-boot-starter:2.0.0
mysql: mysql:mysql-connector-java:8.0.15


## springBoot 配置

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/mytest
    username: root
    password: root

mybatis:
  # classpath 指的是 resources 之下
  mapper-locations: classpath:mybatis/mapper/*.xml
  config-location: classpath:mybatis/mybatis-config.xml
```


## mybatis 配置

mybatis 整体配置
```xml
<!-- resources/mybatis-config.xml -->
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <settings>
        <!--开启 sql 语句输出的功能-->
        <setting name="logImpl" value="STDOUT_LOGGING" />
    </settings>
    <typeAliases>
    </typeAliases>
</configuration>
```

mapper 配置
```xml
<!-- resources/mybatis/userMapper.xml -->
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.vic.init.mapper.UserMapper" >
    <resultMap id="BaseResultMap" type="cn.vic.init.bean.User" >
        <id column="id" property="id" jdbcType="INTEGER" />
        <result column="username" property="username" jdbcType="VARCHAR" />
        <result column="age" property="age" jdbcType="INTEGER" />
        <result column="ctm" property="ctm" jdbcType="TIMESTAMP"/>
    </resultMap>
    <!--增删改查等操作-->
</mapper>
```


## 定义 mapper 接口

```java
@Repository
public interface UserMapper {
    // xxMapper.xml 配置中定义的各种操作
}
```

## mvc

定义 User 实体类、服务、控制器


## 启动类加上注解，自动扫描所有 mapper 类

```java
@MapperScan("cn.vic.init.mapper")
// ...
``` 