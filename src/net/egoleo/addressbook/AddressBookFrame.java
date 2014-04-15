package net.egoleo.addressbook;

/**
 * Created by george on 4/11/14.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBookFrame extends JFrame {

    private AddressBookMenuBar addressBookMenuBar;
    private AddressBookDesktop addressBookDesktop;

    public AddressBookFrame() {

        /*Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));*/

        //add the menubar
        addressBookMenuBar = new AddressBookMenuBar();
        this.setJMenuBar(addressBookMenuBar);

        addressBookDesktop = new AddressBookDesktop();
        addressBookDesktop.setBackground(new Color(132,184,236));
        getContentPane().add(addressBookDesktop);
    }
}
