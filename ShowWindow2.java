import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {


    public static void main(String[] args) {

        final int WINDOW_WIDTH = 500;
        final int WINDOW_HEIGHT = 800;


        JFrame window = new JFrame();

        window.setTitle(" My Simple Window");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("My First Big Window");
        label.setLocation(500,500);
        label.setBounds(25,25,25,25);
        JTextField textField = new JTextField(15);
        textField.setBounds(25,25,25,25);
        textField.setLocation(500,500);


        JLabel label2 = new JLabel("My Second Big Window");
        label2.setLocation(500,500);
        label2.setBounds(25,25,25,25);
        JTextField textField2 = new JTextField(15);
        textField2.setBounds(25,25,25,25);
        textField2.setFont(new Font ("Arial", Font.BOLD, 14));


        window.setBackground(Color.red);
        window.setLocation(500,500);
        panel.setBackground(Color.red);
       label.setBounds(1, 2, 3,4);
        label2.setBounds(1,2,3,4);




       panel.add(label);
       panel.add(label2);
       panel.add(textField);
       panel.add(textField2);
       panel.setBounds(1,2,3,4);



       window.add(panel);



        window.setVisible(true);

    }



}








