package learn_pckg1;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.dnd.DragSourceListener;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.concurrent.Flow;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.DefaultMenuLayout;
import javax.swing.text.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.tools.Tool;

public class Head implements ActionListener {
    JFrame f;

    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;
    Head()
    {
        f=new JFrame();

        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectAll");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb=new JMenuBar();
        mb.setBounds(5,5,400,40);

        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");

        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);

        mb.add(file);mb.add(edit);mb.add(help);

        ta=new JTextArea();
        ta.setBounds(5,30,460,460);

        f.add(mb);f.add(ta);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            /*f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    f.dispose();
                }
            });*/ //closing

         // frame settings
    }

    public static void main(String[] args)
    {
        new Head();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cut)
            ta.cut();
        if (e.getSource()==copy)
            ta.paste();
        if (e.getSource()==paste)
            ta.paste();
        if (e.getSource()==selectAll)
            ta.selectAll();
    }
}