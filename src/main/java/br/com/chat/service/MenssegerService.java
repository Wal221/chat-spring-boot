package br.com.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chat.entity.UserEntity;
import br.com.chat.repository.MenssegerRepository;

@Service
public class MenssegerService {
	@Autowired
    private MenssegerRepository menssegerRepository;
	
	public MenssegerRepository menssegerUser(UserEntity user) {
		
	}
}
