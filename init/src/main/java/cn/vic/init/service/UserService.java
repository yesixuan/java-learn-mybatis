package cn.vic.init.service;

import cn.vic.init.bean.User;
import cn.vic.init.mapper.UserMapper;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    /**
     * @param user
     * @return 默认返回影响的记录条数
     */
    public int add(User user) {
        return userMapper.add(user);
    }

    public int update(Integer id, User user) {
        return userMapper.update(id, user);
    }

    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    public Page<User> findAll() {
        return userMapper.findAll();
    }
}
