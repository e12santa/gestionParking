package com.pgrsoft.gestionparking.services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.model.Reserva;
import com.pgrsoft.gestionparking.model.Usuario;
import com.pgrsoft.gestionparking.repositories.PlazaRepository;
import com.pgrsoft.gestionparking.repositories.ReservaRepository;
import com.pgrsoft.gestionparking.repositories.UsuarioRepository;

@RestController
public class RepositoriesTestController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PlazaRepository plazaRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	@RequestMapping("/testusuarios")
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@RequestMapping("/testplazas")
	public List<Plaza> getPlazas(){
		return plazaRepository.findAll();
	}
	
	@RequestMapping("/testreservas")
	public List<Reserva> getReservas(){
		return reservaRepository.findAll();
	}
	
}
