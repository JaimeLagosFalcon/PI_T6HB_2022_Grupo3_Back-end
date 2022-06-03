package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Visitante;
import com.example.repository.VisitanteRepository;

@Service
public class VisitanteImpl implements VisitanteService{

	@Autowired
	VisitanteRepository repositoryV;
	
	@Override
	public Visitante inserta(Visitante obj) {
	
		return repositoryV.save(obj);
	}

	@Override
	public List<Visitante> listaVisitante() {
	
		return repositoryV.findAll();
	}

	@Override
	public List<Visitante> listaVisitantePorDNI(String dni) {
		// TODO Auto-generated method stub
		return repositoryV.listaVisitantePorDNI(dni);
	}

	@Override
	public Boolean ValidateByDNI(String dni) {
		// TODO Auto-generated method stub
		List<Visitante> obj=repositoryV.listaVisitantePorDNI(dni);
		
		Boolean status=false;
		
		if(obj.size()>0) status=true;
		
		
		return status;
	}
}
