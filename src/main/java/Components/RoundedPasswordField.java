package Components;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class RoundedPasswordField extends JPasswordField {

    private int round = 10;

    public RoundedPasswordField() {
        setUI(new RoundedUI());
        setOpaque(false);
        setForeground(new Color(80, 80, 80));
        setSelectedTextColor(Color.WHITE);
        setSelectionColor(new Color(133, 209, 255));
        setBorder(new EmptyBorder(10, 12, 10, 12));
        setBackground(Color.WHITE);
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape background = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), round, round);
        g2.setColor(getBackground());
        g2.fill(background);
        g2.dispose();
        super.paintComponent(g);
    }

    private static class RoundedUI extends BasicPasswordFieldUI {
        @Override
        protected void paintSafely(Graphics g) {
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            super.paintSafely(g);
        }
    }
}

