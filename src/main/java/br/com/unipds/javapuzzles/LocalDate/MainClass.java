package br.com.unipds.javapuzzles.LocalDate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainClass {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("Data Atual: " + dataAtual);
        System.out.println("Hora Atual: " + horaAtual);
        System.out.println("DataHora Atual: " + dataHoraAtual);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data Atual Formatado: " + dataAtual.format(dateFormat));

        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora Atual Formatado: " + horaAtual.format(hourFormatter));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("DataHora Atual Formatado: " + dataHoraAtual.format(dateTimeFormatter));

        String dataUsuario = "01/05/2025";
        LocalDate dataUsuarioFormatada = LocalDate.parse(dataUsuario, dateFormat);
        DateTimeFormatter outroFormato = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(dataUsuarioFormatada.format(outroFormato));

    }
}
