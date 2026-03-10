package br.com.vini.mod07;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println("O seu código é: " + cliente.getCodigo());
       // System.out.println(cliente.getEndereco());
        cliente.imprirEndereco();
    }
}

