package com.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("R")

public class Responsable extends Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne
	private Composante composante;

}
