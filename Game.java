
// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Container;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.paint.Color;

//import javax.swing.JTextArea;
//import javax.swing.JTextField;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Game {
    void gameLoop() {
        // boolean running = true;
        // while (running) {
        JFrame frame = new JFrame("My Drawing");
        JPanel pan = new JPanel(new FlowLayout());
        Canvas canvas = new Canvas();
        canvas.setSize(1000, 1000);
        // canvas.setBackground(Color.green);
        pan.add(canvas);
        pan.setBackground(new java.awt.Color(255, 255, 255));
        // image = new ImageIcon("hornet.png").getImage();
        JLabel picLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon("hornet.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        picLabel.setIcon(imageIcon);
        pan.add(picLabel);
        frame.add(pan);
        frame.pack();
        int i = 0;
        int y = 0;
        pan.setBackground(new java.awt.Color(0, 50, 25));
        pan.repaint();
        frame.setVisible(true);
        while (i < 1000) {
            picLabel.setLocation(i, y);
            System.out.println(i);
            // pan.repaint();
            i += 5;
            // y+=10;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            frame.add(pan);
            frame.revalidate();
            frame.repaint();  
        }
    }

    class Living {
        class Controllable {
            // Player character. We could actually make this an attribute and do gimmicks
            // with control swapping.
        }

        class Enemy {
            // pew pew duh. Basic enemy thing
        }

        class Shop {
            // capitalism bitch
        }
    }

    class Field {
        class Obstacle {
            // It gets in your way. Will dictate if the hazard does damage or not, slows,
            // etc. Effects and outcomes.
        }

        class Pickup {
            // Will dictate effects of pickups. Could be good or bad maybe-- think Binding
            // of Isaac
        }

        class Terrain {
            // YOU NEED A FLOOR BITCH
        }

        class Platform {
            // Needs to be permeable in certain situations, eg input strings (crouchjump
            // down) or by jumping up through the bottom.
        }
    }

    class Event {
        class Projectile {
            // Inherits a velocity and orientation, as well as any other properties such as
            // effects, damage, etc.
        }

        class Burst {
            // Things like locational "explosions" or localized AoEs. Should use shapes to
            // represent hitboxing.
        }

        class Spread {
            // Things that don't stay static. Examples include fire, water, and other things
            // that "flow"
        }
    }

    class Universal {
        class Gravity {
            // it makes you GO D OWN WOOOA
        }

        class Psy {
            // who doesn't like psyonically being thrown around? Or throwing something else
            // around? Should be effects
            // invoked by an object on a target.
        }

        class Accel {
            // Properties of movement acceleration and input handling. May split into an
            // (enemy) and (controllable) variant.
        }
    }

    class paint {

    }
}