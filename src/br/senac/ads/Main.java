package br.senac.ads;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ---------------------------------------------------
        // CRIAÇÃO DO OBJETO SCANNER
        // ---------------------------------------------------
        // O Scanner será utilizado para ler dados digitados
        // pelo usuário no terminal.

        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------
        // VARIÁVEL QUE ARMAZENA A OPÇÃO DO MENU
        // ---------------------------------------------------
        int opcao = -1;

        // ---------------------------------------------------
        // LOOP PRINCIPAL DO SISTEMA
        // ---------------------------------------------------
        // O sistema continuará executando até o usuário
        // escolher a opção de sair.

        while (opcao != 0) {

        	try {
		            // ---------------------------------------------------
		            // EXIBIÇÃO DO MENU PRINCIPAL
		            // ---------------------------------------------------
		
		            System.out.println("\n===== SISTEMA DE PEDIDOS - CAFETERIA =====");
		            System.out.println("1 - Gerenciar Clientes");
		            System.out.println("2 - Gerenciar Produtos");
		            System.out.println("3 - Gerenciar Pedidos");
		            System.out.println("4 - Gerenciar Itens do Pedido");
		            System.out.println("0 - Sair");
		            System.out.print("Escolha uma opção: ");
		
		            // Leitura da opção digitada
		            opcao = scanner.nextInt();
		
		            // ---------------------------------------------------
		            // PROCESSAMENTO DA OPÇÃO ESCOLHIDA
		            // ---------------------------------------------------
		
		            switch (opcao) {
		
		                case 1:
						// --- PASSO 2: Implementar o teste de Cadastro e Listagem ---
                        	System.out.println("\n--- Cadastro de Cliente ---");
                        	System.out.print("Digite o ID: ");
                        	int id = scanner.nextInt();
                        	scanner.nextLine(); // Limpar o buffer do teclado

                        	System.out.print("Digite o Nome: ");
                        	String nome = scanner.nextLine();

                        	System.out.print("Digite o Telefone: ");
                        	String telefone = scanner.nextLine();

                        // Chama a função de cadastrar que criamos em lista
                        	clienteService.cadastrarCliente(id, nome, telefone);

                        // Exibe a lista logo após para conferirmos o resultado
                        	System.out.println("\n--- Clientes no Sistema ---");
                        	clienteService.listarClientes();
		                    break;
		
		                case 2:
		                    // Menu de produtos
		                    // Aqui futuramente serão feitas chamadas
		                    // para as funções relacionadas a produtos
		                    break;
		
		                case 3:
		                    // Menu de pedidos
		                    // Aqui futuramente serão feitas chamadas
		                    // para as funções relacionadas a pedidos
		                    break;
		
		                case 4:
		                    // Menu de itens do pedido
		                    // Aqui futuramente serão feitas chamadas
		                    // para as funções relacionadas aos itens
		                    break;
		
		                case 0:
		                    // Encerramento do sistema
		                    System.out.println("\nEncerrando o sistema...");
		                    break;
		
		                default:
		                    // Caso o usuário digite uma opção inválida
		                    System.out.println("\nOpção inválida!");
		            }
	                    
	            }catch (InputMismatchException e) {
	            	// Caso o usuário digite uma opção inválida
                    System.out.println("\nOpção inválida!");
				}catch (Exception e) {
					System.out.println("\nErro inesperado!");
				}
        	
        }
        
		// ---------------------------------------------------
        // FECHAMENTO DO SCANNER
        // ---------------------------------------------------

        scanner.close();

        
    }

}
