
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton cat;
    JRadioButton dog;
    JRadioButton wolf;
    JRadioButton lion;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setTitle("demo");
        this.setLayout(new FlowLayout());
        // this.setLayout( new FlowLayout());
        this.setVisible(true);
        // this.setResizable(false);

        cat = new JRadioButton("cat");
        dog = new JRadioButton("dog");
        wolf = new JRadioButton("wolf");
        lion = new JRadioButton("lion");

        ButtonGroup group = new ButtonGroup();
        group.add(cat);
        group.add(dog);
        group.add(wolf);
        group.add(lion);

        this.add(cat);
        this.add(dog);
        this.add(wolf);
        this.add(lion);
        //
        cat.addActionListener(this);
        dog.addActionListener(this);
        wolf.addActionListener(this);
        lion.addActionListener(this);

    }

    // public void actionPerfomed(ActionEvent e) {

    // }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cat) {

            System.out.println("RRRRRRRRR");
            ImageIcon icon = new ImageIcon("C:\\Users\\BAKHTAK\\Documents\\Z\\demo\\src\\cat.png"); // Adjust the path
            // to
            // your image file
            JLabel imageLabel = new JLabel();
            // Update the imageLabel to show the new image
            imageLabel.setText("HHHFHFHFHF");
            imageLabel.setIcon(icon);
            imageLabel.setBorder(new EmptyBorder(100, 0, 0, 0));
            this.add(imageLabel, BorderLayout.NORTH);

        } else if (e.getSource() == dog) {
            System.out.println("RRRRRRRRR");
            ImageIcon icon = new ImageIcon("C:\\Users\\BAKHTAK\\Documents\\Z\\demo\\src\\dog.png"); // Adjust the path
            // to
            // your image file
            JLabel imageLabel = new JLabel();
            // Update the imageLabel to show the new image
            imageLabel.setText("HHHFHFHFHF");
            imageLabel.setIcon(icon);
            imageLabel.setBorder(new EmptyBorder(100, 0, 0, 0));
            this.add(imageLabel, BorderLayout.NORTH);

        } else if (e.getSource() == wolf) {
            System.out.println("RRRRRRRRR");
            ImageIcon icon = new ImageIcon("C:\\Users\\BAKHTAK\\Documents\\Z\\demo\\src\\wolf.png"); // Adjust the path
            // to
            // your image file
            JLabel imageLabel = new JLabel();
            // Update the imageLabel to show the new image
            imageLabel.setText("HHHFHFHFHF");
            imageLabel.setIcon(icon);
            imageLabel.setBorder(new EmptyBorder(100, 0, 0, 0));
            this.add(imageLabel, BorderLayout.NORTH);

        } else if (e.getSource() == lion) {
            System.out.println("RRRRRRRRR");
            ImageIcon icon = new ImageIcon("C:\\Users\\BAKHTAK\\Documents\\Z\\demo\\src\\lion.png"); // Adjust the path
            // to
            // your image file
            JLabel imageLabel = new JLabel();
            // Update the imageLabel to show the new image
            imageLabel.setText("HHHFHFHFHF");
            imageLabel.setIcon(icon);
            imageLabel.setBorder(new EmptyBorder(100, 0, 0, 0));
            this.add(imageLabel, BorderLayout.NORTH);

        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
