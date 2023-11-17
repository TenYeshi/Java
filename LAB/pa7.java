import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pa7 extends Applet implements ActionListener {
    Label nameL, mark1, mark2, mark3;
    Label resultName, resultAvg, resultDevision;
    TextField nameTF, mark1Field, mark2Field, mark3Field;
    Button calButton;
    public void init(){
        setLayout(null);

        Font font = new Font("Time New Roman", 2, 18);
        setFont(font);

        //Name Label
        nameL = new Label("Name : ");
        nameL.setBounds(10, 30, 60, 30);
        add(nameL);

        // Name TextField
        nameTF = new TextField();
        nameTF.setBounds(100, 30, 200, 30);
        add(nameTF);

        // Mark1 Label 
        mark1 = new Label("Mark 1 :");
        mark1.setBounds(10, 80, 60, 30);
        add(mark1);

        //Mark1 TextField
        mark1Field = new TextField();
        mark1Field.setBounds(100, 80, 200, 30);
        add(mark1Field);

        // Mark2 Label 
        mark1 = new Label("Mark 2 :");
        mark1.setBounds(10, 130, 60, 30);
        add(mark1);

        //Mark2 TextField
        mark1Field = new TextField();
        mark1Field.setBounds(100, 130, 200, 30);
        add(mark1Field);

        // Mark3 Label 
        mark1 = new Label("Mark 3 :");
        mark1.setBounds(10, 180, 60, 30);
        add(mark1);

        //Mark3 TextField
        mark1Field = new TextField();
        mark1Field.setBounds(100, 180, 200, 30);
        add(mark1Field);

        //Adding the calculate Button
        calButton = new Button("Calculate ");
        calButton.setBounds(150, 230, 100, 30);
        add(calButton);

        calButton.addActionListener(this);

    }
    public void paint(Graphics g){
        g.drawString("Student Report", 10, 20);
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        int mark1 = Integer.parseInt(mark1Field.getText());
        int mark2 = Integer.parseInt(mark2Field.getText());
        int mark3 = Integer.parseInt(mark3Field.getText());

        int avg = (mark1 + mark2 + mark3) / 3;
        System.out.println(avg);
    }
}



/*
* <applet code='pa7.class' width=400 height=600 >
* </applet>
* 
*/