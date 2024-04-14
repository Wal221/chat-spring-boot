package br.com.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.entity.MenssegerEntity;

public interface MenssegerRepository extends JpaRepository<MenssegerEntity, Long> {
   
}
