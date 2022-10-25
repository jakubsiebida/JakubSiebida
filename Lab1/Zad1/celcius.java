import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class celcius extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JPanel main;
    private JLabel fah;
    private JButton zameinNaCButton;
    private JLabel cel;

    public celcius(String title){
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(main);
    this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)(Double.parseDouble(textField1.getText())*1.8+32);
                fah.setText(tempFahr+"");
            }
        });
        zameinNaCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempCel=(int)(Double.parseDouble(textField2.getText())-32)*5/9;
                cel.setText(tempCel+" ");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new celcius("zmiana");
        frame.setVisible(true);
    }
}

