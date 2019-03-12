package cn.vic.init.mapper;

import cn.vic.init.bean.TUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserMapper {

    TUser selectByWithIdCard(Long id);

    TUser selectByIdWithIdCard2(Long id);
}
