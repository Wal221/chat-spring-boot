package br.com.chat.config;

import br.com.chat.entity.MessageEntity;
import br.com.chat.entity.UserEntity;
import br.com.chat.repository.MessageRepository;
import br.com.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;



    @Override
    public void run(String... args) throws Exception {
       UserEntity user = new UserEntity(null,"pedro","io");
        UserEntity user1 = new UserEntity(null,"alberto","io");
        UserEntity user2 = new UserEntity(null,"luiz","io");
        UserEntity user3 = new UserEntity(null,"aldaberto ","io");
        UserEntity user4 = new UserEntity(null,"jamais ","io");
        UserEntity user5 = new UserEntity(null,"outro","io");
       userRepository.saveAll(Arrays.asList(user,user1,user2,user3,user4,user5));

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) messageRepository.save(new MessageEntity(null,i + "jsjsjjsjs",user, user1));
            else messageRepository.save(new MessageEntity(null,i + "bbbsbbsbsbs",user1, user));
            i++;
        }

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) messageRepository.save(new MessageEntity(null,i + "jsjsjjsjs",user, user2));
            else messageRepository.save(new MessageEntity(null,i + "bbbsbbsbsbs",user2, user));
            i++;
        }
    }


    }
