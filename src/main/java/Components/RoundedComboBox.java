package Components;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class RoundedComboBox<E> extends JComboBox<E> {

    private int round = 10;

    public RoundedComboBox() {
        setUI(new RoundedUI());
        setOpaque(false);
        setForeground(new Color(12, 134, 129));
        setBackground(new Color(142, 196, 123));
        setBorder(new EmptyBorder(5, 10, 5, 10));
        setFont(new Font("Roboto", Font.BOLD, 12));

        setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value,
                    int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                label.setFont(getFont());

                if (isSelected) {
                    label.setBackground(new Color(12, 134, 129));
                    label.setForeground(new Color(142, 196, 123));
                } else {
                    label.setBackground(new Color(142, 196, 123));
                    label.setForeground(new Color(12, 134, 129));
                }

                return label;
            }
        });
    }

    @Override
    public void setEditable(boolean editable) {
        super.setEditable(editable);

        if (editable) {
            Component editorComponent = getEditor().getEditorComponent();
            if (editorComponent instanceof JTextField textField) {
                textField.setBackground(new Color(142, 196, 123));
                textField.setForeground(new Color(12, 134, 129));
                textField.setFont(getFont());
                textField.setBorder(null);
                textField.setCaretColor(new Color(12, 134, 129));
            }
        }
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
        super.paintComponent(g);
        setBackground(new Color(142, 196, 123));
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape border = new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, round, round);
        g2.setColor(getBackground());
        g2.fill(border);
        g2.setColor(new Color(142, 196, 123));
        g2.draw(border);
        g2.dispose();
    }

    private class RoundedUI extends BasicComboBoxUI {

        @Override
        protected JButton createArrowButton() {
            JButton button = new JButton("▼");
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setFocusPainted(false);
            button.setForeground(new Color(197, 228, 130));
            button.setFont(getFont());
            return button;
        }

        @Override
        public void paint(Graphics g, JComponent c) {
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            super.paint(g, c);
        }

        // 👇 Corrigido: Posição da seta alinhada à direita corretamente
        public void layoutContainer(Container parent) {
            int width = parent.getWidth();
            int height = parent.getHeight();
            int arrowWidth = 20;

            if (arrowButton != null) {
                arrowButton.setBounds(width - arrowWidth - 5, 0, arrowWidth, height); // alinha à direita com 5px de margem
            }

            if (comboBox.isEditable()) {
                if (editor != null) {
                    editor.setBounds(5, 0, width - arrowWidth - 10, height); // margem 5 esquerda e 5 direita
                }
            } else {
                if (currentValuePane != null && comboBox.getRenderer() != null) {
                    Rectangle r = rectangleForCurrentValue();
                    currentValuePane.setBounds(r);
                }
            }
        }
    }
}
