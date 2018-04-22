import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JComponent implements ActionListener {

    private int ballX = 400;
    private int ballY = 150;

    public static void main(String[] args){
        JFrame window = new JFrame("Pong Game by T.Mekhri");
        MainClass game = new MainClass();
        window.add(game);
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Timer t = new Timer(100, game);
        t.start();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // draw the sky
        g.setColor(new Color(191, 245, 245));
        g.fillRect(0, 0, 800, 600);
        //draw the paddle
        g.setColor(new Color(45, 111, 45));
        g.fillRect(100, 500, 80, 20);
        //draw the ball
        g.setColor(new Color(168, 20, 125));
        g.fillOval(ballX, ballY, 20, 20);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX = ballX + 7;
        ballY = ballY + 10;
        repaint();
    }
}
