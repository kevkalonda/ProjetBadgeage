package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Composante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nomComposante;
	
	@OneToMany(mappedBy = "composante")
    private List<Responsable> responsables;
	
	@OneToMany(mappedBy = "composante")
    private List<Filiere_Langue> filierelangues;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNomComposante() {
		return nomComposante;
	}

	public void setNomComposante(String nomComposante) {
		this.nomComposante = nomComposante;
	}

	public List<Responsable> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public List<Filiere_Langue> getFilierelangues() {
		return filierelangues;
	}

	public void setFilierelangues(List<Filiere_Langue> filierelangues) {
		this.filierelangues = filierelangues;
	}
	
	


	
	
}
