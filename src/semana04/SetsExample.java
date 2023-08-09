package semana04;

import java.util.HashSet;

public class SetsExample {
    public static void main (String [] args){
        HashSet<Integer> numeros = new HashSet<>();
        
        numeros.add(100);
        numeros.add(2);
        numeros.add(05);
        numeros.add(150);
        System.out.println(numeros);
        
        System.out.println(numeros.contains(10));
        System.out.println(numeros.size());
        numeros.remove(15);
        System.out.println(numeros);
        
        //Para buscar um elemento no HashSet apenas percorrendo o conjunto para procurar o elemento expecifico pois o conjunto não possui indice
        
        for(int valor : numeros){
            System.out.println(valor);
        }
        numeros.clear();
        System.out.println(numeros);
        
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Raíssa");
        nomes.add("Artur");
        nomes.add("Ok");
        System.out.println(nomes);
    } 
}
