import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ColesBirthday implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton("?????", new ImageIcon("C:\\Users\\griff\\OneDrive\\Pictures\\—Pngtree—blue cartoon gift vector cartoon_4659617.png"));
    JButton happyBirthday = new JButton("", new ImageIcon("G:\\My Drive\\img-NVzlWEFQ-large.jpg"));
    ColesBirthday(){
        addComponents();
        addActionEvent();
    }
    public void addComponents(){
        frame.setLayout(new FlowLayout());
        frame.setSize(2000, 2000);

        myButton.setBounds(100,100,frame.getWidth()/2,frame.getHeight()/2);
        myButton.setSelected(false);
        myButton.setFocusable(false);

        frame.setVisible(true);
        frame.add(myButton);

        happyBirthday.setBounds(100,50,frame.getWidth()/2,frame.getHeight()/2);
        happyBirthday.setSelected(false);
        happyBirthday.setFocusable(false);
        happyBirthday.setVisible(false);
        frame.add(happyBirthday);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        ColesBirthday ayyYuh = new ColesBirthday();
    }


    public void addActionEvent(){

        myButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source==myButton) {
            myButton.setVisible(false);
            happyBirthday.setVisible(true);
        }
    }
}