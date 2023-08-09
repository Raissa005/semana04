package semana04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Crud_correcao {
    public static ArrayList<String> nomeP = new ArrayList<>();
    public static ArrayList<Integer> qtdP = new ArrayList<>();
    public static ArrayList<Integer> reservaP = new ArrayList<>();
    
        public static void main(String[] args){
             menu();
        }
        public static void menu(){
            int valor = 0;
          do{
              String opcao =  JOptionPane.showInputDialog("Selecione uma opção \n"
                                                                      +"1)Cadastrar Produto \n 2)Consultar produtos \n3)Editar produto \n4)Deletar produto \n0)Sair");
              valor = Integer.parseInt(opcao);
              switch(valor){
              case 1:
                    cadastrarP();
               break;
               case 2:
                    buscarP();
                break;
               case 3:
                   
                break;
               case 4:
                   
                break;
          }
          }while(valor != 0);
        }
        
        public static void cadastrarP(){
            String nome = JOptionPane.showInputDialog("Informe o nome do produto");
            nomeP.add(nome);
             String quantidade = JOptionPane.showInputDialog("Informe a quantidade do produto");
             int quantidadeInt = Integer.parseInt(quantidade);
            qtdP.add(quantidadeInt);
             String reservados = JOptionPane.showInputDialog("Informe a quantidade de produtos reservados");
             int qtdReserva = Integer.parseInt(reservados);
            reservaP.add(qtdReserva);
            
        }
        
        public static void buscarP(){
            String texto = "Id | Nome | Quantidade | Reservados\n";
            texto += "----------------------------------------------------------------------\n";
            
            for(int i = 0; i<nomeP.size(); i++){
                texto += i + " | "+ nomeP.get(i) +" | "+ qtdP.get(i) +" | "+ reservaP.get(i) +" \n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
}
