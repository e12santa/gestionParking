package com.pgrsoft.gestionparking.services.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.services.PlazaServices;

@RestController
public class PlazasController {
	
	@Autowired
	private PlazaServices plazaServices;
	
	@RequestMapping("/plazas")
	public List<Plaza> getPlazasByDate(@RequestParam(value = "desde", required = true) String strDesde, 
									   @RequestParam(value = "hasta", required = true) String strHasta) {
		/*if (strDesde != null && strHasta != null) {
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			Date desde = sdf.format(strDesde);
			Date hasta = sdf.format(strHasta);
		}
		return plazaServices.getDisponibles(desde, hasta);*/
		return null;
	}

}
