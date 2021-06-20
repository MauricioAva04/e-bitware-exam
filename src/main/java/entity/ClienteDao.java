package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clientes", indexes = { @Index(name = "clientes_idx", columnList = "id", unique = true) })
public class ClienteDao {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Cliente_ID", unique = true, nullable = false, updatable = false)
	private Integer Cliente_ID;

	@NotNull
	@Column(name = "Nombre_Usuario", unique = true, nullable = false, updatable = false, columnDefinition = "varchar(30)")
	private String Nombre_Usuario;

	@NotNull
	@Column(name = "Constrasena", nullable = true, updatable = true, columnDefinition = "varchar(30)")
	private String Constrasena;

	@NotNull
	@Column(name = "Nombre", nullable = true, updatable = true, columnDefinition = "varchar(100)")
	private String Nombre;

	@Column(name = "Apellidos", nullable = true, updatable = true, columnDefinition = "varchar(100)")
	private String Apellidos;

	@Column(name = "Correo_Electronico", unique = true, nullable = true, updatable = true, columnDefinition = "varchar(100)")
	private String Correo_Electronico;

	@Column(name = "Edad", nullable = true, updatable = true)
	private Integer Edad;

	@Column(name = "Estatura", nullable = true, updatable = true)
	private Double Estatura;

	@Column(name = "Peso", nullable = true, updatable = true)
	private Double Peso;

	@Column(name = "IMC", nullable = true, updatable = true)
	private Double IMC;

	@Column(name = "GEB", nullable = true, updatable = true)
	private Double GEB;

	@Column(name = "ETA", nullable = true, updatable = true)
	private Double ETA;

	@Column(name = "Fecha_Creacion", nullable = true, updatable = true)
	private Date Fecha_Creacion;

	@Column(name = "Fecha_Actualizacion", nullable = true, updatable = true)
	private Date Fecha_Actualizacion;

	public Integer getCliente_ID() {
		return Cliente_ID;
	}

	public void setCliente_ID(Integer cliente_ID) {
		Cliente_ID = cliente_ID;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}

	public String getConstrasena() {
		return Constrasena;
	}

	public void setConstrasena(String constrasena) {
		Constrasena = constrasena;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public Double getEstatura() {
		return Estatura;
	}

	public void setEstatura(Double estatura) {
		Estatura = estatura;
	}

	public Double getPeso() {
		return Peso;
	}

	public void setPeso(Double peso) {
		Peso = peso;
	}

	public Double getIMC() {
		return IMC;
	}

	public void setIMC(Double iMC) {
		IMC = iMC;
	}

	public Double getGEB() {
		return GEB;
	}

	public void setGEB(Double gEB) {
		GEB = gEB;
	}

	public Double getETA() {
		return ETA;
	}

	public void setETA(Double eTA) {
		ETA = eTA;
	}

	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}

	public Date getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}

	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}

}
