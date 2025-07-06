package br.com.unipds.javapuzzles.heranca;

public class SimpsonMain {

    public static void main(String[] args) {
        Pai simpson = new Filho();
        System.out.println("Meu nome é: " + simpson.nome);
        System.out.println("Eu falo: " + simpson.frase);
    }

}
