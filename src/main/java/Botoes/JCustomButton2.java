package Botoes;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class JCustomButton2 extends JButton implements MouseListener {

    public enum ButtonStyle {
        // Estilos dos botões com cores RGB explícitas
        DEFAULT(
                new Color(12, 134, 129), new Color(142, 196, 123), new Color(142, 196, 125),
                new Color(197, 228, 130), new Color(12, 134, 129), new Color(12, 134, 129)
        ),
        EXIT(
                new Color(142, 196, 123), new Color(12, 134, 129), new Color(12, 134, 129),
                new Color(12, 134, 129), new Color(197, 228, 130), new Color(197, 228, 130)
        ),
        SECONDARY(
                new Color(12, 134, 129), new Color(12, 134, 129), new Color(12, 134, 129),
                new Color(142, 196, 123), new Color(142, 196, 123), new Color(142, 196, 123)
        ),
        RETURN(
                new Color(197,228,130), new Color(197,228,130), new Color(197,228,130),
                new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)
        ),
        UPDATE(
                new Color(6, 61, 56), new Color(12, 111, 102), new Color(7, 46, 42),
                new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)
        );

        private final Color defaultColor;
        private final Color hoverColor;
        private final Color pressedColor;
        private final Color defaultForeground;
        private final Color hoverForeground;
        private final Color pressedForeground;

        ButtonStyle(Color defaultColor, Color hoverColor, Color pressedColor,
                Color defaultForeground, Color hoverForeground, Color pressedForeground) {
            this.defaultColor = defaultColor;
            this.hoverColor = hoverColor;
            this.pressedColor = pressedColor;
            this.defaultForeground = defaultForeground;
            this.hoverForeground = hoverForeground;
            this.pressedForeground = pressedForeground;
        }

        public Color getDefaultColor() {
            return defaultColor;
        }

        public Color getHoverColor() {
            return hoverColor;
        }

        public Color getPressedColor() {
            return pressedColor;
        }

        public Color getDefaultForeground() {
            return defaultForeground;
        }

        public Color getHoverForeground() {
            return hoverForeground;
        }

        public Color getPressedForeground() {
            return pressedForeground;
        }
    }
    private ButtonStyle style;
    private int round;
    private Color backgroundColor;

    public JCustomButton2() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setRolloverEnabled(false);
        setBorder(new EmptyBorder(8, 8, 8, 8));
        addMouseListener(this);
        setRound(20); // Padrão visível para identificar arredondamento
        setStyle(ButtonStyle.DEFAULT); // Estilo inicial padrão
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(backgroundColor);
        g2.fill(area);

        super.paintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        setForeground(style.getPressedForeground());
        repaint();
        backgroundColor = style.getHoverColor();
        setForeground(style.getHoverForeground());
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        backgroundColor = style.getPressedColor();
        setForeground(style.getPressedForeground());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        setForeground(style.getHoverForeground());
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        backgroundColor = style.getDefaultColor();
        setForeground(style.getDefaultForeground());
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        backgroundColor = style.getHoverColor();
        setForeground(style.getHoverForeground());
        repaint();
    }

    public void setStyle(ButtonStyle style) {
        this.style = style;
        this.backgroundColor = style.getDefaultColor();
        setForeground(style.getDefaultForeground());
        repaint();
    }

    public ButtonStyle getStyle() {
        return style;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }
}
