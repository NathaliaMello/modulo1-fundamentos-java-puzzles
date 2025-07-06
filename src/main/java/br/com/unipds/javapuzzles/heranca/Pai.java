package br.com.unipds.javapuzzles.heranca;

class Pai {

    String nome;
    String frase;

    Pai() {
        this.nome = "Homer";
        this.frase = "D'oh";
        this.fala();
    }

    void fala() {
        System.out.println(this.nome + ":" + this.frase);
    }
}
