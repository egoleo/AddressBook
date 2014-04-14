package net.egoleo.addressbook;

/**
 * Created by george on 4/11/14.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBookFrame extends JFrame {

    //declare components
    private JLabel lengthLabel, widthLabel, areaLabel;
    private JTextField lengthText, widthText, areaText;
    private JButton calculateButton, exitButton;

    //declare button actionListers
    private CalculateButtonHandler calculateButtonHandler;
    private ExitButtonHandler exitButtonHandler;

    public AddressBookFrame() {

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));

        //initialise JLabel components
        lengthLabel = new JLabel("Please enter the rectangles length");
        widthLabel = new JLabel("Please enter the rectangles width");
        areaLabel = new JLabel("The area is: ", SwingConstants.RIGHT);

        //initialise JTextField
        lengthText = new JTextField(12);
        widthText = new JTextField(12);
        areaText = new JTextField(12);
        areaText.setEditable(false);

        //initialise JButton
        calculateButton = new JButton("What's the Area?");
        calculateButtonHandler = new CalculateButtonHandler();
        calculateButton.addActionListener(calculateButtonHandler);

        exitButton = new JButton("Close");
        exitButtonHandler = new ExitButtonHandler();
        exitButton.addActionListener(exitButtonHandler);

        //add the components
        pane.add(lengthLabel);
        pane.add(lengthText);

        pane.add(widthLabel);
        pane.add(widthText);

        pane.add(areaLabel);
        pane.add(areaText);

        pane.add(calculateButton);
        pane.add(exitButton);
    }

    //calculateButton to calculate the area of a rectangle
    public class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double width, length, area;

            width = Double.parseDouble(widthText.getText());
            length = Double.parseDouble(lengthText.getText());

            area = width * length;

            areaText.setText("" + area);
        }
    }

    //exitButton to close the app safely
    public class ExitButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
}
