import javax.swing.*;

import java.awt.Desktop;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.TimeZone;
class stud extends JFrame{
	JButton cls;
	JButton asg;
	JButton Not;
	//JButton exit;
	JLabel L1;
	public stud() {
		this.setLayout(null);
		cls= new JButton("Today's classes");
		asg= new JButton(" Assignment updates");
		Not = new JButton("Notes");
		//exit = new JButton("close");
		L1= new JLabel("Welcome Student");
		cls.setBounds(300,100,200,50);
		asg.setBounds(300,200,200,50);
		Not.setBounds(300,300,200,50);
		//exit.setBounds(EXIT_ON_CLOSE, ABORT, 200,50);
		L1.setBounds(50, 50, 100, 100);
		this.add(cls);
		this.add(asg);
		this.add(Not);
		cls.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	//class();
            	student1 s0 = new student1();
            	s0.main(null);
            }
        });
		asg.addActionListener(new ActionListener() {
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
		Not.addActionListener(new ActionListener() {
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
}
public class Student extends RadioButton {
	public static void main(String[] args)
	{
		stud s = new stud();
        s.setBounds(0, 0, 1000, 800);
        s.setTitle("Stutdent Page");
        s.setVisible(true);

	}
}
