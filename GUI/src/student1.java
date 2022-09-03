import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

class MyFrame1 extends JFrame{

// Components of the Form
private Container c1;
private JLabel res1;
private JTextArea tout1;
private JTextArea resadd1;
public MyFrame1()
{
    setTitle("Add Timetable");
    setBounds(300, 90, 600, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    c1 = getContentPane();
    c1.setLayout(null);
    Scanner obj = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    int day = calendar.get(Calendar.DAY_OF_WEEK);
	String sh = obj.toString();
	if(day==1) {
		sh="C:\\Users\\91991\\Desktop\\The Scheduler\\timetable\\Sunday.txt";
		//System.out.println("Its a Holiday! Enjoy!!");
		}
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
	
    tout1 = new JTextArea();
    tout1.setFont(new Font("Arial", Font.PLAIN, 15));
    tout1.setSize(400, 600);
    tout1.setLocation(100, 100);
    tout1.setLineWrap(true);
    tout1.setEditable(false);
    c1.add(tout1);
    try
    {
        FileReader reader = new FileReader( sh );
        BufferedReader br = new BufferedReader(reader);
        tout1.read( br, null );
        br.close();
        tout1.requestFocus();
    }
    catch(Exception e2) { System.out.println(e2); }

    res1 = new JLabel("Today's Classes");
    res1.setFont(new Font("Arial", Font.PLAIN, 20));
    res1.setSize(500, 25);
    res1.setLocation(225, 35);
    c1.add(res1);

    
    setVisible(true);
}
}
public class student1 extends Student {

	public static void main(String[] args)
    {
        MyFrame1 f1 = new MyFrame1();

    }

}
