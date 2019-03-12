package cn.vic.init.mapper;

import cn.vic.init.bean.MUser;
import org.springframework.stereotype.Repository;

@Repository
public interface MUserMapper {

    MUser selectByIdWithOrder(Long id);
}
