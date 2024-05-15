package OpenWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launch extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Login");

    Launch(){

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(100, 160, 200, 40);
        JTextField textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(120, 40));

        frame.add(textfield, BorderLayout.NORTH);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
