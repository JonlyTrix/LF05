import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FarbGen extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    private Color backgroundColor = Color.WHITE;
    private Random random = new Random();

    public FarbGen() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeColor();
            }
        });
    }

    public void changeColor() {
        backgroundColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(backgroundColor);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Change Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FarbGen());
        frame.pack();
        frame.setVisible(true);
    }
}
    