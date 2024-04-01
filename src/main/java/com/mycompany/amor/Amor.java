package com.mycompany.amor;

import java.util.Locale;
import java.util.Scanner;

/*
Atributos / Características = oque ele possui/tem
Métodos / Comportamento = oque ele faz
Estado / Status = estado/característica ATUAL no momento que foi utilizado
*/

public class Amor {

    public static void main(String[] args) {
     
    Locale.setDefault(Locale.US);
    Scanner STRING = new Scanner(System.in);
    Scanner INT = new Scanner(System.in);
    Scanner DOUBLE = new Scanner(System.in);
    Scanner BOOLEAN = new Scanner(System.in);
    
    System.out.println("AUXILIAR: Olá doutor! vim lhe fazer algumas perguntas para um relatório da cirurgia feita agora há pouco.\n");
    System.out.print("AUXILIAR: Qual a doença que foi tratada na cirurgia? ");
    String doencaX1 = STRING.nextLine();
    System.out.print("AUXILIAR: Qual foi pressão sistólica do paciente, durante a cirurgia? ");
    int pressaosistolicaX1 = INT.nextInt();
    System.out.print("AUXILIAR: E a pressão diastólica? ");
    int pressaodiastolicaX1 = INT.nextInt();
    
    Coração x1 = new Coração();
    
    x1.doença = doencaX1;
    x1.pressaosistolica = pressaosistolicaX1;
    x1.pressaodiastolica = pressaodiastolicaX1;
           
    boolean respostaApaixonada = x1.perguntaApaixonada();
        x1.vida = respostaApaixonada;
        x1.escreveramor();
   
    boolean respostaAmorosa = x1.perguntaAmorosa();
        x1.apaixonado = respostaAmorosa;
        x1.estado();
        x1.escreverpaixao(); 
    }
}
