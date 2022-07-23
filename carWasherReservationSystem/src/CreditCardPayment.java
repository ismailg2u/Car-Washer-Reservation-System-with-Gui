import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditCardPayment extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton payButton;

    public CreditCardPayment(String plate, String cleaningType , String CartType , String date, String hour, String Payment) {
        setContentPane(panel1);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Invoice invoice = new Invoice(plate, cleaningType, CartType, date, hour, Payment);

            }
        });
    }
}
