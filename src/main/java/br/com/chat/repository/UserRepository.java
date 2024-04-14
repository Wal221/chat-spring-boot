package br.com.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
