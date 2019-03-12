package cn.vic.init.controller;

import cn.vic.init.bean.MUser;
import cn.vic.init.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one-to-many")
public class MUserController {

    @Autowired
    private MUserService mUserService;

    @GetMapping("{id}")
    public MUser TUserController(@PathVariable(value = "id") Long id) {
        return mUserService.selectByIdWithOrder(id);
    }
}
