package Beagle;
import javax.swing.*;

public class GUI {

    private static JLabel userLabel;
    private static JTextField Text;
    private static JLabel Label;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("CipherText");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        Text = new JTextField();
        Text.setBounds(100, 20, 165, 25);
        panel.add(Text);

        Label = new JLabel("Key");
        Label.setBounds(10, 50, 80, 25);
        panel.add(Label);

        Text = new JTextField();
        Text.setBounds(100, 50, 165, 25);
        panel.add(Text);

        Label = new JLabel("Output");
        Label.setBounds(10, 80, 80, 25);
        panel.add(Label);

        Text = new JTextField();
        Text.setBounds(100, 80, 165, 25);
        panel.add(Text);

        button = new JButton("Encrypt");
        button.setBounds(10, 120, 80, 25);
        panel.add(button);

        button = new JButton("Decrypt");
        button.setBounds(100, 120, 80, 25);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

}
