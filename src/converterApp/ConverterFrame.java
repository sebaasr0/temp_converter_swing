package converterApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterFrame {
    private JPanel panelMain;
    private JTextField textCelsius;
    private JTextField textFahrenheit;
    private JButton buttonToFahr;
    private JButton buttonToCels;

    public ConverterFrame() {
        buttonToFahr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textCelsius.getText());
                    double fahrenheit = celsius * 9 / 5 + 32;
                    textFahrenheit.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelMain, "Enter a valid Celsius value.");
                }
            }
        });

        buttonToCels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textFahrenheit.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    textCelsius.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panelMain, "Enter a valid Fahrenheit value.");
                }
            }
        });
    }

    public JPanel getPanel() {
        return panelMain;
    }
}
