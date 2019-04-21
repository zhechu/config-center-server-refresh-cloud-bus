package com.wise.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

/**
 * 启动类 浏览器访问配置示例 ：http://127.0.0.1:8080/<spring.application.name>/dev/master
 * @author lingyuwang
 *
 */
@SpringCloudApplication
@EnableConfigServer
@Slf4j
public class ConfigCenterServer {

    @Value("${server.port}")
    private String port;
    
    @PostConstruct
    public void finishInit(){
        log.debug("Start {} with port:{}",ConfigCenterServer.class.getSimpleName(),port);
    }

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterServer.class, args);
	}
	
}
