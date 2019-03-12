package cn.vic.init.service;

import cn.vic.init.bean.MUser;
import cn.vic.init.mapper.MUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MUserService {

    @Autowired
    private MUserMapper mUserMapper;

    public MUser selectByIdWithOrder(Long id) {
        return mUserMapper.selectByIdWithOrder(id);
    }
}
