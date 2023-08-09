package semana04;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args){
         HashMap<Integer, String> pessoas = new HashMap<>();
        pessoas.put(1, "Caleb");
        pessoas.put(2, "Alicee");
        
        System.out.println(pessoas.get(1));
        System.out.println(pessoas.size());
        System.out.println(pessoas.containsKey(22));
        System.out.println(pessoas.containsValue("Caleb"));
        System.out.println(pessoas);
        
        for(Map.Entry<Integer, String> entry: pessoas.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
         for(Integer key: pessoas.keySet()){
            System.out.println(key);
        }
          for(String valores: pessoas.values()){
            System.out.println(valores);
        }
          
          pessoas.forEach((codigo, nome) -> {
            System.out.println( codigo +" - "+ nome);
         });
    }
}
