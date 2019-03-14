package cn.vic.init.mapper;

import cn.vic.init.bean.MMUser;
import org.springframework.stereotype.Repository;

@Repository
public interface MMUserMapper {

    MMUser selectByIdWithOrder(Long id);
}
