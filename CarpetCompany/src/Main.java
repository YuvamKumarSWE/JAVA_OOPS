import com.yuvam.carpet.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CarpetGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Room Carpet Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLayout(new GridLayout(6, 2, 10, 10));


        JTextField lengthField = new JTextField();
        JTextField widthField = new JTextField();
        JTextField rateField = new JTextField();

        JLabel areaLabel = new JLabel("Area: ");
        JLabel costLabel = new JLabel("Total Cost: ");

        JButton calculateBtn = new JButton("Calculate");


        frame.add(new JLabel("Length (ft):"));
        frame.add(lengthField);

        frame.add(new JLabel("Width (ft):"));
        frame.add(widthField);

        frame.add(new JLabel("Rate ($/sqft):"));
        frame.add(rateField);

        frame.add(calculateBtn);
        frame.add(new JLabel());

        frame.add(areaLabel);
        frame.add(costLabel);


        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());
                    double rate = Double.parseDouble(rateField.getText());

                    RoomDimension rd = new RoomDimension(length, width);
                    RoomCarpet carpet = new RoomCarpet(rate, rd);

                    areaLabel.setText("Area: " + rd.getArea());
                    costLabel.setText("Total Cost: $" + carpet.getTotalCost());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}
