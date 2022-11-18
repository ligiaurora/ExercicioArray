package ExercicioArray;

import java.util.List;



public class Main {
	
	public static void main(String[] args) {
		ListaPessoas l = new ListaPessoas();
		
		Pessoa p = new Pessoa("Pessoa", "pessoa@gmail.com.br");
		
		l.add(p);
		
		 p = new Pessoa("Lara", "Bisteka_Lara@gmail.com.br");
		
		l.add(p);
		
		List<Pessoa> lista = l.getLista();
		for(Pessoa item: lista) {
			System.out.println(item.toString());
		}
	}

}
