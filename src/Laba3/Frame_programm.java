package Laba3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame_programm extends JFrame {
    private Object[][] data = {
            {"Xiaomi Mi Robot", "180 мин", "4000 Pa", 25000},
            {"Roborock S7", "180 мин", "5100 Pa", "55000"},
            {"iRobot Roomba", "75 мин", "1700 Pa", "45000"},
            {"Samsung Jet Bot", "90 мин", "2100 Pa", "40000"}
    };
    DefaultTableModel tableModel;
    ArrayList<Object[]> data1 = new ArrayList<>();


    JTextField name_field = new JTextField();
    JTextField time_field = new JTextField();
    JTextField power_field = new JTextField();
    JTextField price_field = new JTextField();

    private void buttonAdded(){
        String name = name_field.getText();
        String time = time_field.getText();
        String power = power_field.getText();
        String price = price_field.getText();
        Object[] obj = {name, time,power,price};
        name_field.setText("");
        time_field.setText("");
        power_field.setText("");
        price_field.setText("");
        tableModel.addRow(obj);

    }

    Frame_programm(){
        JPanel main_panel = new JPanel(new BorderLayout());
        main_panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        for (int i=0; i<data.length;i++ ){
            data1.add(data[i]);
        }


        String[] tableHeader = new String[]{"Модель", "Время работы", "Мощность всасывания", "Цена (руб)"};
        tableModel = new DefaultTableModel(data, tableHeader){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBorder(BorderFactory.createMatteBorder(0,5,5,5,Color.BLACK));
        JPanel nort_panel = new JPanel();
        JPanel left_panel = new JPanel(new GridLayout(4,2, 10,5));
        JPanel leftPanelWButton = new JPanel(new BorderLayout(0,5));
        leftPanelWButton.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        JButton exportPDF = new JButton("Экспортировать в pdf");
        JButton deleate = new JButton("Удалить строку");

        JPanel panelButton = new JPanel(new BorderLayout());

        JLabel labelReturn = new JLabel("КАКА");
//        labelReturn.setSize(new Dimension(panelButton.getWidth(), 150));

        JPanel panelWithButton = new JPanel(new GridLayout(2,2,5,5));
        panelWithButton.add(button1);
        panelWithButton.add(button2);
        panelWithButton.add(exportPDF);
        panelWithButton.add(deleate);

        panelButton.add(panelWithButton, BorderLayout.CENTER);
        panelButton.add(labelReturn, BorderLayout.SOUTH);


        JLabel name = new JLabel("Название модели");
        JLabel timeWork = new JLabel("Время работы");
        JLabel power = new JLabel("Мощность");
        JLabel price = new JLabel("Цена");

        JButton buttonAdd = new JButton("Добавить");
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAdded();
            }
        });




        left_panel.add(name);
        left_panel.add(name_field);
        left_panel.add(timeWork);
        left_panel.add(time_field);
        left_panel.add(power);
        left_panel.add(power_field);
        left_panel.add(price);
        left_panel.add(price_field);

        leftPanelWButton.add(left_panel, BorderLayout.CENTER);
        leftPanelWButton.add(buttonAdd, BorderLayout.SOUTH);

        nort_panel.add(leftPanelWButton);
        nort_panel.add(panelButton);
        nort_panel.setBackground(Color.BLACK);
        main_panel.add(nort_panel, BorderLayout.NORTH);
        main_panel.add(scrollPane, BorderLayout.CENTER);


        setSize(new Dimension(700,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(main_panel);
    }
}
