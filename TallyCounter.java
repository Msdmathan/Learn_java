import java.awt.*;
import java.awt.event.*;
class TallyCounter extends Frame{
    TextField display;
    Button increment,decrement,reset;


    TallyCounter(){
        display = new TextField("0");
        display.setBounds(100,100,300,30);
        display.setEditable(false);

        increment = new Button("INCREMENT");
        increment.setBounds(100,150,140,30);
        increment.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int count = Integer.parseInt(display.getText());
                count++;
                display.setText(Integer.toString(count));

            }
        });
        

        decrement = new Button("DECREMENT");
        decrement.setBounds(260,150,140,30);
        decrement.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int count = Integer.parseInt(display.getText());
                if (count<=0){
                display.setText("0");
            }
            else{
                count--;
                display.setText(Integer.toString(count));
            }}
        });
        


        reset = new Button("RESET");
        reset.setBounds(100,200,300,30);
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText("0");
            }
        });
        addWindowListener(new WindowAapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        add(display);
        add(increment);
        add(decrement);
        add(reset);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }
    public static void main(String[] args){
        new TallyCounter();
    }
}
