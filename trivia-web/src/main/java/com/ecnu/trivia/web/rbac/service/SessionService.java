/**
 * Service编写规范：
 *  1、所有Service类需要添加 @Service 注解标识
 *  2、所有Service类需要实现 Logable 接口
 *  3、所有Service在类内部使用 @Resource 自动注入 Mapper、Service
 *  4、如果有URL或配置常量请使用 @Value("${name}")自动装配
 *  5、所有 Service 类请添加 logger 日志器，并熟练使用logger
 *
 * @author Jack Chen
 */
package com.ecnu.trivia.web.rbac.service;

import com.ecnu.trivia.common.log.Logable;
import com.ecnu.trivia.web.rbac.domain.User;
import com.ecnu.trivia.web.rbac.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("sessionService")
public class SessionService implements Logable{

    private static Logger logger = LoggerFactory.getLogger(SessionService.class);

    @Resource
    private UserMapper userMapper;

    public User getUserByAccount(String account,String password){
        User user = userMapper.getUserByAccount(account,password);
        return user;
    }

    public void setUserLastLogin(String account){
        userMapper.setLastLogin(account);
    }

    public void setUserRegisterInfo(String nickname,String headpic,String account,String password){
        userMapper.setUserRegisterInfo(nickname, headpic, account, password);
    }

    public User getUserById(Integer id){
        User user = userMapper.getUserById(id);
        user.setPassword("");
        return user;
    }


}
