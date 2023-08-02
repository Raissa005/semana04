/*1- Faça um progrsama que leia 20 num inteiros armazene-os numa lista. Armazerne os nurs pares no lista PARES e snumrs IMPARES no lista impar. Imprima os tres.

2- Faça um programa quee receba a temperatura média de cada mês do ano e armazene-as em uma  lista. Apos isto, calcule a media anula das temperaturas e mostre todas as temperaturas acima
da média anual, e em que mes elas ocorreram(mostrar mes por extenso: 1- Janeiro, 2- Fevereiro...)
*/
package colletions;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class list_arrays {
      public static void main(String[] args) {
          //parImpar();
          temperaturaMed();
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
           JOptionPane.showConfirmDialog(null, "Os números digitados foram: "+listaNum);
            JOptionPane.showConfirmDialog(null, "Os números pares da lista são: "+numPares+" e os números impares da lista são: "+numImpares);
      }
      
      static void temperaturaMed(){
          ArrayList temperaturas = new ArrayList<>();
          int num = 0;
          for(int i = 0; i< 4; i++){
            String temp = JOptionPane.showInputDialog(null, "Qual foi a temperatura média do "+i+"º mês?");            
             num += Integer.parseInt(temp);
             temperaturas.add(Integer.parseInt(temp));
          }
          int mediaAnual = num/12;
          for(int i =0; i<temperaturas.size(); i++){
              if(temperaturas.get(i) > mediaAnual){
                     JOptionPane.showConfirmDialog(null, temperaturas.get(i));
              }
          }
          
           
      }
}
