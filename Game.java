import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Game {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 600;
  public static final int CHARACTER_WIDTH = 50;
  public static final int CHARACTER_HEIGHT = 50;
  public static final int OBSTACLE_WIDTH = 50;
  public static final int OBSTACLE_HEIGHT = 50;

  private int characterX = 0;
  private int characterY = HEIGHT - CHARACTER_HEIGHT;
  private int characterVelocity = 0;

  private int[] obstacleX = {WIDTH, WIDTH + 100, WIDTH + 200};
  private int[] obstacleY = {HEIGHT - OBSTACLE_HEIGHT, HEIGHT - OBSTACLE_HEIGHT, HEIGHT - OBSTACLE_HEIGHT};

  private boolean gameOver = false;
  private boolean gameWon = false;
  private boolean gameStarted = false;
  private int score = 0;

  public void run() {
    while (!gameOver && !gameWon) {
      tick();
      // render game state to screen
    }
    if (gameOver) {
      // render game over screen
    } else if (gameWon) {
      // render game won screen
    }
  }

  public void tick() {
    if (gameStarted) {
      score++;

      // Update character position
      characterX += 5;
      characterY += characterVelocity;

      // Update obstacle positions
      for (int i = 0; i < obstacleX.length; i++) {
        obstacleX[i] -= 5;
      }

      // Check if character has collided with an obstacle
      for (int i = 0; i < obstacleX.length; i++) {
        if (characterX + CHARACTER_WIDTH > obstacleX[i] && characterX < obstacleX[i] + OBSTACLE_WIDTH &&
            characterY + CHARACTER_HEIGHT > obstacleY[i] && characterY < obstacleY[i] + OBSTACLE_HEIGHT) {
          gameOver = true;
        }
      }

      // Make sure character stays within screen bounds
      if (characterY < 0) {
        characterY = 0;
        characterVelocity = 0;
      } else if (characterY + CHARACTER_HEIGHT > HEIGHT) {
        characterY = HEIGHT - CHARACTER_HEIGHT;
        characterVelocity = 0;
      }
    }
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      characterVelocity = -10;
    }
  }

  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      characterVelocity = 10;
    }
  }
  public void mousePressed(MouseEvent e) {
    int mouseX = e.getX();
    int mouseY = e.getY();
    // Check if the player has clicked the "restart" button
    if (gameOver && mouseX > 100 && mouseX < 300 && mouseY > 300 && mouseY < 400) {
      gameOver = false;
      gameStarted = false;
      characterX = 0;
      characterY = HEIGHT - CHARACTER_HEIGHT;
      score = 0;
    }
    if (!gameStarted && mouseX > 100 && mouseX < 300 && mouseY > 300 && mouseY < 400) {
      gameStarted = true;
    }
  }
  
}

