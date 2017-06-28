package net.egoleo.addressbook;

import javax.swing.*;

/*Added this commentdada*/

/**
 * Created by george on 4/11/14.
 */
public class AddressBookMain {

    //sets the width and height of the content pane
    private static final int WIDTH = 500;
    private static final int HEIGHT = 240;

    public static void main(String[] args) {
        AddressBookFrame addressBookFrame = new AddressBookFrame();

        //set the title, bounds and size of the frame.
        addressBookFrame.setTitle("Address Book");
        addressBookFrame.setBounds(200,200,800, 600);
        addressBookFrame.setSize(WIDTH, HEIGHT);

        addressBookFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addressBookFrame.setVisible(true);
    }
}
