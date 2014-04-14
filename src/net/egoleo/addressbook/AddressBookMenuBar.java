package net.egoleo.addressbook;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by george on 4/14/14.
 */
public class AddressBookMenuBar extends JMenuBar {


    private JMenu fileJMenu;
    private JMenu editJMenu;
    private JMenu helpJMenu;

    public AddressBookMenuBar() {
        fileJMenu = new JMenu(" File ");
        fileJMenu.setIcon(new ImageIcon("images/file.png"));
        fileJMenu.setMnemonic(KeyEvent.VK_F);
        this.add(fileJMenu);

        editJMenu = new JMenu("Edit");
        editJMenu.setIcon(new ImageIcon("images/edit.png"));
        editJMenu.setMnemonic(KeyEvent.VK_E);
        this.add(editJMenu);

        helpJMenu = new JMenu("Help");
        helpJMenu.setIcon(new ImageIcon("images/help.png"));
        helpJMenu.setMnemonic(KeyEvent.VK_H);
        this.add(helpJMenu);
    }
}
