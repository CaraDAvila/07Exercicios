package br.fiap.cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "johndoe");
        System.out.println(cliente.getCliente());

        cliente.setCliente("joe doe");
        System.out.println(cliente.getCliente());
    }
}
