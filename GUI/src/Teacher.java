import javax.swing.*;

import java.awt.Desktop;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
class teach extends JFrame{
	JButton addcls;
	JButton addasg;
	JButton addNot;
	//JButton exit;
	JLabel L1;
	public teach() {
		this.setLayout(null);
		addcls= new JButton("Add Class");
		addasg= new JButton(" Add Assignment");
		addNot = new JButton("Add Notes");
		//exit = new JButton("close");
		L1= new JLabel("Welcome Teacher");
		addcls.setBounds(300,100,200,50);
		addasg.setBounds(300,200,200,50);
		addNot.setBounds(300,300,200,50);
		//exit.setBounds(EXIT_ON_CLOSE, ABORT, 200,50);
		L1.setBounds(50, 50, 100, 100);
		this.add(addcls);
		this.add(addasg);
		this.add(addNot);
		addcls.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Registration r1=new Registration();
            	try {
					r1.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
		addasg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	try {
            		  Desktop desktop = java.awt.Desktop.getDesktop();
            		  URI oURL = new URI("https://drive.google.com/drive/u/3/folders/1DAqQnb5gCwjZnX5fMVG9j4erufOUIDNy");
            		  desktop.browse(oURL);
            		} catch (Exception e1) {
            		  e1.printStackTrace();
            		}
            }
        });
		addNot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	try {
            		  Desktop desktop = java.awt.Desktop.getDesktop();
            		  URI oURL = new URI("https://drive.google.com/drive/u/3/folders/1kzzhCDryZ8ZnJxRr8rwSYrF9f49X9AzB");
            		  desktop.browse(oURL);
            		} catch (Exception e1) {
            		  e1.printStackTrace();
            		}
            }
        });
	}
	public void Addclass() {
		Scanner obj = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		String sh = obj.toString();
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
		System.out.println("Enter the timing of the class(in the format '9:00 - 10:00'):");
		String str= obj.nextLine();
		System.out.println("Enter the name of the class in short:");
		String name=obj.nextLine();
		System.out.println("Enter the link for the class:");
		String link= obj.nextLine();
		try {
		      FileWriter myWriter = new FileWriter(sh);
		      myWriter.write(str+"\n"+name+"\n"+link);
		      myWriter.close();
		      System.out.println("Class has successfully been Added");
		    } catch (IOException e) {
		      System.out.println("An error occurred!!Please try again later");
		      e.printStackTrace();
		      }
		obj.close();
	}
}
public class Teacher extends RadioButton {

	public static void main(String[] args) {
		teach t = new teach();
        t.setBounds(0, 0, 1000, 800);
        t.setTitle("Teacher Page");
        t.setVisible(true);

	}

}
