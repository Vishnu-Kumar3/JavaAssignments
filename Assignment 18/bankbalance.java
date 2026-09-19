import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bankbalance extends JFrame implements ActionListener
{
    JTextField initialBalance, transactionAmount, balance;
    JButton deposit, withdraw;

    bankbalance()
    {
        setTitle("Bank Balance Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel l1 = new JLabel("Initial Balance:");
        JLabel l2 = new JLabel("Transaction Amount:");
        JLabel l3 = new JLabel("Updated Balance:");

        initialBalance = new JTextField();
        transactionAmount = new JTextField();
        balance = new JTextField();

        balance.setEditable(false);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        add(l1);
        add(initialBalance);

        add(l2);
        add(transactionAmount);

        add(deposit);
        add(withdraw);

        add(l3);
        add(balance);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double initial = Double.parseDouble(initialBalance.getText());
        double transaction = Double.parseDouble(transactionAmount.getText());

        if(e.getSource() == deposit)
        {
            double updated = initial + transaction;
            balance.setText(String.valueOf(updated));
        }
        else if(e.getSource() == withdraw)
        {
            double updated = initial - transaction;
            balance.setText(String.valueOf(updated));
        }
    }

    public static void main(String[] args)
    {
        new bankbalance();
    }
}