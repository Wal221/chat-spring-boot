package br.com.chat.entity;

import java.io.Serial;
import java.io.Serializable;
import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mensseger")
public class MenssegerEntity implements Serializable {
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Não pode haver envio de mensagem nula")
	@NotBlank(message="Não pode envia mensagens vazia")
	private String text;
	
	@NotNull
	private Timestamp dateTime;
	@NotNull
	private Boolean view;
	@NotNull
	
	@ManyToOne // muitas mensagen podem ser enviada por um usuario 
	private UserEntity userEnvia;
	
	@NotNull
	@ManyToOne // muitas mensagens podem ser recebidas por um usuario
	private UserEntity userRecebe;

	public MenssegerEntity() {
		super();
	}

	public Boolean getView() {
		return view;
	}

	public void setView(Boolean view) {
		this.view = view;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public UserEntity getUserEnvia() {
		return userEnvia;
	}

	public UserEntity getUserRecebe() {
		return userRecebe;
	}
	
	

}
