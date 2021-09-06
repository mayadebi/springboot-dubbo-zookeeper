package com.xiaofei.service;


import com.fuwu.service.TicketService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    //@Reference 用在消费端，表明使用的是服务端的什么服务
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到"+ticket);
    }
}
