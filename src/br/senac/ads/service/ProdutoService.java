package br.senac.ads.service;

import java.util.ArrayList;
import java.util.List;

import br.senac.ads.model.Produto;

public class ProdutoService {
	
	List<Produto> listaProduto = new ArrayList<>();
	
	
	
	public void cadastrarProduto(String nomeProduto, double preco) {
		
		if(preco < 0) {
			System.out.println("O preco nao pode ser negativo");
			return;
		}
		
		if(nomeProduto == null) {
			System.out.println("O nome do produto nao pode ser em branco");
			return;
		}
		
		Produto novoProduto = new Produto(nomeProduto, preco);
		listaProduto.add(novoProduto);
		System.out.println("Produto cadastrado com sucesso !!!");
		
		return;
	}
	
	public void listarProduto() { 
		if(listaProduto.size() <= 0 ) {
			System.out.println("Lista vazia...");
			return;
		}
		
		listaProduto.forEach(produto -> System.out.println(produto));
		return;
	}
	
	public void atualizarProduto(int id, String nomeProduto, double preco) {
		if(preco < 0) {
			System.out.println("O preco nao pode ser negativo");
			return;
		}
		
		if(nomeProduto == null) {
			System.out.println("O nome do produto nao pode ser em branco");
			return;
		}
		
		Produto produtoAntigo = listaProduto.get(id);
		
		produtoAntigo.setNome(nomeProduto);
		produtoAntigo.setPreco(preco);
		
		listaProduto.set(id, produtoAntigo);
		
		System.out.println("Produto editado com sucesso !!!");
		return;
	}
	
	public void removerProduto(int id) {
		
		Produto produtoEncontrado = null;
		
		for (Produto p : listaProduto) {
		    if (p.getId() == id) {
		        produtoEncontrado = p;
		        break; 
		    }
		}
		
		if(produtoEncontrado == null) {
			System.out.println("Produto nao encontrado...");
			return;
		}
		
		listaProduto.remove(id);
		
	}

}
