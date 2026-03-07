package br.senac.ads.service;

import java.util.ArrayList;
import java.util.List;
import br.senac.ads.model.Cliente;


public class ClienteService {

    private List<Cliente> listaCliente = new ArrayList<>(); //isso cria a lista de clients

    //• cadastrar cliente
    public void cadastrarCliente(int id, String nome, String telefone) { //isso é pra definir oq precisa pra eu criar o cliente
        if (nome==null){ //se o cliente não tiver nome vai dar erro
            System.out.println("ERRO! Cliente não pode ser vazio!");
            return;
        }

        Cliente novoCliente = new Cliente(id, nome, telefone); //aqui to criando um cliente novo com os dados entre parenteses

        listaCliente.add(novoCliente);//atualizo a lista com o cliente

        System.out.println("Cliente Adicionado");
    }
    //• listar clientes cadastrados
    public void listarClientes (){ //pra cada cliente "c" dentro da lista de cliente
        for (Cliente c : listaCliente) {
            c.exibirCliente();
        }
    }

    //• buscar cliente pelo id
    public Cliente buscarClientePorId(int id){
        for (Cliente c : listaCliente){
            if(c.getId() == id ){
                return c;
            }

        }
        return null;
    }

    //• remover cliente pelo id
    public void removerClientePorId(int id){
        Cliente cliente = buscarClientePorId(id);

        if (cliente != null) {
            listaCliente.remove(cliente);
            System.out.println("Cliente removido, com sucesso");
        } else {
            System.out.println("Cliente não encontrado");
        }

    }
}
