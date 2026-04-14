package br.fiap.navio;

import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;

//CLASSE VIAGEM
public class Navio {
    private double capacidade;
    private int index;
    private Carga[] carga;

    public Navio() {
        this.capacidade = 10000;
        this.carga = new Carga[20];

    }

    public boolean reservar(Carga carga) {
        if (index < this.carga.length) {
            if (permitidoReservar(carga.getPeso())) {
                this.carga[index] = carga;
                index++;
                return true;
            }
        }
        return false;
    }

    public double capacidadeReservada() {
        return capacidadeReservada();
    }

    public boolean permitidoReservar(double peso) {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += carga[i].getPeso();
        }
        return (total + peso) <= capacidade;
    }

    public String getNavio() {
        return getNavio();
    }

    public String getDados() {
        String aux = "";
        for (int i = 0; i < index; i++) {
            aux += carga[i].getDados();
            aux+="~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~";
        }
        return aux;
    }
}
