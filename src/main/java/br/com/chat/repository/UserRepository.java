package br.com.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE UserEntity u SET u.vistoPorUltimo = CURRENT_TIMESTAMP WHERE u.id = :id")
    void updateVistoPorUltimoById(Long id);

}
