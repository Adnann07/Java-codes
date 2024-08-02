package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author HP
 */
public final class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        
        this.add(timeLabel);
          this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
        
        setTime();
    }
    
    public void setTime() {
        Runnable clockRunnable = new Runnable() {
            public void run() {
                while (true) {
                    time = timeFormat.format(Calendar.getInstance().getTime());
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            timeLabel.setText(time);
                        }
                    });
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread clockThread = new Thread(clockRunnable);
        clockThread.start();
    }
}
