package com.example.TesteRec.metier;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TesteRec.dao.TacheRepository;
import com.example.TesteRec.entities.Tache;
import com.example.TesteRec.entities.Volume;
import com.example.TesteRec.exception.ResourceNotFoundException;

@Service
@Transactional
public class HistoriqueMetierImpl  implements IHistoriqueMetier{
	
	@Autowired
	private TacheRepository tacheRepository;

	@Override
	public Page<Tache> listeTaches(int page,int size) {	
		return this.tacheRepository.findAll(PageRequest.of(page, size));
	}
	
	@Override
	public ResponseEntity<ArrayList<Volume>> VolumeTachesParMois(int annee) throws ResourceNotFoundException {
		

		
		//Initialisation à 0 d'un tableau qui contient comme paramètre [numéro du mois, volume des taches] 
		//et qui représente la courbe de volume de taches sur 12 mois
		ArrayList<Volume> courbevolumeTaches= new ArrayList<Volume>();
		for(int i =0;i<12;i++) {
			//Volume des taches initialise a 0
			courbevolumeTaches.add(new Volume(i,0));
		}
		
		int[][] volumeTaches = tacheRepository.VolumeTachesParMois(annee);
		
		if(volumeTaches.length == 0) {
			throw new ResourceNotFoundException("Aucune tâche trouvée pour l'année "+annee);
		}
		
		//Remplisage de la courbe par les infos recupuree de la base de données
		for(int i =0;i<volumeTaches.length;i++) {
			courbevolumeTaches.get(volumeTaches[i][0]-1).setValeur(volumeTaches[i][1]);
		}
		return ResponseEntity.ok().body(courbevolumeTaches);
	}
}
