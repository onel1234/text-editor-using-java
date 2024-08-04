/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatexteditor;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class About {

    private final JFrame frame;
    private final JPanel panel;
    private String contentText;
    private final JLabel text;

    public About(UI ui) {
        panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        frame = new JFrame();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });


        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(ui);
        text = new JLabel();
    }

    public void me() {
        frame.setTitle("About Me - " + javatexteditor.NAME);

        contentText =
        "<html><body><p>" +
        "Author: COHNDSE24.1F batch<br />" +
        "Contact me at: " +
        "<a href='mailto:" + javatexteditor.AUTHOR_EMAIL + "?subject=About the NotePad PH Software'>" + javatexteditor.AUTHOR_EMAIL + "</a>" +
                "<br /><br />" +
                "Modified By: Sithum Vindana<br/> Wathila Ranaweera <br/> Saritha Indeera <br/> Thejan Wijesundara<br/>" +
                "Contact me at: <a href='mailto:" + javatexteditor.EDITOR_EMAIL + "?subject=About the NotePad PH Software'>" + javatexteditor.EDITOR_EMAIL + "</a>" +
        "</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

    public void software() {
        frame.setTitle("About Me - " + javatexteditor.NAME);

        contentText =
        "<html><body><p>" +
        "Name: " + javatexteditor.NAME + "<br />" +
        "Version: " + javatexteditor.VERSION +
        "</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

}
