package cn.vic.init.controller;

import cn.vic.init.bean.MMUser;
import cn.vic.init.service.MMUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/many-to-many")
public class MMUserController {

    @Autowired
    private MMUserService mmUserService;

    @GetMapping("{id}")
    public MMUser TUserController(@PathVariable(value = "id") Long id) {
        return mmUserService.selectByIdWithOrder(id);
    }
}
