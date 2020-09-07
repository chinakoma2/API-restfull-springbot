package com.example.TesteRec.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.TesteRec.entities.Tache;



@Repository
public interface TacheRepository extends JpaRepository<Tache, Long>{

	
    @Query("SELECT month(t.date) , COUNT(t) FROM Tache t WHERE year(t.date) = :annee AND t.statut ='EN PRÉPA' GROUP BY month(t.date)")
	public int[][] VolumeTachesParMois(@Param("annee") int annee);
    

}
