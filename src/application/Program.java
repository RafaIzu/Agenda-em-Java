/*Crie uma classe Contato que possui dois atributos: nome e email do tipo String.
 *Crie outra classe, chamada Agenda, que possui um atributo contatos do tipo vetor de Contato. 
 *A classe Agenda deve conter um m�todo para adicionar um novo contato em uma posi��o vazia do vetor,
 *outro m�todo para buscar um contato (retorna uma inst�ncia de Contato) atrav�s do nome e, por fim,
 *um m�todo para excluir um contato atrav�s do nome.*/

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
						System.out.println("Contato n�o encontrado");
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
