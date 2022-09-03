import javax.swing.*;
import java.awt.event.*;
  
class Demo extends JFrame {
  
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JButton jButton;
    ButtonGroup G1;
    JLabel L1;
    public Demo()
    {
        this.setLayout(null);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jButton = new JButton("Submit");
        G1 = new ButtonGroup();
        L1 = new JLabel("Qualification");
        jRadioButton1.setText("Teacher");
        jRadioButton2.setText("Student");
        jRadioButton1.setBounds(120, 30, 120, 50);
        jRadioButton2.setBounds(250, 30, 80, 50);
        jButton.setBounds(125, 90, 80, 30);
        L1.setBounds(20, 30, 150, 50);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jButton);
        this.add(L1);
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String qual = " ";
                if (jRadioButton1.isSelected()) {
                	Teacher t = new Teacher();
                	t.main(null);
                }
                else if (jRadioButton2.isSelected()) {
                	Student st= new Student();
                	st.main(null);
                    //linking to next class
                }
                else {
  
                    qual = "NO Button selected";
                    JOptionPane.showMessageDialog(Demo.this, qual);
                }
                //JOptionPane.showMessageDialog(Demo.this, qual);
            }
        });
    }
}
  
class RadioButton {
    public static void main(String args[])
    { 
        Demo f = new Demo();
        f.setBounds(100, 100, 400, 200);
        f.setTitle("RadioButtons");
        f.setVisible(true);
    }
}