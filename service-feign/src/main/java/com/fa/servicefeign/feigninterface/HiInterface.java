package com.fa.servicefeign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description: Feign接口测试
 * <p>HiInterface .<br/></p>
 * <p>
 * change history:
 * date             defect#             person             comments
 * -------------------------------------------------------------------------------------------------------------------
 * 2018/11/30         ********             ZQI               create file
 *
 * @author: ZQI
 * @date: 2018/11/30 09:09
 * @copyright: 2018, FA Software (Shanghai) Co., Ltd. All Rights Reserved.
 */
// 调用的服务名
@FeignClient(value = "service-hi")
public interface HiInterface {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClient();
}
