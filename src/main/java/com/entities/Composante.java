package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Composante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany(mappedBy = "est_Rattache_A")
    private List<Responsable> responsables;

    private String nomComposante;

    @OneToMany(mappedBy = "depend_De")
    private List<Filiere_Langue> filiere_langueList;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}



	public List<Responsable> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public String getNomComposante() {
		return nomComposante;
	}

	public void setNomComposante(String nomComposante) {
		this.nomComposante = nomComposante;
	}

	public List<Filiere_Langue> getFiliere_langueList() {
		return filiere_langueList;
	}

	public void setFiliere_langueList(List<Filiere_Langue> filiere_langueList) {
		this.filiere_langueList = filiere_langueList;
	}
}
