package com.pgrsoft.gestionparking.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.repositories.PlazaRepository;
import com.pgrsoft.gestionparking.repositories.ReservaRepository;
import com.pgrsoft.gestionparking.services.PlazaServices;

@Service
public class PlazaServicesImpl implements PlazaServices {
	
	@Autowired
	private PlazaRepository plazaRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;

	@Override
	public List<Plaza> getDisponibles(Date desde, Date hasta) {
		
		List<Plaza> totalPlazas = plazaRepository.findAll();
		
		List<Plaza> plazasOcupadas = new ArrayList<>();
		
		for(Object objectPlaza: reservaRepository.findReservasByRange(desde, hasta)) {
			Plaza plaza = (Plaza) objectPlaza;
			plazasOcupadas.add(plaza);
		}
		
		totalPlazas.removeAll(plazasOcupadas);
		
		totalPlazas.removeIf(x -> !x.isDisponible());
		
		return totalPlazas;
	}

	@Override
	public List<Plaza> getNoDisponibles(Date desde, Date hasta) {
		// TODO Auto-generated method stub
		return null;
	}

}
