package br.com.unipds.javapuzzles.reflection;

import br.com.unipds.javapuzzles.Cliente;
import br.com.unipds.javapuzzles.Produto;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Produto p = new Produto(1, "Produto 1", 10.0);
        Cliente c = new Cliente(1, "Cliente 1", "123.456.789-00", "cliente@cliente.com");

        System.out.println("---> Produto");
        ClassExplorer.exploreMetadata(p);
        System.out.println("---> Cliente");
        ClassExplorer.exploreMetadata(c);
    }
}
