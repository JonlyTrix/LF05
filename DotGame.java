import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DotGame extends JPanel implements MouseListener {

    // The current score
    private int score = 0;

    // The current x and y positions of the dot
    private int dotX = 0;
    private int dotY = 0;

    public DotGame() {
        addMouseListener(this);
    }

    // Called automatically when the panel needs to be repainted
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the dot
        g.fillOval(dotX, dotY, 10, 10);

        // Draw the score
        g.drawString("Score: " + score, 10, 20);
    }

    // Called automatically when the mouse is clicked
    @Override
    public void mouseClicked(MouseEvent e) {
        // Check if the mouse click was inside the dot
        if (e.getX() >= dotX && e.getX() < dotX + 10 && e.getY() >= dotY && e.getY() < dotY + 10) {
            // Increment the score
            score++;

            // Move the dot to a new random position
            Random r = new Random();
            dotX = r.nextInt(getWidth() - 10);
            dotY = r.nextInt(getHeight() - 10);

            // Repaint the panel to draw the updated game state
            repaint();
        }
    }

    // The following methods are required by the MouseListener interface, but we don't
    // need to do anything in them, so they are left empty
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        // Create a new JFrame to hold the game panel
        JFrame frame = new JFrame("Dot Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new instance of the game panel
        DotGame game = new DotGame();
        frame.add(game);

        // Set the size of the frame and make it visible
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
