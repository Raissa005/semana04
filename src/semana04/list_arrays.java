/*1- Faça um progrsama que leia 20 num inteiros armazene-os numa lista. Armazerne os nurs pares no lista PARES e snumrs IMPARES no lista impar. Imprima os tres.

2- Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma  lista. Apos isto, calcule
a media anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mes elas 
ocorreram(mostrar mes por extenso: 1- Janeiro, 2- Fevereiro...)

3- Ultilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    "Telefonou para a vítima?"/ "Devia para a vítima?"/ Esteve no local do crime?"/ "Mora perto da vítima?"/ "Ja trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder sim na
    2 questão = suspeita
    3 e 4 = cúmplice
    5 como = "assassino". 
    Caso contrário é classificado como inocente.
*/
package semana04;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class list_arrays {
      public static void main(String[] args) {
          //parImpar(); //exercicio 1
           temperaturaMed(); //exercicio 2
         // investigacao(); //exercicio 3
      }
      static void parImpar(){
          ArrayList numPares = new ArrayList<>();
          ArrayList numImpares = new ArrayList<>();
          ArrayList<Integer> listaNum = new ArrayList<>();

          for(int i = 0; i < 20; i++){
                 String pergunta = JOptionPane.showInputDialog(null, "Digite um numero inteiro");
                 int num = Integer.parseInt(pergunta);
                 listaNum.add(num);
                 if(num%2 == 0){
                     numPares.add(num);
                 }else{
                     numImpares.add(num);
                 }
           }
           JOptionPane.showMessageDialog(null, "Os números digitados foram: "+listaNum);
            JOptionPane.showMessageDialog(null, "Os números pares da lista são: "+numPares+" e os números impares da lista são: "+numImpares);
      }
      
      static void temperaturaMed(){
          ArrayList <Double> temperaturas = new ArrayList<>();
          ArrayList mes = new ArrayList<>();
          double num = 0.0;
          
          mes.add("Janeiro: ");
          mes.add("Fevereiro: ");
          mes.add("Março: ");
          mes.add("Abril: ");
          mes.add("Maio: ");
          mes.add("Junho: ");
          mes.add("Julho: ");
          mes.add("Agosto: ");
          mes.add("Setembro: ");
          mes.add("Outubro: ");
          mes.add("Novembro: ");
          mes.add("Dezembro: ");
          
          for(int i = 1; i <= 12; i++){
            String temp = JOptionPane.showInputDialog(null, "Qual foi a temperatura média do "+i+"º mês?");            
             num += Integer.parseInt(temp);
             temperaturas.add(Double.parseDouble(temp));
          }
          double mediaAnual = num/12;
          for(int i =0; i < temperaturas.size(); i++){
              if(mediaAnual < (Double) temperaturas.get(i)){
                JOptionPane.showMessageDialog(null, "Temperatura acima da média anual em "+mes.get(i)+" com média de "+ temperaturas.get(i) +"\n"
                                                                                            +"Média anual: "+ mediaAnual );
              }
          }  
         JOptionPane.showConfirmDialog(null, "Médias cadastradas com sucesso!");
      }
      
      static void investigacao(){
        JOptionPane.showMessageDialog(null,"Houve um assassinato na sua cidade e você está sendo interrogado. Cuidado com suas respostas...");
        ArrayList respostas = new ArrayList<>();  
        
        int perg1 = JOptionPane.showConfirmDialog(null,  "Telefonou para a vítima?");
        respostas.add(perg1);
        int perg2 = JOptionPane.showConfirmDialog(null,  "Devia para a vítima?");
        respostas.add(perg2);
        int perg3 = JOptionPane.showConfirmDialog(null,  "Esteve no local do crime?");
        respostas.add(perg3);
        int perg4 = JOptionPane.showConfirmDialog(null,  "Mora perto da vítima?");
        respostas.add(perg4);
        int perg5 = JOptionPane.showConfirmDialog(null,  "Ja trabalhou com a vítima?");
        respostas.add(perg5);
     
        int conclusao = 0;
        
        for(int i = 0; i<respostas.size(); i++){
           if((int)respostas.get(i) ==  0){
               conclusao++;
           }
        }
        
        if(conclusao == 2){
            JOptionPane.showMessageDialog(null, "Você é um suspeito! Estarei de olho em você...");
          } else if(conclusao == 3 || conclusao ==4){
            JOptionPane.showMessageDialog(null, "Você é um cúmplice do assassinato!");
          }else if(conclusao == 5){
            JOptionPane.showMessageDialog(null, "Isso significa que eu estou conversando com um.. assassino!!");
          }else{
            JOptionPane.showMessageDialog(null, "Ufa,você é como eu.. inocente");
          } 
      } 
}
