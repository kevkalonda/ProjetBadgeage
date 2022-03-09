package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String intitule;

    @ManyToMany(mappedBy = "participe_A", fetch = FetchType.LAZY)
    private List<Vacataire> vacataireList;


    @ManyToMany(mappedBy = "coursList", fetch = FetchType.LAZY)
    private List<Filiere_Langue> filiere_langueList;

    @OneToMany(mappedBy = "cours")
    private List<Creneau> creneauList;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public List<Vacataire> getVacataireList() {
		return vacataireList;
	}

	public void setVacataireList(List<Vacataire> vacataireList) {
		this.vacataireList = vacataireList;
	}

	public List<Filiere_Langue> getFiliere_langueList() {
		return filiere_langueList;
	}

	public void setFiliere_langueList(List<Filiere_Langue> filiere_langueList) {
		this.filiere_langueList = filiere_langueList;
	}

	public List<Creneau> getCreneauList() {
		return creneauList;
	}

	public void setCreneauList(List<Creneau> creneauList) {
		this.creneauList = creneauList;
	}

}
