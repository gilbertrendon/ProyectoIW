package co.edu.udea.iw.dto;
/*
 * Clase dto para la tabla encuesta
 * @author LUIS FERNANDO OROZCO
 */

import java.io.Serializable;
import java.util.Date;

public class Encuesta implements Serializable{
	
	//atributos
	private int id;
	private String usuario;
	private int idPqr;
	private String descripcion;
	private Date fecha;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getIdPqr() {
		return idPqr;
	}
	public void setIdPqr(int idPqr) {
		this.idPqr = idPqr;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
