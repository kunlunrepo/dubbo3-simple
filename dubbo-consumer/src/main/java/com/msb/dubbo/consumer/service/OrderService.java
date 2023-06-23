package com.msb.dubbo.consumer.service;

import com.msb.common.bean.User;
import com.msb.common.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service // 注意注解引入包名
public class OrderService {

    @DubboReference // 指定协议
    private IUserService iUserService;

    @Autowired
    RestTemplate restTemplate;

    public String createOrder(Long id) {
        User user = iUserService.getUserById(id);
        log.info("用户用户信息：{}", user);
        return "创建订单成功";
    }
}
