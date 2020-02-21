package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Agenda {
	
	List <Contato> contatos=new ArrayList<>();
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
		
	}
	
	public Contato procuraContato(String nome) {
		Contato achou=null;
		for(Contato e:contatos) {
			if(e.getNome().equals(nome)) {
				achou= e;
				
			}
		}
		return achou;
		
	}
	
	public void removerContato(String nome) {
		Contato achou=null;
		for(Contato e:contatos) {
			if(e.getNome().equals(nome)) {
				achou= e;		
			}
		}
		ListIterator<Contato>iterator=contatos.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(achou)) {
				iterator.remove();
			}
		}

	}
	
	}
	
	

		



		


