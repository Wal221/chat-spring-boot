package br.com.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.entity.MessageEntity;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
   
}
