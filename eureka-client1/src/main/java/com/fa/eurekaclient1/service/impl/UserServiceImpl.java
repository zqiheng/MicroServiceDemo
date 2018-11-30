package com.fa.eurekaclient1.service.impl;

import com.fa.eurekaclient1.dao.UserDao;
import com.fa.eurekaclient1.po.User;
import com.fa.eurekaclient1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * description:
 * <p>UserServiceImpl .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 14:09
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 获取所有用户列表信息
     * @return 用户列表
     */
    @Override
    public List<User> getAllUserList() {
        return userDao.findAll();
    }

    /**
     * 添加用户信息
     * @return 添加后返回的实体信息，包含数据库主键ID字段
     */
    @Override
    public User insertUserInfo(User user) {
        return userDao.save(user);
    }

    /**
     * 根据用户Id信息删除用户，批量删除
     * @param id id数组
     */
    @Override
    public void deleteUserInfo(int[] id) {
        for(int i:id){
            userDao.deleteById(i);
        }
    }
}
