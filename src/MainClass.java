import javax.swing.*;
import java.awt.*;

public class MainClass extends JComponent {

    public static void main(String[] args){
        JFrame window = new JFrame("Pong Game by T.Mekhri");
        window.add(new MainClass());
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(new Color(191, 245, 245));
        g.fillRect(0, 0, 800, 600);

        g.setColor(new Color(45, 111, 45));
        g.fillRect(100, 500, 80, 20);


    }
}
