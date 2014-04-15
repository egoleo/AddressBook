package net.egoleo.addressbook;

import javax.swing.*;

/**
 * Created by george on 4/15/14.
 */
public class AddressBookDesktop extends JDesktopPane {

    JInternalFrame editJInternalFrame;
    JInternalFrame helpJInternalFrame;

    public AddressBookDesktop() {

        editJInternalFrame = new JInternalFrame("Test");

        JButton button = new JButton("Hello World");
        editJInternalFrame.add(button);

        this.add(editJInternalFrame);

    }
}
