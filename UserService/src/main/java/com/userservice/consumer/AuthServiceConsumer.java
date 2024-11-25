package com.userservice.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userservice.entities.UserInfoDto;
import com.userservice.repository.UserRepository;
import com.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceConsumer
{

    @Autowired
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(UserInfoDto eventData) {
        try{
            userService.createOrUpdateUser(eventData);
        }catch(Exception ex){
            System.out.println("AuthServiceConsumer: Exception is thrown while consuming kafka event");
        }
    }

}
