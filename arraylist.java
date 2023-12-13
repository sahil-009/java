
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();

        name.add("sahil");
        name.add("mund");

        name.set(0, "ashil"); //index 0 "sahil" change to "ashil"
        name.remove(1); //remove index1 array
        name.clear();         //clear array

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }
}
