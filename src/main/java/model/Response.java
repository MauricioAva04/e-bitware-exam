package model;

public class Response<T> {

	private String Cve_Error;
	private String Cve_Mensaje;
	private T resultset;

	public String getCve_Error() {
		return Cve_Error;
	}

	public void setCve_Error(String cve_Error) {
		Cve_Error = cve_Error;
	}

	public String getCve_Mensaje() {
		return Cve_Mensaje;
	}

	public void setCve_Mensaje(String cve_Mensaje) {
		Cve_Mensaje = cve_Mensaje;
	}

	public T getResultset() {
		return resultset;
	}

	public void setResultset(T resultset) {
		this.resultset = resultset;
	}

}
