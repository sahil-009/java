import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name :");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age :"));
        JOptionPane.showMessageDialog(null,"you are "+age+" years old");

        // Parse int use because Joption.showInut came default string

        Double height =Double.parseDouble(JOptionPane.showInputDialog("Enter your height :"));
        JOptionPane.showMessageDialog(null,"you are "+height+" cm tall");



    }
}