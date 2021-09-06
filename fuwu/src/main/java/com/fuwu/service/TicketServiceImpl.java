package com.fuwu.service;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//实例化到spring容器中
@Component
//服务提供者暴漏服务
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《黑猫警长》";
    }
}