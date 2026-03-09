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
	                    // Menu de clientes
	                    // Aqui futuramente serão feitas chamadas
	                    // para as funções relacionadas a clientes
	                    break;
	
	                case 2:
	                    // Menu de produtos
	                    // Aqui futuramente serão feitas chamadas
	                    // para as funções relacionadas a produtos
	                    break;
	
	                case 3:
	                  case 3:

                        int opcaoPedido;

                        System.out.println("\n===== MENU PEDIDOS =====");
                        System.out.println("1 - Criar pedido");
                        System.out.println("2 - Listar pedidos");
                        System.out.println("3 - Buscar pedido");
                        System.out.println("4 - Cancelar pedido");
                        System.out.print("Escolha uma opção: ");

                        opcaoPedido = scanner.nextInt();

                        switch (opcaoPedido) {

                            case 1:

                                System.out.print("Digite o ID do pedido: ");
                                int idPedido = scanner.nextInt();

                                System.out.print("Digite o ID do cliente: ");
                                int idCliente = scanner.nextInt();

                                PedidoService.criarPedido(idPedido, idCliente);

                                break;

                            case 2:

                                PedidoService.listarPedidos();

                                break;

                            case 3:

                                System.out.print("Digite o ID do pedido: ");
                                int buscarId = scanner.nextInt();

                                if (PedidoService.buscarPedido(buscarId) != null) {
                                    System.out.println("Pedido encontrado!");
                                } else {
                                    System.out.println("Pedido não encontrado.");
                                }

                                break;

                            case 4:

                                System.out.print("Digite o ID do pedido para cancelar: ");
                                int cancelarId = scanner.nextInt();

                                PedidoService.cancelarPedido(cancelarId);

                                break;

                            default:
                                System.out.println("Opção inválida!");

                        }

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
				}finally {
					// ---------------------------------------------------
			        // FECHAMENTO DO SCANNER
			        // ---------------------------------------------------

			        scanner.close();
				}
        	
        }

        
    }

}
