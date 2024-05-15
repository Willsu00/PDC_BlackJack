package OpenWindow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launch extends JFrame implements ActionListener {

    private static final boolean True = false;
    JFrame frame = new JFrame();
    JPanel bpanel = new JPanel();
    JButton button = new JButton("Login");

    Launch(){

        //button.setBounds(100, 160, 200, 40);
        //button.setFocusable(false);
        button.addActionListener(this);
        JTextField textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(120, 40));

        bpanel.add(button);
        bpanel.add(textfield);
        bpanel.setVisible(true);

        frame.add(bpanel);
        frame.setTitle("Enter Username:");
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
