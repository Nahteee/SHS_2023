import javax.swing.*;
import main.java.SHS.Gender;
import main.java.SHS.Student;
import main.java.SHS.UserRole;

public class StudentProfileUI {
    private Student student; // Assuming you have a Student object
    
    public StudentProfileUI(Student student) {
        this.student = student;
        
        // Create UI components
        JFrame frame = new JFrame("Student Profile");
        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Name: " + student.getFullname());
        JLabel emailLabel = new JLabel("Email: " + student.getUserEmail());
        JLabel ageLabel = new JLabel("Age: " + student.getAge());
        JLabel genderLabel = new JLabel("Gender: " + student.getGender());
        JLabel contactLabel = new JLabel("Contact: " + student.getContact());
        
        // Set panel layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Add components to the panel
        panel.add(nameLabel);
        panel.add(emailLabel);
        panel.add(ageLabel);
        panel.add(genderLabel);
        panel.add(contactLabel);
        
        // Add panel to the frame
        frame.getContentPane().add(panel);
        
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create a sample student object
        Student student = new Student(1, "John", "John Doe", "john@gmail.com", "password", 20, Gender.MALE, "123456789", "card", UserRole.STUDENT);
        
        // Create the student profile UI
        StudentProfileUI profileUI = new StudentProfileUI(student);
    }
}
