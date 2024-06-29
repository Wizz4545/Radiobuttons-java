import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton cat;
    JRadioButton dog;
    JRadioButton wolf;
    JRadioButton lion;

    JLabel imageLabel; // JLabel to hold the image

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 350);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

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

        // Initialize the imageLabel with a default image or leave it null
        imageLabel = new JLabel();
        this.add(imageLabel); // Add it to the frame

        cat.addActionListener(this);
        dog.addActionListener(this);
        wolf.addActionListener(this);
        lion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cat) {
            ImageIcon img1 = new ImageIcon("img1.png"); // Adjust the path to your image file

            

            se if (e.getSource() == dog) {
                                                                                                     // 
            
        } else if (e.getSource() == wolf) {
            // Handle wolf action
        } else if (e.getSource() == lion) {
            // Handle lion action

            

    public static void main(String[] args) {
        // Create an instance of MyFrame and set it visible
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
