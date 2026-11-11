package br.com.unipds.javapuzzles.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainClass {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String linhaBase = "Esta é uma linha para exemplo de benchmark de leitura de arquivo";
        long tamanho = 200L * 1024 * 1024;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            long tamanhoAtual = 0L;
            while (tamanhoAtual < tamanho) {
                writer.write(linhaBase);
                tamanhoAtual += linhaBase.getBytes().length;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
