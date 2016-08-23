public class Jugador {
	private int cantidad;
	private String nombre;
	
	public void setCantidad(int cant){
		this.cantidad=cant;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void setNombre(String nom){
		this.nombre=nom;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int jugar(Jugador j, int palosSacados, int palosQuedan){
		
		j.setCantidad(j.getCantidad() + palosSacados);
		
		return palosQuedan-palosSacados;
		
		
		
	}
}
