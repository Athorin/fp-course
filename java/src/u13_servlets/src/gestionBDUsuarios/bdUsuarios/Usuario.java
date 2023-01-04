public class Usuario {
	
	private String nombre;
	private String password;
	private String email;
	
	
	public Usuario(){
		nombre = password = email = null;
	}
	public Usuario(String n, String p, String e){
		setNombre(n);
		setPassword(p);
		setEmail(e);
	}
	
	
	public void setNombre(String n){
		nombre = new String (n);
	}
	public void setPassword(String p){
		password = new String (p);
	}
	public void setEmail(String e){
		email = new String(e);
	}
	
	
	public String getNombre(){
		return this.nombre;
	}
	public String getPassword(){
		return this.password;
	}
	public String getEmail(){
		return this.email;
	}
}
