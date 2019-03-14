package cn.vic.init.service;

import cn.vic.init.bean.MMUser;
import cn.vic.init.mapper.MMUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MMUserService {

    @Autowired
    private MMUserMapper mmUserMapper;

    public MMUser selectByIdWithOrder(Long id) {
        return mmUserMapper.selectByIdWithOrder(id);
    }
}
