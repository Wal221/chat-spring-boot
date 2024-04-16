package br.com.chat.service;

import br.com.chat.entity.MessageEntity;
import br.com.chat.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chat.repository.MessageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MenssegerService {
	@Autowired
    private MessageRepository messageRepository;
    public MessageEntity createMessage(MessageEntity entity) {
        return messageRepository.save(entity);
    }
    public List<MessageEntity> findAllMessagem() {
        return messageRepository.findAll();
    }
    public MessageEntity getById(Long id) {
        return messageRepository.getReferenceById(id);
    }
    public void deleteById(Long id) {
        messageRepository.deleteById(id);
    }

	

}
