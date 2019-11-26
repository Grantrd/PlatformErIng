// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Container;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;

class Main {
    public static void main(String[] args) {
        int square = 300;
       // while (square < 900) {
            JFrame f = new JFrame("Made a Jframe Scrub");
            JPanel p = new JPanel();
            f.add(p);
            JLabel l = new JLabel("Type Something:");
            JTextField un = new JTextField(20);
            p.add(l);
            p.add(un);

            f.setSize(square, square);
            f.setVisible(true);
            System.out.println("Hello world!");
            square++;
       // }
    }
}