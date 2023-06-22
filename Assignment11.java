import java.io.FileReader;  
import java.io.BufferedReader;  
import java.util.HashMap;
public class CharacterCounter {  
    public static void main(String args[])throws Exception{    
          FileReader file_reader=new FileReader("training_file.txt");    
          BufferedReader buffered_reader = new BufferedReader(file_reader);    
          int index,value;
          HashMap<Character,Integer> map = new HashMap<>();
          while((index=buffered_reader.read())!=-1){  
            Character letter =  (char)index;
            if(map.containsKey(letter)) {
                value = map.get(letter);
                map.put(letter,value+1);
            } else {
                map.put(letter,1);
            }
          }
          System.out.println(map);
          buffered_reader.close();    
          file_reader.close();    
    }    
}
