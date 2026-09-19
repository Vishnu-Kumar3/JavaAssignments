import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener
{
    JTextField num1, num2, result;
    JButton add,subtract;

    calculator()
    {
        setTitle("Simple Calculator");
        setSize(350,250);
        setLayout(new GridLayout(4,2,10,10));

        JLabel l1 = new JLabel("Number 1:");
        JLabel l2 = new JLabel("Number 2:");
        JLabel l3 = new JLabel("Result:");

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("Add");
        subtract = new JButton("Subtract");

        add.addActionListener(this);
        subtract.addActionListener(this);

        add(l1);
        add(num1);

        add(l2);
        add(num2);

        add(add);
        add(subtract);

        add(l3);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());

        if(e.getSource() == add)
        {
            result.setText(String.valueOf(n1 + n2));
        }
        else if(e.getSource() == subtract)
        {
            result.setText(String.valueOf(n1 - n2));
        }
    }

    public static void main(String[] args)
    {
        new calculator();
    }
}
