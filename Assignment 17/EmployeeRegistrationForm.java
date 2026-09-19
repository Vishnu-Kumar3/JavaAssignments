import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistrationForm extends JFrame implements ActionListener
{
    JLabel idLabel, nameLabel, deptLabel, salaryLabel;
    JTextField idField, nameField, deptField, salaryField;
    JButton submitButton;

    EmployeeRegistrationForm()
    {
        setTitle("Employee Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        idLabel = new JLabel("Employee ID:");
        nameLabel = new JLabel("Name:");
        deptLabel = new JLabel("Department:");
        salaryLabel = new JLabel("Salary:");

        // Text fields
        idField = new JTextField();
        nameField = new JTextField();
        deptField = new JTextField();
        salaryField = new JTextField();

        // Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components
        add(idLabel);
        add(idField);

        add(nameLabel);
        add(nameField);

        add(deptLabel);
        add(deptField);

        add(salaryLabel);
        add(salaryField);

        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String id = idField.getText();
        String name = nameField.getText();
        String department = deptField.getText();
        String salary = salaryField.getText();

        JOptionPane.showMessageDialog(this,
            "Employee Details\n\n" +
            "Employee ID: " + id +
            "\nName: " + name +
            "\nDepartment: " + department +
            "\nSalary: " + salary);
    }

    public static void main(String[] args)
    {
        new EmployeeRegistrationForm();
    }
}