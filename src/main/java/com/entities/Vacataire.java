package com.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("V")
public class Vacataire extends Utilisateur{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne
	private Cours cours;
	
	@OneToMany(mappedBy = "vacataire")
    private List<Seance_Formation> seanceformation;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public List<Seance_Formation> getSeanceformation() {
		return seanceformation;
	}

	public void setSeanceformation(List<Seance_Formation> seanceformation) {
		this.seanceformation = seanceformation;
	}
	
}
