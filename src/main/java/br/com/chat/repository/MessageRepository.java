package br.com.chat.repository;

import br.com.chat.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.entity.MessageEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

   
}
