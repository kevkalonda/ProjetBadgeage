package com.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Creneau {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;	
	private LocalDate date;	
	private Long duree;	
	private String type;
	
	@OneToOne
	private Cours cours;
	
	@OneToMany(mappedBy = "creneau")
    private List<Seance_Formation> seanceformation;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getDuree() {
		return duree;
	}

	public void setDuree(Long duree) {
		this.duree = duree;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
