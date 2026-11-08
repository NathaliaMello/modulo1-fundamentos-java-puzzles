package br.com.unipds.javapuzzles.optional;

import br.com.unipds.javapuzzles.Produto;

public class MainClass  {
    public static void main(String[] args) {
        ProdutoRepo repo = new ProdutoRepo();

        Produto p1 = repo.findProdutoById(100).orElse(new Produto(-1, "Produto inexistente", 0));
        System.out.println("Produto 1: " + p1.getNome());

        Produto p2 = repo.findProdutoById(100).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        System.out.println("Produto 2: " + p2.getNome());
    }

}
