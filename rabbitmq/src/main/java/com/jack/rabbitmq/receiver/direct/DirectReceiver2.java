package com.jack.rabbitmq.receiver.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component
public class DirectReceiver2 {
    @RabbitListener(queues = {"DirectQu1"})
    public void directReceive(String msg){
        System.out.println("Direct 2 接收的消息：" + msg + UUID.randomUUID());
    }
}
