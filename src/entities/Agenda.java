package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List <Contato> contatos=new ArrayList<>();
	
	
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
		
	}
	
	public void procuraContato(String nome) {
		
		System.out.println("Gay");

		
		
	}
	
	
	public void removerContato(String nome) {
		for (Contato e: contatos) {
			if (e.getNome()==nome) {
				contatos.remove(e);
			}
		}
	}
	

		
	}
	
	

		



		


