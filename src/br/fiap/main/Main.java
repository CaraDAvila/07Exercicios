package br.fiap.main;

import br.fiap.cliente.Cliente;
import br.fiap.util.Util;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "johndoe");
        new Util().menu();

    }
}
