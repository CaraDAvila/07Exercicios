package br.fiap.util;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.navio.Navio;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    private Navio navio = new Navio();

    public void menu() {
        int opcao;
        do {
            String aux = "Reserva de cargas  Boa Viagem\n";
            aux += "[1] Reservar\n";
            aux += "[2] Pesquisar\n";
            aux += "[3] Exibir\n";
            aux += "[4] Capacidade reservada\n";
            aux += "[5] Cancelar reserva\n";
            aux += "[6] FINALIZAR\n";

            opcao = parseInt(showInputDialog(aux));

            if (opcao < 1 || opcao > 6) {
                showMessageDialog(null, "OPÇÃO INVÁLIDA");
            } else {
                switch (opcao) {
                    case 1 -> reservar();
                    case 3 -> exibir();
                    case 6 -> showMessageDialog(null, "até breve");
                }
            }
        } while (opcao != 6);
    }

    private void exibir() {
        showMessageDialog(null, navio.getDados());
    }

    private void reservar() {
        String destino, nomeCliente;
        int cnpj;
        cnpj = parseInt(showInputDialog("CNPJ: "));
        destino = showInputDialog("Destino: ");
        nomeCliente = showInputDialog("Cliente: ");
        Cliente cliente = new Cliente(cnpj, nomeCliente);
        Carga carga = new Carga(destino, cliente);

        if (navio.reservar(carga)) {
            showMessageDialog(null, "Carga reservada");
        } else {
            showMessageDialog(null, "PROBLEMAS AO RESERVAR");
        }
    }
}
