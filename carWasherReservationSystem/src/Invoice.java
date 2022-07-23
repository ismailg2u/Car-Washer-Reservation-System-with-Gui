import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoice extends JFrame{
    private JButton OKButton;
    private JPanel invoicePane;
    private JLabel carPlate;
    private JLabel cleaningType;
    private JLabel carType;
    private JLabel date;
    private JLabel hour;
    private JLabel paymentType;

    public Invoice(String plate, String cleaningType , String CartType , String date, String hour, String Payment) {
        carPlate.setText(plate);
        this.cleaningType.setText(cleaningType);
        carType.setText(CartType);
        this.date.setText(date);
        this.hour.setText(hour);
        paymentType.setText(Payment);
        setContentPane(invoicePane);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
