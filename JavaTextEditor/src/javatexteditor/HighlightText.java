/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatexteditor;

import javax.swing.text.*;
import java.awt.*;

public class HighlightText extends DefaultHighlighter.DefaultHighlightPainter{

    public HighlightText(Color color) {
        super(color);
    }

    public void highLight(JTextComponent textComp, String[] pattern) {
        removeHighlights(textComp);

        try {
            Highlighter highlighter = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            for (int i = 0; i < pattern.length; i++) {
                int pos = 0;

                while ((pos = text.indexOf(pattern[i], pos)) >= 0) {
                    highlighter.addHighlight(pos, pos + pattern[i].length(), this);
                    pos += pattern[i].length();
                }
            }
        } catch (BadLocationException e) {}

    }

    public void removeHighlights(JTextComponent textComp) {

        Highlighter highlighter = textComp.getHighlighter();
        Highlighter.Highlight[] hilites = highlighter.getHighlights();

        for (int i = 0; i < hilites.length; i++) {
            if (hilites[i].getPainter() instanceof HighlightText) {
                highlighter.removeHighlight(hilites[i]);
            }
        }
    }
}
