package br.com.chat.entity;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O nome do usuario não pode ser nulo")
	@NotBlank(message = "O nome do usuario não pode ser vazio/em branco")
	private String name;

	private String imgUrl;

	private Timestamp vistoPorUltimo;

	public UserEntity() {
		
	}

	public UserEntity(Long id,String name, String imgUrl) {

		this.id= id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.vistoPorUltimo =  new Timestamp(System.currentTimeMillis());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public Timestamp getVistoPorUltimo() {
		return vistoPorUltimo;
	}
    
}
