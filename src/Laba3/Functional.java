package Laba3;

import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class Functional {

    public static void getDatafromF(){

    }

    static void deleteRowFromTable(int currentRow, DefaultTableModel tableModel) {

        if (currentRow != -1){
            tableModel.removeRow(currentRow);
        }
    }


}
