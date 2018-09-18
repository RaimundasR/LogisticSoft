package LogSystem;

import javafx.scene.layout.Pane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frame {

    public void  Window (){


        JTable table = new JTable();
        Object [] columns = {"Name","Ref_number","Barcode_number"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.cyan);
        table.setForeground(Color.white);

        Font font = new Font("Arial",1,22);
        table.setFont(font);
        table.setRowHeight(30);




       JTextField field1 = new JTextField(); //NAME
       JTextField field2 = new JTextField(); //REF NUMBER
       JTextField field3 = new JTextField(); //BARCODE

       JButton Update = new JButton();
       JButton Clear = new JButton();
       JButton Check = new JButton();

       field1.setBounds(30, 220, 100 ,25 );
       field2.setBounds(30, 250, 100 ,25 );
       field3.setBounds(30,280,400,25);

       JScrollPane pane = new JScrollPane(table);
       pane.setBounds(0,0,880,220);



        JFrame screen = new JFrame("LogisticSystems");
        screen.setVisible(true);
        screen.setSize(880,400);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        screen.setLayout(null);
        screen.add(pane);
        screen.add(field1);
        screen.add(field2);
        screen.add(field3);















    }

}
