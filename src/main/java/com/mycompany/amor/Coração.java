package com.mycompany.amor;

import java.util.Scanner;

public class Coração {
    
    String doença;
    int pressaosistolica;
    int pressaodiastolica;
    boolean vida;
    boolean apaixonado;
    
    void estado(){
      System.out.println("\n/////////////////////////////\n"
              + "\nRelatório do Coração:\n"
              + "\nDoença: " + this.doença);
      System.out.println("Pressão Sistólica: " + this.pressaosistolica);
      System.out.println("Pressão Diastólica: " + this.pressaodiastolica);
      System.out.println("Coração do paciente está funcional? " + (this.vida ? "Sim" : "Não"));
      System.out.println("É ou era um coração apaixonado? " + (this.apaixonado ? "Sim" : "Não"));
    }
    
    void escreveramor(){
    if(this.vida == true){
            System.out.println("CIRURGIÃO: O paciente sobreviveu! A cirurgia no coração foi um sucesso!");
        }else{
            System.out.println("CIRURGIÃO: O paciente morreu! A cirurgia no coração não o salvou.");
        }
    }
    void viver(){
         this.vida = true;
    }
    void morrer(){
         this.vida = false;
    }
   
    boolean perguntaApaixonada(){
    Scanner STRING = new Scanner(System.in);
        System.out.println("AUXILIAR: O coração aguentou a cirurgia? (Sim/Não)");
        String resposta = STRING.nextLine().toLowerCase();
        
        if(resposta.equals("Sim") || resposta.equals("sim")){
            return true;
        }else if (resposta.equals("Não") || resposta.equals("nao") || resposta.equals("Nao")){
            return false;
        }else{
            System.out.println("\nAUXILIAR: Oi? Desculpa, não consegui lhe entender. O que foi que disse? ");
            return perguntaApaixonada();
        }
    }
        
    void escreverpaixao(){
     if(this.apaixonado == true){
        System.out.println("\nCIRURGIÃO: Sim! Era um coração apaixonado/sofrido!\n");
     }else{
        System.out.println("\nCIRURGIÃO: Não! Não estava apaixonado.\n");    
     }  
    }    
        
    void paixaosim(){
         this.apaixonado = true;
    }
    void paixaonao(){
         this.apaixonado = false;
    }    
        
    boolean perguntaAmorosa(){
    Scanner STRING = new Scanner(System.in);
        System.out.println("AUXILIAR: Entendido. Por último, mas não menos importante... é/era um coração apaixonado? (Sim/Não)");
        String resposta = STRING.nextLine().toLowerCase();
        
        if(resposta.equals("Sim") || resposta.equals("sim")){
            return true;
        }else if (resposta.equals("Não") || resposta.equals("nao") || resposta.equals("Nao")){
            return false;
        }else{
            System.out.println("\nAUXILIAR:Oi? Desculpa, não consegui lhe entender. O que foi que disse? ");
            return perguntaAmorosa();
        }
    }
}
