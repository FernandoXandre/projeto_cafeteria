package br.senac.ads.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.senac.ads.model.Cliente;
import br.senac.ads.model.Pedido;

public class PedidoService {

    private static List<Pedido> pedidos = new ArrayList<>();

    public static void criarPedido(int id, Cliente cliente) {

        String dataAtual = new Date().toString();

        Pedido pedido = new Pedido(id, cliente, dataAtual);
        pedidos.add(pedido);

        System.out.println("Pedido criado com sucesso!");
    }

   
    public static void listarPedidos() {

        for (Pedido p : pedidos) {

            System.out.println("ID Pedido: " + p.getId());
            System.out.println("ID Cliente: " + p.getCliente());
            System.out.println("Data: " + p.getData());
            System.out.println("----------------------");

        }

    }

    public static Pedido buscarPedido(int id) {

        for (Pedido p : pedidos) {

            if (p.getId() == id) {
                return p;
            }

        }

        return null;
    }

    public static void cancelarPedido(int id) {

        Pedido pedido = buscarPedido(id);

        if (pedido != null) {

            pedidos.remove(pedido);
            System.out.println("Pedido cancelado com sucesso!");

        } else {

            System.out.println("Pedido não encontrado.");

        }

    }

}