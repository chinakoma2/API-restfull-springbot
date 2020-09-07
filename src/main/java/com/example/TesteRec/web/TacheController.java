package com.example.TesteRec.web;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TesteRec.entities.Tache;
import com.example.TesteRec.entities.Volume;
import com.example.TesteRec.exception.ResourceNotFoundException;
import com.example.TesteRec.metier.IHistoriqueMetier;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/historique/")
public class TacheController {

	@Autowired
	private IHistoriqueMetier  historiqueMetier;
	
	@GetMapping("/consulterTaches/{page}/{size}")
	public Page<Tache> consulterTaches(@PathVariable int page,@PathVariable int size) {
		return historiqueMetier.listeTaches(page,size);
	}
	
	@GetMapping("/volumetaches/{annee}")
	public ResponseEntity<ArrayList<Volume>> statistique(@PathVariable(value = "annee") int annee) throws ResourceNotFoundException {
		return historiqueMetier.VolumeTachesParMois(annee);
	}
}
