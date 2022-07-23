import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPanel extends JFrame{
    private JTextField carPlate;
    private JComboBox cleaningType;
    private JComboBox CarType;
    private JTextField Date;
    private JButton makeReservationButton;
    private JPanel mainPanel;
    private JComboBox Hour;


    public mainPanel() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        makeReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                PricePanel price = new PricePanel(carPlate.getText(),cleaningType.getSelectedItem().toString(),CarType.getSelectedItem().toString()
                        ,Date.getText(),Hour.getSelectedItem().toString());

            }
        });
    }

    public static void main(String[] args) {
        mainPanel mainPane = new mainPanel();
    }
    public void getInfo(){
        System.out.println("Car Plaque:"+ carPlate.getText());
        System.out.println("Cleaning Type:"+cleaningType.getSelectedItem().toString());
        System.out.println("Car Type:"+CarType.getSelectedItem().toString());
        System.out.println("Date:"+Date.getText());
        System.out.println("Hour:"+Hour.getSelectedItem().toString());

    }

}

