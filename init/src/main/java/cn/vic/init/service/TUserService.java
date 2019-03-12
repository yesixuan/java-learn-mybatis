package cn.vic.init.service;

import cn.vic.init.bean.TUser;
import cn.vic.init.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    public TUser selectByWithIdCard(Long id) {
        return tUserMapper.selectByWithIdCard(id);
    }

    public TUser selectByIdWithIdCard2(Long id) {
        return tUserMapper.selectByIdWithIdCard2(id);
    }
}
