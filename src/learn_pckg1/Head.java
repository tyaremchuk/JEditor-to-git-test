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
import javax.swing.text.LabelView;
import javax.swing.tree.DefaultMutableTreeNode;

public class Head extends JFrame
{
    JFrame f;
    Head()
    {
        f = new JFrame("Frame of smthing");
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/plain");
        editorPane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a healthy body."
                + " But sleeping in unnecessary times may spoil our health, wealth and studies."
                + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.</p>");
        f.setContentPane(editorPane);
        {
            f.setSize(600, 600);
            f.setLayout(new FlowLayout());
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            /*f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    f.dispose();
                }
            });*/ //closing
        }
    }

    public static void main(String[] args)
    {
        new Head();
    }
}