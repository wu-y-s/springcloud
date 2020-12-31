package com.wys.springcloud.service.impl;

import com.wys.springcloud.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @Author: wys
 * @Description: TODO
 * @DateTime: 2020/12/30 10:46
 **/
@EnableBinding(Source.class)
public class MessageProviderImpl implements MessageProvider {

    @Autowired
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("---"+serial);
        return null;
    }
}
