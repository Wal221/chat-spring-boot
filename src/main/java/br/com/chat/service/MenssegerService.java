package br.com.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chat.repository.MessageRepository;

@Service
public class MenssegerService {
	@Autowired
    private MessageRepository messageRepository;
	

}
