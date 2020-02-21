/*Crie uma classe Contato que possui dois atributos: nome e email do tipo String.
 *Crie outra classe, chamada Agenda, que possui um atributo contatos do tipo vetor de Contato. 
 *A classe Agenda deve conter um método para adicionar um novo contato em uma posição vazia do vetor,
 *outro método para buscar um contato (retorna uma instância de Contato) através do nome e, por fim,
 *um método para excluir um contato através do nome.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Agenda;
import entities.Contato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("Agenda:");
		
		Agenda agenda=new Agenda();
		
		char opcao='s';
		
		while(opcao!='n') {
			System.out.print("Digite uma das opcoes(0-adicionar contato,1-remover contato,2-procurar contato): ");
			int opcoes= sc.nextInt();
			switch(opcoes){
				case 0:
					System.out.print("Digite o nome:");
					String nomeAdd=sc.next();
					System.out.print("Digite o email:");
					String email=sc.next();
					agenda.adicionarContato(new Contato(nomeAdd, email));
					break;
					
				case 1:
					System.out.print("Digite um nome:");
					String nomeRem=sc.next();
					agenda.removerContato(nomeRem);
					
					break;
				case 2:
					System.out.print("Digite um nome:");
					String nomeProcura=sc.next();
					Contato achou=agenda.procuraContato(nomeProcura);
					if(achou==null) {
						System.out.println("Contato não encontrado");
					}
					else {
						System.out.println(achou.getEmail());
					}
					
					break;
				default:
					System.out.println("Opcao invalida:");
					
			}
			System.out.print("Deseja continuar(s/n):");
			opcao=sc.next().charAt(0);
		}
		
		sc.close();
	}

}
