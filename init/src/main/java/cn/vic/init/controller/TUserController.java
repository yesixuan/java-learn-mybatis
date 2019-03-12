package cn.vic.init.controller;

import cn.vic.init.bean.TUser;
import cn.vic.init.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one-to-one")
public class TUserController {

    @Autowired
    private TUserService tUserService;

//    @GetMapping("{id}")
//    public TUser selectByWithIdCard(@PathVariable(value = "id") Long id) {
//        return tUserService.selectByWithIdCard(id);
//    }

    @GetMapping("{id}")
    public TUser selectByIdWithIdCard2(@PathVariable(value = "id") Long id) {
        return tUserService.selectByIdWithIdCard2(id);
    }
}
