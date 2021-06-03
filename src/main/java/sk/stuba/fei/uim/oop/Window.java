package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class Window extends JFrame {

    Window(String title){
        super(title);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(false);
    }
}
