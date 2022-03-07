package com.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("G")
public class Gestionnaire extends Utilisateur{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
}
