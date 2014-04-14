package net.egoleo.addressbook;

import javax.swing.*;

/**
 * Created by george on 4/11/14.
 */
public class AddressBookMain {

    //sets the width and height of the content pane
    private static final int WIDTH = 500;
    private static final int HEIGHT = 110;

    public static void main(String[] args) {
        AddressBookFrame addressBookFrame = new AddressBookFrame();

        addressBookFrame.setTitle("Address Book");
        addressBookFrame.setSize(WIDTH, HEIGHT);

        addressBookFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addressBookFrame.setVisible(true);
    }
}
