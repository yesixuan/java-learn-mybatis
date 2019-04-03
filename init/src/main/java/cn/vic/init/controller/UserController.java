package cn.vic.init.controller;

import cn.vic.init.bean.User;
import cn.vic.init.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("users")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("user")
    public int add(@RequestBody @Valid User user) {
        return userService.add(user);
    }

    @DeleteMapping("user/{id}")
    public int delete(@PathVariable(value = "id") Integer id) {
        return userService.delete(id);
    }

    @PutMapping("user/{id}")
    public int update(@PathVariable("id") Integer id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @GetMapping("user/findAll")
    public PageInfo<User> findAll() {
        Map<String, Object> data = new HashMap<>();
        PageHelper.startPage(2, 3);
        Page<User> us = userService.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(us);
//        data.put("total", us.getTotal());
//        data.put("nowPage", us.getPageNum());
//        data.put("data", us);

        System.out.println("hehe" + pageInfo);
        return pageInfo;
    }
}
