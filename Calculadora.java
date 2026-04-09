package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;

        int soma = numero1 - numero2;
        int subtracao = numero1 + numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 * numero2;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        if (numero1 < numero2) {
            System.out.println("Número 1 é maior que Número 2");
        }
        else {
            System.out.println("Número 2 é maior que Número 1");
        }

    }
}