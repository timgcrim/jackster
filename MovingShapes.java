import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class MovingShapes extends JComponent {

  Shape shape1;
  Shape shape2;
  Shape shape3;

  public static void main(String[] args) {

    JFrame window = new JFrame();
    MovingShapes field = new MovingShapes();
    window.setSize(800, 800);
    window.add(field);

    field.shape1 = new Shape(100,100,10,10);
    field.shape1.vy = 0;
    field.shape2 = new Shape(700,100,10,10);
    field.shape2.vx = -5;
    field.shape2.vy = 0;
    field.shape3 = new Shape(400,500,10,10);
    field.shape3.vx = 0;

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.show();

    while(true) {
      field.shape1.move();
      field.shape1.checkCollision(field.shape2);
      field.shape2.move();
      field.shape2.checkCollision(field.shape1);
      field.shape3.move();
      field.shape3.checkCollision(field.shape1);
      field.shape3.checkCollision(field.shape2);
    
      try {
        Thread.sleep(10);
      } catch(Exception e) {}

      field.repaint();
    }

  }

  public void paint(Graphics g) {
    g.setColor(new Color(255,0,0));
    g.drawRect(shape1.getX(), shape1.getY(), shape1.getWidth(), shape1.getHeight());
    g.setColor(new Color(0,255,0));
    g.drawRect(shape2.getX(), shape2.getY(), shape2.getWidth(), shape2.getHeight());
    g.setColor(new Color(0,0,255));
    g.drawRect(shape3.getX(), shape3.getY(), shape3.getWidth(), shape3.getHeight());
  }



}
