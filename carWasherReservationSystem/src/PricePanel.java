import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PricePanel extends JFrame{
    private JPanel pricePanel;
    private JComboBox paymentType;
    private JButton makeReservationButton;
    private JButton backButton;
    private JLabel clandprice;

    public PricePanel(String plate, String cleaningType , String CartType , String date, String hour  ) {
        clandprice.setText(cleaningType);
        setContentPane(pricePanel);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainPanel mainPane = new mainPanel();

            }
        });
        makeReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                if(paymentType.getSelectedItem().toString() == "Cash") {
                    Invoice invoice = new Invoice(plate, cleaningType, CartType, date, hour, paymentType.getSelectedItem().toString());
                }
                else{
                    CreditCardPayment creditCard = new CreditCardPayment(plate, cleaningType, CartType, date, hour, paymentType.getSelectedItem().toString());}
            }
        });
    }
}
