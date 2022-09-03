import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
 
class MyFrame
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel dob;
    private JComboBox te1;
    private JComboBox te2;
    private JLabel add;
    private JTextArea tadd;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 
    private String tim1[]
        = { "9:00", "10:00", "11:10", "12:10",
            "1:50", "2:50", "3:50", "4:50"};
    private String tim2[]
    	= {"10:00","11:00","12:10","1:10",
    		"2:50","3:50","4:50"};
    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
    	
        setTitle("Add Timetable");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Updating Classes");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        name = new JLabel("Subject");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        mno = new JLabel("Subject Code");
        mno.setFont(new Font("Arial", Font.PLAIN, 15));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        dob = new JLabel("Time");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);
 
        te1 = new JComboBox(tim1);
        te1.setFont(new Font("Arial", Font.PLAIN, 15));
        te1.setSize(50, 20);
        te1.setLocation(200, 250);
        c.add(te1);
 
        te2 = new JComboBox(tim2);
        te2.setFont(new Font("Arial", Font.PLAIN, 15));
        te2.setSize(60, 20);
        te2.setLocation(250, 250);
        c.add(te2);
 
 
        add = new JLabel("Class Link");
        add.setFont(new Font("Arial", Font.PLAIN, 15));
        add.setSize(100, 50);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
		Scanner obj = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		String sh = obj.toString();
		
        if (e.getSource() == sub) {
                String data
                    = "Subject : "
                      + tname.getText() + "\n"
                      + "Subject Code : "
                      + tmno.getText() + "\n";
                String data2
                    = "Time : "
                      + (String)te1.getSelectedItem()
                      + "-" + (String)te2.getSelectedItem()
                      + "\n";
 
                String data3 = "Meeting Invitation link : " + tadd.getText();
                String dd= data+ data2 + data3;
                tout.setText(data + data2 + data3);
                tout.setEditable(false);
                res.setText("Today's Class updated Successfully..");

        		if(day==1) {System.out.println("Its a Holiday! Enjoy!!");}
        		if(day==2) { sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Monday.txt";//Monday
        		}
        		if(day==3) {sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Tuesday.txt";//Tuesday
        		}
        		if(day==4) {sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Wednesday.txt";//Wednesday
        		}
        		if(day==5) {sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Thursday.txt";//Thursday
        		}
        		if(day==6) {sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Friday.txt";//Friday
        		}
        		if(day==7) {sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Saturday.txt";//Saturday
        		}
                try {
                    FileWriter reader = new FileWriter( sh);
                    BufferedWriter bw = new BufferedWriter(reader);
                    //PrintWriter bw = new PrintWriter(reader);
                    bw.write(dd);
                    bw.close();
      		      } catch (IOException fe) {
      		      System.out.println("An error occurred!!Please try again later");
      		      fe.printStackTrace();
      		      }
                obj.close();
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            te1.setSelectedIndex(0);
            te2.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
 
// Driver Code
public class Registration {
 
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();

    }
}