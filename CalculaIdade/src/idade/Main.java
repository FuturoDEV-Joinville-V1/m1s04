package idade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Digite sua data de nascimento no formato: dd/mm/aaaa");

        Scanner entrada = new Scanner(System.in);

        String dataNascimentoStr = entrada.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        int diaNascimento = dataNascimento.getDayOfMonth();
        int mesNascimento = dataNascimento.getMonthValue();
        int anoNascimento = dataNascimento.getYear();

        int idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento) {
            idade--;
        } else if (mesAtual == mesNascimento) {
            if (diaAtual < diaNascimento) {
                idade--;
            }
        }

        System.out.println("idade: " + idade);
    }
}