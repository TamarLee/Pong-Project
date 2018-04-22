import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass extends JComponent implements ActionListener, MouseMotionListener {

    private int ballX = 400;
    private int ballY = 150;
    private int paddleX = 0;
    private int ballXspeed = 7;
    private int ballYspeed = 10;

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

        window.addMouseMotionListener(game);
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
        g.fillRect(paddleX, 500, 80, 20);
        //draw the ball
        g.setColor(new Color(168, 20, 125));
        g.fillOval(ballX, ballY, 20, 20);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX = ballX + ballXspeed;
        ballY = ballY + ballYspeed;
        if(ballX >= paddleX && ballX <= paddleX + 150 && ballY >= 500-20){
            ballYspeed = -10;
        }
        if(ballX >= 800-30){
            ballXspeed = -7;
        }
        if(ballX <= 0){
            ballXspeed = 7;
        }
        if(ballY <= 0){
            ballYspeed = 10;
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        paddleX = e.getX()-75;
        repaint();
    }
}
