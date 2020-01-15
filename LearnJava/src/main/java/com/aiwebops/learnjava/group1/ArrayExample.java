package com.aiwebops.learnjava.group1;

import com.intellij.util.ui.JBUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ArrayExample extends JFrame {
    private JPanel contentPane;
    private JTextField nameField;
    private JTextArea personnelArea;
    private JTextArea resultArea;

    public static void main(String[] args){
        try {
            UIManager
                    .setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ArrayExample frame = new ArrayExample();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ArrayExample(){
        setTitle("Set Title Method.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,498,300);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(
                null,
                "New Title border example",
                TitledBorder.LEADING,
                TitledBorder.TOP,
                null,
                new Color(59,59,59)));
        panel.setBounds(10,10,174, 242);
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0,5));

        nameField = new JTextField();
        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                do_textField_keyPressed(e);
            }
        });

        panel.add(nameField,BorderLayout.NORTH);
        nameField.setColumns(10);

        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane);

        personnelArea=new JTextArea();
        personnelArea.setEditable(false);
        scrollPane.setViewportView(personnelArea);
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null,
                "\u9009\u53D6\u89C2\u4F17\u4EBA\u5458\uFF1A",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59,
                59)));
        panel_1.setBounds(183, 10, 219, 242);
        contentPane.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane_1 = new JScrollPane();
        panel_1.add(scrollPane_1);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        scrollPane_1.setViewportView(resultArea);

        JButton button = new JButton("\u62BD\u53D6");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed(e);
            }
        });
        button.setBounds(407, 164, 63, 25);
        contentPane.add(button);

        JButton button_1 = new JButton("\u9000\u51FA");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button_1_actionPerformed(e);
            }
        });
        button_1.setBounds(407, 215, 63, 25);
        contentPane.add(button_1);



    }
    protected  void do_textField_keyPressed(KeyEvent e){
        if(e.getKeyChar() != '\n'){
            return;
        }
        String name = nameField.getText();
        if(name.isEmpty()){
            return;
        }
        personnelArea.append(name + "\n");
        nameField.selectAll();
    }

    protected void do_button_actionPerformed(ActionEvent e){
        String perstring = personnelArea.getText();
        String[] personnelArray = perstring.split("\n{1,}");
        int index = (int) (Math.random() * personnelArray.length);
        String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$s成为本次观众抽奖的大奖得主。"
                + "\n\n我们将为%1$s颁发：\n\t过期的酸奶二十箱。";

        String info = String.format(formatArg, personnelArray[index]);
        resultArea.setText(info);
    }

    protected void do_button_1_actionPerformed(ActionEvent e) {
        dispose();
    }
}
