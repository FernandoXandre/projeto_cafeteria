package br.senac.ads.service;

import br.senac.ads.model.ItemPedido;
import br.senac.ads.model.Produto;

import java.util.ArrayList;
import java.util.List;
public class ItemPedidoService {
	
	private List<ItemPedido> itensPedido = new ArrayList<>();
	
	public void adicionarItem(int idPedido, Produto produto, int quantidade) {
		
		if(quantidade <=0) {
			System.out.println("Quantidade inválida");
			return;
			
		}
		
		double precoUnitario = produto.getPreco();
		
		ItemPedido item = new ItemPedido(idPedido, produto, quantidade, precoUnitario);
		
		itensPedido.add(item);
		
		System.out.println("O pedido foi efetuado");
	}
		
		public void listarItensPedido(int idPedido) {
			
			boolean encontrou = false;
			
			for (ItemPedido item : itensPedido) {
				
				if (item.getIdPedido() == idPedido) {
					item.exibirItemPedido();
					encontrou = true;
				}
			}
			if (!encontrou) {
				System.out.println("Nenhum item foi encontrado");
			}
	}
		
		
	public double calcularTotalPedido(int idPedido) {
		double total = 0;
		
		for(ItemPedido item: itensPedido) {
			
			if(item.getIdPedido() == idPedido) {
				
				total +=item.calcularSubtotal();
			}
		}
		return total;
	}
	
	
	
		
}
