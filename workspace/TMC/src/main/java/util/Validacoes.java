package util;


public class Validacoes {
	public boolean ehNullOuVazio(String a){
		if(a =="" || a == null)
			return true;
		return false;
	}
	
	public boolean ehNullOuVazio(Number a){
		if(a == null)
			return true;
		return false;
	}

}
