package cn.vic.init.controller;

import cn.vic.init.bean.User;
import cn.vic.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public int add(@RequestBody User user) {
//        return userService.add(user);
        userService.add(user);
        return user.getId(); // 这个可以获得自增的 ID 值
    }

    @DeleteMapping("user/{id}")
    public int delete(@PathVariable(value = "id") Integer id) {
        return userService.delete(id);
    }

    @PutMapping("user/{id}")
    public int update(@PathVariable("id") Integer id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @PostMapping("batchSave")
    public int batchSave(@RequestBody List<User> userList) {
        return userService.batchSave(userList);
    }

    @PostMapping("batchDelete")
    public int batchDelete(@RequestBody List<Integer> idList) {
        return userService.batchDelete(idList);
    }
}
