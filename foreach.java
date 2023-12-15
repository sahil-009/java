import java.util.ArrayList;
public class foreach {
    public static void main(String[] args) {
              
        // String[] animals = {"cat", "dog", "cow" ,"horse"};


        ArrayList<String> animals = new ArrayList<String>();
        
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        animals.add("horse");

        animals.set(0, "rat");
        for(String i: animals){
            System.out.println(i);
        }
    }
}
