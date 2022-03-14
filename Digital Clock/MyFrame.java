import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	//Calendar calendar;
	SimpleDateFormat timeFormat;
	JLabel timeLabel;  //for date
	JLabel dayLabel;  //for day
	SimpleDateFormat dayFormat;
	String time,day;
	//Displaying date underneath Day-
	SimpleDateFormat dateFormat;
	JLabel dateLabel;
	String date;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Digital Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		timeLabel = new JLabel();
		dayLabel = new JLabel();
		
		this.add(timeLabel);
		timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel= new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
		
		dateLabel= new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		
		this.setVisible(true);
		this.add(dayLabel);
		this.add(dateLabel);		
		setTime();
	}
	
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);

		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
} 



