package com.demo;

import com.dtos.GestionnaireDto;
import com.dtos.ResponsableDto;
import com.entities.Seance_Formation;
import com.services.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class DemoApplicationTests {

	GestionnaireServiceImpl gestionnaireService;
	ResponsableServiceImpl responsableService;
	VacataireServiceImpl vacataireService;
	Seance_FormationServiceImpl seance_formationService;
	Filiere_LangueServiceImpl filiere_langueService;
	CreneauServiceImpl creneauService;
	CoursServiceImpl coursService;
	ComposanteServiceImpl composanteService;
	@Test
	void addGestionnaire() {
		GestionnaireDto gestionnaireDto = new GestionnaireDto();
		gestionnaireDto.setId(null);
		gestionnaireDto.setPrenom("Clement");
		gestionnaireDto.setNomUsuel("Lumwanga");
		gestionnaireDto.setMail("clementLumwanga@gmail.com");
		gestionnaireDto.setLogin("clLumwanga");
		gestionnaireDto.setMotDePasse("1234");
		//System.out.println(gestionnaireDto.toString());
		gestionnaireService.enregistrerGestionnaire(gestionnaireDto);
	}
	@Test
	void add(){

	}


}
