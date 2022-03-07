package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Filiere_Langue {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@OneToOne
	private Composante composante;
	
	private String codeFiliereLangue;
	private String nomFiliereLangue;
	
	@ManyToMany
    private List<Cours> cours;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Composante getComposante() {
		return composante;
	}
	public void setComposante(Composante composante) {
		this.composante = composante;
	}
	public String getCodeFiliereLangue() {
		return codeFiliereLangue;
	}
	public void setCodeFiliereLangue(String codeFiliereLangue) {
		this.codeFiliereLangue = codeFiliereLangue;
	}
	public String getNomFiliereLangue() {
		return nomFiliereLangue;
	}
	public void setNomFiliereLangue(String nomFiliereLangue) {
		this.nomFiliereLangue = nomFiliereLangue;
	}
	

}
