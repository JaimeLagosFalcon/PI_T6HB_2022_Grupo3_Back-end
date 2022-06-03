package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Departamento;
import com.example.entity.Edificio;
import com.example.entity.Mascota;
import com.example.entity.Propietario;
import com.example.entity.Usuario;
import com.example.entity.Visitante;
import com.example.services.DepartamentoService;
import com.example.services.EdificioService;
import com.example.services.MascotaService;
import com.example.services.PropietarioService;
import com.example.services.UsuarioService;
import com.example.services.VisitanteService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilsController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EdificioService edificioService;
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private MascotaService mascotaService;
	
	@Autowired
	private VisitanteService visitanteService;
	
	//  Combo Box Usuario para Formulario Departamento, Propietario, Visitante
	@GetMapping("/usuario")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listaUsuario(){
		List<Usuario> listau = usuarioService.listaUsuario();
		return ResponseEntity.ok(listau);
	}
	
//  Combo Box Edificio para Formulario Departamento 
	@GetMapping("/edificio")
	@ResponseBody
	public ResponseEntity<List<Edificio>> listaEdificio(){
		List<Edificio> listae = edificioService.listaEdificio();
		return ResponseEntity.ok(listae);
	}
	
//	Combo Box Propietario para Formulario Mascota, Visitante	
	@GetMapping("/propietario")
	@ResponseBody
	public ResponseEntity<List<Propietario>> listaPropietario(){
		List<Propietario> listap = propietarioService.listaPropietario();
		return ResponseEntity.ok(listap);
	}
	
// Combo Box Departamento para Formulario Mascota, Propietario
	@GetMapping("/departamento")
	@ResponseBody
	public ResponseEntity<List<Departamento>> listaDepartamento(){
		List<Departamento> listad = departamentoService.listaDepartamento();
		return ResponseEntity.ok(listad);
	}
	
	
	//Lista de Mascota para la Tabla M. en el Formulario M.
    @GetMapping("/mascota")
    @ResponseBody
    public ResponseEntity<List<Mascota>> listaMascota(){
        List<Mascota> listam = mascotaService.listaMascota();
        return ResponseEntity.ok(listam);
    }

	//Combo Box Visitante para Formulario Visita
    @GetMapping("/visitante")
    @ResponseBody
    public ResponseEntity<List<Visitante>> listaVisitante(){
        List<Visitante> listav = visitanteService.listaVisitante();
        return ResponseEntity.ok(listav);
    }
}
