package com.fa.eurekaclient1.controller;

import com.fa.eurekaclient1.po.User;
import com.fa.eurekaclient1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * <p>UserController .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 14:11
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * API接口：返回用户所有信息
     * @return List集合
     * 请求地址：/user/getAllUserList
     */
    @GetMapping("/getAllUserList")
    public Object getAllUserList(){
        List<User> list = userService.getAllUserList();
        log.info("UserController-info:"+list);
        return list;
    }

    /**
     * API接口：添加用户信息
     * @param user　用户信息
     * @return 1：添加成功、0：添加失败
     * 请求地址：/user/saveUser
     */
    @PostMapping("/saveUser")
    public Object insertUserInfo(User user){
        log.info("UserController-info提交的参数："+user);
        int flag = 0;

        if(null != user.getName() && !user.getName().equals("")
                && null != user.getAccount() && !user.getAccount().equals("")
                && null != user.getPassword() && !user.getPassword().equals("")
                && null != user.getSex() && !user.getSex().equals("")){
            // 保存用户
            User savedUser = userService.insertUserInfo(user);
            log.info("UserController-info新增用户信息返回的ID："+savedUser.getId());
            if(savedUser.getId() > 0){
                return 1;
            }
        }
        return 0;
    }

    /**
     * 批量删除用户信息
     * @param id id数组
     * @return
     */
    @PostMapping(value = "/deleteUserInfoById")
    public Object deleteUserInfo(int[] id){
        log.info("UserController-info删除的Id数据："+id);
        userService.deleteUserInfo(id);
        return 1;
    }

}
