package semana04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Colletions {

    public static void main(String[] args) {
        //List alunos = new ArrayList<>();
        ArrayList alunos2 = new ArrayList<>();
      
        alunos2.add("RAii");
        alunos2.add("Pedrin");
        
        System.out.println(alunos2.get(1));
        System.out.println(alunos2.contains("RAii")); //retorna boolean
        alunos2.remove(0);
        
        System.out.println(alunos2.contains("RAii")); //retorna boolean
         System.out.println(alunos2.get(0));
         alunos2.contains(2123);
         alunos2.size();
        
         
           ArrayList<String> frutas = new ArrayList<String>();
           String fruta = JOptionPane.showInputDialog( "Informe a fruta");
           frutas.add(fruta);
           System.out.println(frutas.get(0));
           
           for(int i = 0; i < frutas.size(); i++){
               System.out.println(frutas.get(i));
           }
           
           for(String blabla : frutas){
               System.out.println(blabla);
           } System.out.println(frutas);
           
           frutas.forEach((item) -> {
            System.out.println(item);
           });
    }
    
}
