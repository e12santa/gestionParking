package com.pgrsoft.gestionparking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "RESERVAS")
public class Reserva {

	@Id
	@Column(name = "ID_RESERVA")
	@TableGenerator(name = "RESERVA_GENERATOR",
					table = "SECUENCIAS", 
					pkColumnName = "SEQ_NAME",
					pkColumnValue = "RESERVA_SEQ",
					valueColumnName = "SEQ_NUMBER",
					allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.TABLE,
					generator = "RESERVA_GENERATOR")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "ID_PLAZA")
	private Plaza palza;
	
	@Column(name = "FECHAINICIO")
	private Date inicio;
	
	@Column(name = "FECHAFIN")
	private Date fin;
	
	public Reserva() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Plaza getPalza() {
		return palza;
	}

	public void setPalza(Plaza palza) {
		this.palza = palza;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}
	
	
}
