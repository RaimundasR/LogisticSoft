package LogSystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class frame extends count{



    public void  Window  (){


        JTable table = new JTable();
        Object [] columns = {"id_field","Name","Ref_number","Barcode_number","Item_price"};
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.lightGray);
        table.setForeground(Color.BLACK);

        Font font = new Font(Font.SERIF,Font.BOLD,15);
        table.setFont(font);
        table.setRowHeight(15);



        JTextField idField = new JTextField(); //ID
        JTextField field1 = new JTextField(); //NAME
        JTextField field2 = new JTextField(); //REF NUMBER
        JTextField field3 = new JTextField(); //BARCODE
        JTextField Price = new JTextField(); //item price
        JTextField Total = new JTextField(); //total_price



        JButton Add = new JButton("Add to list");
        JButton Clear = new JButton("Clear");
        JButton Check = new JButton("Update");

        idField.setBounds(30,250,50,25);
        field1.setBounds(30, 280, 100 ,25);
        field2.setBounds(30, 310, 100 ,25 );
        field3.setBounds(30,400,400,25);
        Price.setBounds(30,430,70,25);
        Total.setBounds(800,430,100,100);




        Add.setBounds(50,580,100,25);
        Clear.setBounds(250,580,100,25);
        Check.setBounds(450,580,100,25);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0,0,880,220);





        JFrame screen = new JFrame("LogisticSystems");
        JFrame Message = new JFrame();



        Object [] row = new Object[5];

        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = idField.getText();
                row[1] = field1.getText();
                row[2] = field2.getText();
                row[3] = field3.getText();
                row[4] = Price.getText();


                if (field1.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(Message, "Please enter item name", "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                }

                else if (field2.getText().trim().isEmpty()){

                    JOptionPane.showMessageDialog(Message,"Please reference number","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                else if (field3.getText().trim().isEmpty()){

                    JOptionPane.showMessageDialog(Message,"Please type or scan barcode","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }


                model.addRow(row);


            }

        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();

                if (i >= 0){
                    model.removeRow(i);


                }
                else {

                    JOptionPane.showMessageDialog(Message,"Please select item to clear","ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = table.getSelectedRow();
                field1.setText(model.getValueAt(i,0).toString());
                field2.setText(model.getValueAt(i,1).toString());
                field3.setText(model.getValueAt(i,2).toString());


            }
        });

        Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(field1.getText(), i, 0);
                    model.setValueAt(field2.getText(), i, 1);
                    model.setValueAt(field3.getText(), i, 2);

                }
                else {
                    JOptionPane.showMessageDialog(Message,"There are no data to update","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /*Price.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        int a = Integer.parseInt(Price.getText());

                                    }
                                });*/




////////////////////
        screen.setVisible(true);
        screen.setSize(950,700);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        screen.setLayout(null);
        screen.add(pane);
        screen.add(idField);
        screen.add(field1);
        screen.add(field2);
        screen.add(field3);
        screen.add(Total);
        screen.add(Price);
        screen.add(Add);
        screen.add(Clear);
        screen.add(Check);


















    }


}