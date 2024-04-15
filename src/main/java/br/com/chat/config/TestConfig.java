package br.com.chat.config;

import br.com.chat.entity.UserEntity;
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



    @Override
    public void run(String... args) throws Exception {
       UserEntity user = new UserEntity(null,"pedro","io");
        UserEntity user1 = new UserEntity(null,"pedro","io");
        UserEntity user2 = new UserEntity(null,"pedro","io");
        UserEntity user3 = new UserEntity(null,"pedro","io");
        UserEntity user4 = new UserEntity(null,"pedro","io");
        UserEntity user5 = new UserEntity(null,"pedro","io");
       userRepository.saveAll(Arrays.asList(user,user1,user2,user3,user4,user5));


    }


    }
