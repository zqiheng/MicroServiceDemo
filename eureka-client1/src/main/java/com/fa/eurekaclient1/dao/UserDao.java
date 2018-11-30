package com.fa.eurekaclient1.dao;

import com.fa.eurekaclient1.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * description: 用户实体数据持久操作层。
 * <p>UserDao .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 13:35
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
public interface UserDao extends JpaRepository<User,Integer> {

}
