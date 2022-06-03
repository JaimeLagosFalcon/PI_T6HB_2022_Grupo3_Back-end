package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer>{

	@Query("select m from Mascota m")
    public List<Mascota> ListaMascotas();
	
}
