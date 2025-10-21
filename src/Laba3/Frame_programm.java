package Laba3;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class Frame_programm extends JFrame {
    private final String[] TableHeader = new String[] {"Модель","Тип навигации","Время работы","Мощность всасывания","Цена (руб)"};

    Frame_programm(){
        JPanel main_panel = new JPanel(new BorderLayout());
        JTable table = new JTable(5,5);
        JPanel nort_panel = new JPanel();
        JPanel left_panel = new JPanel(new GridLayout(4,2, 10,0));
        JPanel leftPanelWButton = new JPanel(new BorderLayout());

        JLabel name = new JLabel("Название модели");
        JLabel timeWork = new JLabel("Время работы");
        JLabel power = new JLabel("Мощность");
        JLabel price = new JLabel("Цена");

        JButton buttonAdd = new JButton("Добавить");

        JTextField name_field = new JTextField();
        JTextField time_field = new JTextField();
        JTextField power_field = new JTextField();
        JTextField price_field = new JTextField();


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
        nort_panel.setBackground(Color.BLACK);
        main_panel.add(nort_panel, BorderLayout.NORTH);
        main_panel.add(table, BorderLayout.CENTER);


        setSize(new Dimension(600,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(main_panel);
    }
}
