package jobsheet11;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PosFrame extends JFrame {
    private final JPanel panel;

    public PosFrame() {
        super("Pos Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366, 600);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        setContentPane(panel);

        JLabel label = new JLabel("Welcome to Pos Application");
        label.setBounds(20, 10, 300, 25);
        panel.add(label);

        // Input fields
        JLabel nameLabel = new JLabel("Nama Barang:");
        nameLabel.setBounds(20, 50, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 50, 200, 25);
        panel.add(nameField);

        JLabel priceLabel = new JLabel("Harga:");
        priceLabel.setBounds(20, 85, 100, 25);
        panel.add(priceLabel);

        JTextField priceField = new JTextField();
        priceField.setBounds(120, 85, 200, 25);
        panel.add(priceField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(340, 50, 80, 60);
        panel.add(addButton);

        // Area to list items
        JTextArea listArea = new JTextArea();
        listArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(listArea);
        scroll.setBounds(20, 130, 540, 350);
        panel.add(scroll);

        // Running total (placed below list)
        JLabel totalLabel = new JLabel("Total: 0.0");
        totalLabel.setBounds(20, 490, 200, 25);
        panel.add(totalLabel);

        // Add button action
        final double[] total = { 0.0 };
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String priceText = priceField.getText().trim();
            if (name.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nama barang tidak boleh kosong");
                return;
            }
            double price;
            try {
                price = Double.parseDouble(priceText);
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Harga harus berupa angka");
                return;
            }
            listArea.append(name + " - " + price + "\n");
            total[0] += price;
            totalLabel.setText(String.format("Total: %.2f", total[0]));
            nameField.setText("");
            priceField.setText("");
            nameField.requestFocusInWindow();
        });
    }

    public void populateComponents() {
        // untuk mempopulate component, untuk setting dan attach component

    }

    public void populateActionListener() {
        // untuk populate action buttonnya

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PosFrame frame = new PosFrame();
            frame.setVisible(true);
        });
    }
}
