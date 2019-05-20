package com.pgrsoft.gestionparking.services;

import java.util.Date;
import java.util.List;

import com.pgrsoft.gestionparking.model.Plaza;

public interface PlazaServices {
	
	public List<Plaza> getDisponibles(Date desde, Date hasta);
	
	public List<Plaza> getNoDisponibles(Date desde, Date hasta);

}
