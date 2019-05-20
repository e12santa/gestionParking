package com.pgrsoft.gestionparking.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionparking.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
	
	public List<Reserva> findByInicioBetween(Date desde, Date hasta); //Retorna les reserves que comencen entre les dos dates
	
	public List<Reserva> findByFinBetween(Date desde, Date hasta); //Retorna les reserves que acaben entre les dos dates
	
	@Query("select r.palza from Reserva r "
			+ "where (r.inicio > :desde and r.inicio < :hasta) "
			+ "or (r.fin < :hasta and r.fin > :desde) "
			+ "or (r.inicio < :desde and r.fin > :hasta)")
	public List<Object[]> findReservasByRange(Date desde, Date hasta); //Retorna les places compreses en un rang

}
