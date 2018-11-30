package com.fa.eurekaclient1.service;

import com.fa.eurekaclient1.po.User;

import java.util.List;

/**
 * description:
 * <p>UserService .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 14:08
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
public interface UserService {

    List<User> getAllUserList();

    User insertUserInfo(User user);

    void deleteUserInfo(int[] id);
}
