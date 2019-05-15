package com.icangjinge.bank.springboot.base.integrate.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


/**
 启动两个相同应用，端口号分别为8880 8881（idea中修改端口方法： VM options： -Dserver.port=8891），
 通过浏览器访问分别访问http://localhost:8880/ http://localhost:8881/ 返回对应sessionId
 未使用Spring Session时，两sesionid不一致
 使用Spring Session时，两sesionid一致
 */
@SpringBootApplication
//开启redisSession 并且设置session存活时间(单位s)
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=10)
public class SessionDistributedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionDistributedApplication.class, args);
    }

}
