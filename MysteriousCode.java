import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MysteriousCode implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton("?????", new ImageIcon("—Pngtree—blue cartoon gift vector cartoon_4659617.png"));
    JButton happyBirthday = new JButton("", new ImageIcon("img-NVzlWEFQ-large.jpg"));
    JButton inside = new JButton("", new ImageIcon("Inside.png"));
    MysteriousCode(){
        addComponents();
        addActionEvent();
    }
    public void addComponents(){
        frame.setLayout(new FlowLayout());
        frame.setSize(2000, 2000);

        myButton.setBounds(frame.getWidth()/2,frame.getHeight()/4,500,500);
        myButton.setSelected(false);
        myButton.setFocusable(false);

        inside.setSelected(false);
        inside.setFocusable(false);
        inside.setVisible(false);

        frame.setVisible(true);
        frame.add(myButton);

        happyBirthday.setBounds(100,50,frame.getWidth()/2,frame.getHeight()/2);
        happyBirthday.setSelected(false);
        happyBirthday.setFocusable(false);
        happyBirthday.setVisible(false);
        frame.add(happyBirthday);
        frame.add(inside);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        MysteriousCode ayyYuh = new MysteriousCode();
    }


    public void addActionEvent(){

        myButton.addActionListener(this);
        happyBirthday.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source==myButton) {
            myButton.setVisible(false);
            happyBirthday.setVisible(true);
        }else if(source==happyBirthday){
            happyBirthday.setVisible(false);
            inside.setVisible(true);
        }
    }
}