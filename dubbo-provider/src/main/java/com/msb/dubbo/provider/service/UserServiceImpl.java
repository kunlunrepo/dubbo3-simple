package com.msb.dubbo.provider.service;

import com.msb.common.bean.User;
import com.msb.common.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService(timeout = 100)
public class UserServiceImpl implements IUserService {
    @Override
    public User getUserById(Long id) {
        User user = User.builder().id(id)
                .age(12)
                .name("天涯")
                .build();
        log.info("服务获取用户信息：{}", user);
        return user;
    }
}
