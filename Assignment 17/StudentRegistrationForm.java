import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener
{
    JLabel nameLabel, ageLabel, genderLabel, courseLabel, hobbiesLabel;
    JTextField nameField, ageField;
    JRadioButton male, female;
    JComboBox<String> courseBox;
    JCheckBox sports, music, reading;
    JButton submitButton, clearButton;

    public StudentRegistrationForm()
    {
        setTitle("Student Registration Form");
        setSize(500, 450);
        setLayout(new GridLayout(7, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        // Age
        ageLabel = new JLabel("Age:");
        ageField = new JTextField();

        // Gender
        genderLabel = new JLabel("Gender:");

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);

        // Course
        courseLabel = new JLabel("Course:");

        String courses[] = {"CSE", "ECE", "Mechanical", "Civil"};
        courseBox = new JComboBox<>(courses);

        // Hobbies
        hobbiesLabel = new JLabel("Hobbies:");

        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        reading = new JCheckBox("Reading");

        JPanel hobbyPanel = new JPanel();
        hobbyPanel.add(sports);
        hobbyPanel.add(music);
        hobbyPanel.add(reading);

        // Buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components
        add(nameLabel);
        add(nameField);

        add(ageLabel);
        add(ageField);

        add(genderLabel);
        add(genderPanel);

        add(courseLabel);
        add(courseBox);

        add(hobbiesLabel);
        add(hobbyPanel);

        add(submitButton);
        add(clearButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submitButton)
        {
            String name = nameField.getText();
            String age = ageField.getText();
            String course = (String) courseBox.getSelectedItem();

            String gender = "";

            if(male.isSelected())
                gender = "Male";
            else if(female.isSelected())
                gender = "Female";

            String hobbies = "";

            if(sports.isSelected())
                hobbies += "Sports ";
            if(music.isSelected())
                hobbies += "Music ";
            if(reading.isSelected())
                hobbies += "Reading ";

            JOptionPane.showMessageDialog(this,
                    "Registration Successful!\n\n" +
                    "Name: " + name +
                    "\nAge: " + age +
                    "\nGender: " + gender +
                    "\nCourse: " + course +
                    "\nHobbies: " + hobbies);
        }

        if(e.getSource() == clearButton)
        {
            nameField.setText("");
            ageField.setText("");
            male.setSelected(false);
            female.setSelected(false);
            courseBox.setSelectedIndex(0);
            sports.setSelected(false);
            music.setSelected(false);
            reading.setSelected(false);
        }
    }

    public static void main(String[] args)
    {
        new StudentRegistrationForm();
    }
}