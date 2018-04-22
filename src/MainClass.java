import javax.swing.*;

public class MainClass extends JComponent {
    public static void main(String[] args){
        JFrame window = new JFrame("Pong Game by T.Mekhri");
        window.add(new MainClass());
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
