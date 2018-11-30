package com.fa.servicefeign.controller;

import com.fa.servicefeign.feigninterface.HiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 创建一个对外的接口，调用Feign客户端提供的HiInterface 的服务
 * <p>DemoController .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 09:13
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
@RestController
public class DemoController {

    @Autowired
    public HiInterface hiInterface;

    @RequestMapping("/hi")
    public String hi(){
        return hiInterface.sayHiFromClient();
    }
}
