package dominio;

/* Esta clase contiene los atributos y metodos */


public class Coche {
	//atributos

	private String color;
	private String marca;
	private int matricula;
	private int plazas;

	/**
	 * Metodo constructores por defecto
	 */

	public Coche () {

	}

	public Coche (String color, String marca, int matricula, int plazas){
		this.color = color;
		this.matricula = matricula;
		this.plazas = plazas;
		this.marca = marca;
	}
		

	/**
	 * Metodo constructor parmetrizado
	 * @param color Color del coche
	 * @param matricula Matricula del coche
	 * @param plazas Plazas del coche
	 * @param marca Marca del coche
	 */


	/**
	 * Metodo para regresar un dato
	 * @return Color del coche
	 * @return Matricula del coche
	 * @return Plazas del coche
	 * @return Marca del coche
	 */

	public String getColor ()	{
		return this.color;
	}

	public int getMatricula () {
		return this.matricula;
	}

	public int getPlazas() {
		return this.plazas;
	}

	public String getMarca(){
		return this.marca;
	}

	/** 
	 * Metodo que asigna datos 
	 * @param  color Color del coche
	 * @param  matricula Matricula del coche
	 * @param  plazas Plazasa del coche
	 * @param  marca Marca del coche
	 */


	public void setColor (String color){
		this.color = color;
	}

	public void setMatricula (int matricula){
		this.matricula = matricula;
	}

	public void setPlazas (int plazas) {
		this.plazas = plazas;
	}

	public void setMarca (String marca){
		this.marca = marca;
	}









}