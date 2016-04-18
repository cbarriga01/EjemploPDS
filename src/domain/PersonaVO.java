package domain;

import java.util.Date;

public class PersonaVO {
	private String nombres;
	private String apellidos;
	private String rut;
	private Date f_nac;
	private String telefono;
	private String direccion;
	private String ciudad;
	private String email;
	private int activo;
	
	
	public PersonaVO() {
		super();
	}

	public PersonaVO(String nombres, String apellidos, String rut,
			Date f_nac, String telefono, String direccion, String ciudad,
			String email, int activo) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.f_nac = f_nac;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.email = email;
		this.activo = activo;
	}

	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Date getF_nac() {
		return f_nac;
	}

	public void setF_nac(Date f_nac) {
		this.f_nac = f_nac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
	
	

}
