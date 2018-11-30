package com.fa.eurekaclient1.po;

import javax.persistence.*;

/**
 * description:
 * <p>User .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 13:28
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
@Entity
@Table(name = "user")
public class User {

    /**
     * 逻辑主键自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户昵称
     */
    @Column(name = "name",length = 12)
    private String name;

    /**
     * 登陆账号
     */
    @Column(name = "account",length = 20)
    private String account;

    /**
     * 登陆密码
     */
    @Column(name = "password",length = 20)
    private String password;

    /**
     * 性别
     */
    @Column(name = "sex")
    private Boolean sex;

    public User() {
    }

    public User(String name, String account, String password, Boolean sex) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.sex = sex;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
