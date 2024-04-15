package br.com.chat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chat.entity.UserEntity;
import br.com.chat.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity create(UserEntity entity) {
		return userRepository.save(entity);
	}

	public List<UserEntity> findAllUsers() {
		return userRepository.findAll();
	}

	public UserEntity getById(Long id) {
		return userRepository.getReferenceById(id);
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	public UserEntity updateUser(UserEntity user) {
		Optional<UserEntity> userEntity = userRepository.findById(user.getId());

		if (userEntity.isPresent()) {
			UserEntity usuario = new UserEntity();
			usuario.setName(user.getName());
			usuario.setImgUrl(user.getImgUrl());

			return userRepository.save(usuario);
		} else {
			return null;
		}

	}

	public void updateVistoPorUltimoById(Long id){
		userRepository.updateVistoPorUltimoById(id);
	}
}
