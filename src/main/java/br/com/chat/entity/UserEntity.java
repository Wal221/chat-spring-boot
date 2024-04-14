package br.com.chat.entity;

import java.io.Serial;
import java.io.Serializable;
import java.security.Timestamp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O nome do usuario não pode ser nulo")
	@NotBlank(message = "O nome do usuario não pode ser vazio/em branco")
	private String name;

	// ainda verifica se e necessario ter uma foto de perfil e obrigatoia
	private String imgUrl;
	@NotNull(message = "O visto por ultimo não pode ser nulo")
	private Timestamp vistoPorUltimo;

	public UserEntity() {
		
	}

	public UserEntity(String name, String imgUrl, Timestamp vistoPorUltimo) {
	
		this.name = name;
		this.imgUrl = imgUrl;
		this.vistoPorUltimo = vistoPorUltimo;
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
