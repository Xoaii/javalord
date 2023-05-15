package Src_View;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Dkid_22
 */
public class Notepad_Fake extends javax.swing.JFrame {

    boolean isfileTonTai = false;
    File selectedFile = null;
    UndoManager undoManager;
    Color d;

    public Notepad_Fake() {
        initComponents();
        this.setLocationRelativeTo(null);
        taoUndoRedo();
        d = txtData.getBackground();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtData = new javax.swing.JTextPane();
        mainMenu = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileNewWinDow = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        fileSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fileExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        editUndo = new javax.swing.JMenuItem();
        editRedo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        Arial = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        hhadoioc = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Notepad_fake");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font(".Vn3DH", 0, 10)); // NOI18N
        setForeground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(500, 380));
        setMinimumSize(new java.awt.Dimension(500, 380));
        setName("Notepad_fake"); // NOI18N
        setSize(new java.awt.Dimension(500, 380));

        txtData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtData.setName("txtData"); // NOI18N
        jScrollPane1.setViewportView(txtData);

        mainMenu.setBorder(null);
        mainMenu.setFont(mainMenu.getFont());

        menuFile.setText("File");

        fileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fileNew.setText("New");
        fileNew.setToolTipText("");
        fileNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        menuFile.add(fileNew);

        fileNewWinDow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fileNewWinDow.setText("New Windows");
        fileNewWinDow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewWinDowActionPerformed(evt);
            }
        });
        menuFile.add(fileNewWinDow);

        fileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fileOpen.setText("Open...");
        fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenActionPerformed(evt);
            }
        });
        menuFile.add(fileOpen);

        fileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fileSave.setText("Save");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        menuFile.add(fileSave);

        fileSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        fileSaveAs.setText("Save As...");
        fileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(fileSaveAs);
        menuFile.add(jSeparator1);

        fileExit.setText("Exit");
        fileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitActionPerformed(evt);
            }
        });
        menuFile.add(fileExit);

        mainMenu.add(menuFile);

        menuEdit.setText("Edit");

        editUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editUndo.setText("Undo");
        editUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUndoActionPerformed(evt);
            }
        });
        menuEdit.add(editUndo);

        editRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editRedo.setText("Redo");
        editRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRedoActionPerformed(evt);
            }
        });
        menuEdit.add(editRedo);
        menuEdit.add(jSeparator2);

        jMenuItem3.setText("Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuEdit.add(jMenuItem3);
        menuEdit.add(jSeparator3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Time/Date");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuEdit.add(jMenuItem4);

        mainMenu.add(menuEdit);
        mainMenu.add(jMenu1);

        jMenu2.setText("Format");

        jMenu3.setText("Font");

        jMenuItem11.setText("Dialog");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        Arial.setText("Comic Sans MS");
        Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArialActionPerformed(evt);
            }
        });
        jMenu3.add(Arial);

        jMenuItem6.setText("MS Gothic");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Calibri");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenu2.add(jMenu3);

        jMenu4.setText("Size");

        jMenuItem8.setText("14");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("16");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("18");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenu2.add(jMenu4);

        jMenu6.setText("đổi màu");

        jMenuItem13.setText("xanh");
        jMenuItem13.setActionCommand("jMenuItem13");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("vàng");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("cam");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenu2.add(jMenu6);

        mainMenu.add(jMenu2);

        hhadoioc.setText("Color");

        jMenuItem12.setText("Default");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        hhadoioc.add(jMenuItem12);

        jMenuItem1.setText("Red");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        hhadoioc.add(jMenuItem1);

        jMenuItem2.setText("Orange");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        hhadoioc.add(jMenuItem2);

        jMenuItem5.setText("Green");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        hhadoioc.add(jMenuItem5);

        mainMenu.add(hhadoioc);

        jMenu5.setText("Play <<");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        mainMenu.add(jMenu5);

        jMenu7.setText("Gọi Notepad");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        mainMenu.add(jMenu7);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu file hiện tại không?", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            fileSaveActionPerformed(evt);
            txtData.setText("");
            isfileTonTai = false;
            selectedFile = null;
        }
        if (choice == JOptionPane.NO_OPTION) {
            txtData.setText("");
            isfileTonTai = false;
            selectedFile = null;
        }
        if (choice == JOptionPane.CANCEL_OPTION) {
            return;
        }
    }//GEN-LAST:event_fileNewActionPerformed

    private void fileNewWinDowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewWinDowActionPerformed
        try {
            // Đường dẫn tới file thực thi
            String fileProject = System.getProperty("user.dir");
            String fileExe = fileProject + "\\Notepad_Fake_Java.jar";
            //JOptionPane.showMessageDialog(this,fileProject);      
            // Tạo một đối tượng ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-jar", fileExe);
            // Chạy quá trình
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_fileNewWinDowActionPerformed
    public void taoUndoRedo() {
        undoManager = new UndoManager();

        // Add the UndoManager to the Document
        txtData.putClientProperty("UndoManager", undoManager);

        // Override the Document's methods to track changes
        txtData.getDocument().addUndoableEditListener((UndoableEditEvent e) -> {
            undoManager.addEdit(e.getEdit());
        });
    }
    private void editUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUndoActionPerformed
        if (undoManager.canUndo())
            undoManager.undo();
    }//GEN-LAST:event_editUndoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        txtData.setText("");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveActionPerformed
        try {
            if (!isfileTonTai) {
                // Nếu file chưa tồn tại thì  đi tạo file!
                //Tạo file và gắn đường dẫn 
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("D:\\"));
                int result = fileChooser.showOpenDialog(this);
                // Nó trả cho mk 1 đối tượng file luôn ??
                if (result == JFileChooser.APPROVE_OPTION) {
                    String path = fileChooser.getSelectedFile().getAbsoluteFile().toString();
                    if (!path.endsWith(".txt")) {
                        path = path + ".txt";
                    }
                    selectedFile = new File(path);
                }
                // Tạo file và ghi xuống thôi
                selectedFile.createNewFile();
                FileWriter fw = new FileWriter(selectedFile);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(txtData.getText());
                bw.flush();
                fw.flush();
                fw.close();
                bw.close();
                isfileTonTai = true;
            } else {
                FileWriter fw = new FileWriter(selectedFile);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(txtData.getText());
                bw.flush();
                fw.flush();
                fw.close();
                bw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_fileSaveActionPerformed

    private void fileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("D:\\"));

            int result = fileChooser.showOpenDialog(this);
            // Nó trả cho mk 1 đối tượng file luôn ??
            if (result == JFileChooser.APPROVE_OPTION) {
                String path = fileChooser.getSelectedFile().getAbsoluteFile().toString();
                selectedFile = new File(path);
            }
            // Lại lấy được đường dẫn đến file rồi -> đọc data dưới file cho vào txtData
            FileReader fr = new FileReader(selectedFile, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String data = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    data += line + "\n";
                }
            }
            txtData.setText(data);
            isfileTonTai = true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_fileOpenActionPerformed

    private void fileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_fileExitActionPerformed

    private void fileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveAsActionPerformed
        isfileTonTai = false;
        fileSaveActionPerformed(evt);
    }//GEN-LAST:event_fileSaveAsActionPerformed

    private void editRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRedoActionPerformed
        if (undoManager.canRedo())
            undoManager.redo();
    }//GEN-LAST:event_editRedoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Chuyển đổi LocalDate thành chuỗi theo định dạng
        String formattedDate = currentDate.format(formatter);
        txtData.setText(txtData.getText() + " " + formattedDate);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        txtData.setBackground(Color.orange);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        String name = txtData.getFont().getName();
        Font font = new Font(name, Font.PLAIN, 16);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArialActionPerformed
        int x = txtData.getFont().getSize();
        Font font = new Font("Comic Sans MS", Font.PLAIN, x);
        txtData.setFont(font);
    }//GEN-LAST:event_ArialActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int x = txtData.getFont().getSize();
        Font font = new Font("MS Gothic", Font.PLAIN, x);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int x = txtData.getFont().getSize();
        Font font = new Font("Calibri", Font.PLAIN, x);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        txtData.setBackground(Color.RED);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        txtData.setBackground(Color.GREEN);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        int x = txtData.getFont().getSize();
        Font font = new Font("Dialog", Font.PLAIN, x);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String name = txtData.getFont().getName();
        Font font = new Font(name, Font.PLAIN, 14);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        String name = txtData.getFont().getName();
        Font font = new Font(name, Font.PLAIN, 18);
        txtData.setFont(font);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        txtData.setBackground(d);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        try {
            //String pythonScriptPath = "D:\\WorkSpace\\LEARN_JAVA\\javatest\\Call_py\\src\\call_py\\chuyen.py";
            String fileProject = System.getProperty("user.dir");
            String fileExe =  "D:\\ngu\\chuyen.py";
            ProcessBuilder processBuilder = new ProcessBuilder("python", fileExe, "vi",txtData.getText());
            Process process = processBuilder.start();
//            try {
//                int exitCode = process.waitFor();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Notepad_Fake.class.getName()).log(Level.SEVERE, null, ex);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        txtData.setForeground(Color.GREEN);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        txtData.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        txtData.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        try {
            // Tạo một đối tượng ProcessBuilder
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");

            // Khởi chạy quá trình
            Process process = pb.start();

            // Đợi quá trình kết thúc
            process.waitFor();

            System.out.println("Notepad đã được mở.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad_Fake().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem editRedo;
    private javax.swing.JMenuItem editUndo;
    private javax.swing.JMenuItem fileExit;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileNewWinDow;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenuItem fileSaveAs;
    private javax.swing.JMenu hhadoioc;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JTextPane txtData;
    // End of variables declaration//GEN-END:variables
}
