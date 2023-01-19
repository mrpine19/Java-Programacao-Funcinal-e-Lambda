package Exercicios.Resolvido.application;

import Exercicios.Resolvido.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream() //CRIAÇÃO DO PIPE
                    .filter(p -> p.getPrice() < avg)// PEGA TODOS OS PRODUTOS QUE TEM PREÇO MENOR QUE A MÉDIA
                    .map(p -> p.getName()) // DEFINE A FUNÇÃO PEGANDO TODOS OS NOMES DESSE PRODUTO
                    .sorted(comp.reversed()) // PRODUTOS EM ORDEM DECRESCENTE ALFABÉTICA
                    .collect(Collectors.toList()); // CONVERTE PARA LISTA

            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
