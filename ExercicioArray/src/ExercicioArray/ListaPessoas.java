package ExercicioArray;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
	
	private List<Pessoa> Lista = new ArrayList<Pessoa>();
	
	
	
	public List<Pessoa> getLista(){
		return Lista;
	}
	
	
	public List<Pessoa> setLista(){
		return Lista;
	}
	
	public  boolean add (Pessoa pessoa) {
		Lista.add(pessoa);
		return true; 
		
		
		//somente adicionar se o nome dele n�o for igual a um nome que j� tem na lista. tem que criar um outro metodo para ser chamado no metodo add (n�o permitir nomes iguais)
		//mostrar todos os emails pelo o dominio, mas sem repetir (buscar todos os dominios de e-mail
		//metodo de exclus�o, para excluir a pessoa(remover pelo nome)
		//fazer uma busca usando 'like' inicial do nome 
		// metodo para mostrar idade
		//buscar idade > ? (parametro)
		
	}

}

