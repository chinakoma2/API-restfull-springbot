package com.example.TesteRec.metier;



import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.example.TesteRec.entities.Tache;
import com.example.TesteRec.entities.Volume;
import com.example.TesteRec.exception.ResourceNotFoundException;


public interface IHistoriqueMetier {

	public Page<Tache> listeTaches(int page,int size);
	public ResponseEntity<ArrayList<Volume>> VolumeTachesParMois(int annee) throws ResourceNotFoundException;
}
