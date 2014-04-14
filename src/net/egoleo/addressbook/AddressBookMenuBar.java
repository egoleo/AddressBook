package net.egoleo.addressbook;

import javax.swing.*;

/**
 * Created by george on 4/14/14.
 */
public class AddressBookMenuBar extends JMenuBar {

    private JMenu fileJMenu;
    private JMenu editJMenu;
    private JMenu helpJMenu;

    public AddressBookMenuBar() {
        fileJMenu = new JMenu("File");
        this.add(fileJMenu);

        editJMenu = new JMenu("Edit");
        this.add(editJMenu);

        helpJMenu = new JMenu("Help");
        this.add(helpJMenu);
    }
}
