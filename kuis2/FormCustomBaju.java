package kuis2;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;

public class FormCustomBaju {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormCustomBaju::new);
    }

    public FormCustomBaju() {
        JFrame frame = new JFrame("Form Custom Baju - Toko Baju");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1150, 700);
        frame.setLocationRelativeTo(null);

        // ===================== SCROLL WRAPPER =====================
        JPanel wrapper = new JPanel();
        wrapper.setLayout(null);
        wrapper.setBackground(Color.WHITE); // background utama putih

        JScrollPane scroll = new JScrollPane(wrapper);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scroll);

        // ===================== FORM PANEL (PINK) =====================
        JPanel formPanel = new JPanel(null);
        formPanel.setBackground(new Color(255, 230, 240)); // pink
        formPanel.setBounds(20, 20, 350, 620);
        formPanel.setBorder(new LineBorder(Color.PINK, 2));
        wrapper.add(formPanel);

        // Label Nama
        JLabel nameLabel = new JLabel("Nama Pembeli:");
        nameLabel.setBounds(20, 20, 200, 20);
        formPanel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(20, 45, 300, 30);
        formPanel.add(nameField);

        // Size (Radio Buttons)
        JLabel sizeLabel = new JLabel("Pilih Size:");
        sizeLabel.setBounds(20, 85, 200, 20);
        formPanel.add(sizeLabel);

        JRadioButton rbS = new JRadioButton("S");
        JRadioButton rbM = new JRadioButton("M");
        JRadioButton rbL = new JRadioButton("L");
        JRadioButton rbXL = new JRadioButton("XL");

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(rbS);
        sizeGroup.add(rbM);
        sizeGroup.add(rbL);
        sizeGroup.add(rbXL);

        rbS.setBounds(20, 110, 50, 20);
        rbM.setBounds(80, 110, 50, 20);
        rbL.setBounds(140, 110, 50, 20);
        rbXL.setBounds(200, 110, 60, 20);

        rbM.setSelected(true);

        formPanel.add(rbS);
        formPanel.add(rbM);
        formPanel.add(rbL);
        formPanel.add(rbXL);

        // Color Picker
        JLabel colorLabel = new JLabel("Warna Baju:");
        colorLabel.setBounds(20, 140, 200, 20);
        formPanel.add(colorLabel);

        JButton pickColor = new JButton("Pilih Warna");
        pickColor.setBounds(20, 165, 150, 30);
        formPanel.add(pickColor);

        JLabel colorPreview = new JLabel();
        colorPreview.setOpaque(true);
        colorPreview.setBackground(Color.WHITE);
        colorPreview.setBounds(180, 165, 50, 30);
        formPanel.add(colorPreview);

        pickColor.addActionListener(e -> {
            Color c = JColorChooser.showDialog(null, "Pilih Warna Baju", Color.WHITE);
            if (c != null)
                colorPreview.setBackground(c);
        });

        // Date Picker sederhana (JSpinner)
        JLabel dateLabel = new JLabel("Tanggal Pemakaian:");
        dateLabel.setBounds(20, 205, 200, 20);
        formPanel.add(dateLabel);

        JSpinner datePicker = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editor = new JSpinner.DateEditor(datePicker, "dd-MM-yyyy");
        datePicker.setEditor(editor);
        datePicker.setBounds(20, 230, 200, 30);
        formPanel.add(datePicker);

        // Text Area Notes
        JLabel notesLabel = new JLabel("Catatan:");
        notesLabel.setBounds(20, 270, 200, 20);
        formPanel.add(notesLabel);

        JTextArea notesArea = new JTextArea();
        JScrollPane notesScroll = new JScrollPane(notesArea);
        notesScroll.setBounds(20, 295, 300, 120);
        formPanel.add(notesScroll);

        // ===================== IMAGE PANEL =====================
        JPanel imagePanel = new JPanel(null);
        imagePanel.setBackground(new Color(240, 255, 255));
        imagePanel.setBorder(new LineBorder(new Color(120, 200, 200), 2));
        imagePanel.setBounds(390, 20, 380, 620);
        wrapper.add(imagePanel);

        JLabel imageLabel = new JLabel("Preview Desain", SwingConstants.CENTER);
        imageLabel.setBounds(10, 10, 360, 30);
        imagePanel.add(imageLabel);

        JLabel imagePreview = new JLabel();
        imagePreview.setBounds(40, 60, 300, 500);
        imagePreview.setBorder(new LineBorder(Color.GRAY, 2));
        imagePreview.setHorizontalAlignment(SwingConstants.CENTER);
        imagePanel.add(imagePreview);
        // Upload Gambar
        JLabel uploadLabel = new JLabel("Gambar Desain:");
        uploadLabel.setBounds(20, 425, 200, 20);
        formPanel.add(uploadLabel);

        JButton uploadBtn = new JButton("Upload File");
        uploadBtn.setBounds(20, 450, 150, 30);
        formPanel.add(uploadBtn);

        JLabel uploadedFile = new JLabel("Belum ada file");
        uploadedFile.setBounds(20, 480, 300, 30);
        formPanel.add(uploadedFile);

        final File[] selectedFile = { null };

        uploadBtn.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile[0] = chooser.getSelectedFile();
                uploadedFile.setText(selectedFile[0].getName());

                // Preview otomatis setelah upload
                ImageIcon scaled = createScaledIcon(selectedFile[0],
                        imagePreview.getWidth() > 0 ? imagePreview.getWidth() : 300,
                        imagePreview.getHeight() > 0 ? imagePreview.getHeight() : 500);
                imagePreview.setIcon(scaled);
            }
        });

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(20, 525, 300, 40);
        formPanel.add(submitBtn);

        // Clear Button
        JButton clearBtn = new JButton("Clear Form");
        clearBtn.setBounds(20, 575, 300, 40);
        formPanel.add(clearBtn);

        // ===================== OUTPUT PANEL ATAS =====================
        JPanel outputPanel = new JPanel(null);
        outputPanel.setBackground(new Color(255, 240, 230));
        outputPanel.setBounds(800, 20, 300, 290);
        outputPanel.setBorder(new LineBorder(new Color(255, 200, 160), 2));
        wrapper.add(outputPanel);

        JLabel outputLabel = new JLabel("Output (Detail Pesanan)");
        outputLabel.setBounds(20, 10, 250, 20);
        outputPanel.add(outputLabel);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane outputScroll = new JScrollPane(outputArea);
        outputScroll.setBounds(20, 40, 260, 230);
        outputPanel.add(outputScroll);

        // ===================== LIST ORDER PANEL BAWAH =====================
        JPanel listPanel = new JPanel(null);
        listPanel.setBackground(new Color(230, 255, 240));
        listPanel.setBounds(800, 330, 300, 290);
        listPanel.setBorder(new LineBorder(new Color(160, 255, 200), 2));
        wrapper.add(listPanel);

        JLabel listLabel = new JLabel("List Order");
        listLabel.setBounds(20, 10, 200, 20);
        listPanel.add(listLabel);

        // Ganti JList dengan JTable untuk menampilkan list order dalam bentuk tabel
        DefaultTableModel tableModel = new DefaultTableModel(new Object[] { "Nama", "Size", "Tanggal", "Catatan" }, 0);
        JTable orderTable = new JTable(tableModel);
        orderTable.setFillsViewportHeight(true);
        JScrollPane listScroll = new JScrollPane(orderTable);
        listScroll.setBounds(20, 40, 260, 230);
        listPanel.add(listScroll);

        // ===================== Submit Logic =====================
        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String size = rbS.isSelected() ? "S" : rbM.isSelected() ? "M" : rbL.isSelected() ? "L" : "XL";
            String notes = notesArea.getText();
            String date = editor.getFormat().format(datePicker.getValue());
            String fileName = selectedFile[0] == null ? "-" : selectedFile[0].getName();

            String result = "Nama: " + name +
                    "\nSize: " + size +
                    "\nTanggal: " + date +
                    "\nCatatan: " + notes +
                    "\nFile: " + fileName +
                    "\n";

            outputArea.setText(result);
            // tambahkan baris baru ke tabel order (nama, size, tanggal, catatan)
            tableModel.addRow(new Object[] { name, size, date, notes });

            // Preview gambar
            if (selectedFile[0] != null) {
                ImageIcon scaled = createScaledIcon(selectedFile[0],
                        imagePreview.getWidth() > 0 ? imagePreview.getWidth() : 300,
                        imagePreview.getHeight() > 0 ? imagePreview.getHeight() : 500);
                imagePreview.setIcon(scaled);
            }
        });

        clearBtn.addActionListener(e -> {
            nameField.setText("");
            sizeGroup.clearSelection();
            rbM.setSelected(true);
            notesArea.setText("");

            // Reset warna
            colorPreview.setBackground(Color.WHITE);

            // Reset date
            datePicker.setValue(new java.util.Date());

            // Reset file
            selectedFile[0] = null;
            uploadedFile.setText("Belum ada file");
            imagePreview.setIcon(null);

            outputArea.setText("");
        });

        frame.setVisible(true);
    }

    private static ImageIcon createScaledIcon(File file, int maxW, int maxH) {
        if (file == null || !file.exists())
            return null;

        if (maxW <= 0)
            maxW = 300;
        if (maxH <= 0)
            maxH = 500;

        ImageIcon original = new ImageIcon(file.getAbsolutePath());
        int ow = original.getIconWidth();
        int oh = original.getIconHeight();

        if (ow <= 0 || oh <= 0)
            return original;

        double scale = Math.min((double) maxW / ow, (double) maxH / oh);
        if (scale <= 0)
            scale = 1.0;

        int nw = Math.max(1, (int) (ow * scale));
        int nh = Math.max(1, (int) (oh * scale));

        Image img = original.getImage().getScaledInstance(nw, nh, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
}
