package mypack;
import java.sql.*;
import java.util.*;
public class myclass {
    // Database URL
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/assignment";

    public static void main(String[] args) {
        try {
            // Create a connection to the database
            Connection conn = DriverManager.getConnection(DATABASE_URL,"root","Guru@1253");
            System.out.println("Connected to the database");

            // Create the student table if it doesn't exist
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student (rno INT PRIMARY KEY, name VARCHAR(50), mark1 INT, mark2 int)");

            // Create the classroom table if it doesn't exist
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS classroom (id INT PRIMARY KEY, section VARCHAR(10), capacity INT, foreign key (id) references student(rno))");

            // Display the menu and prompt the user for a choice
            int choice = 0;
            try (Scanner sc = new Scanner(System.in)) {
				while (choice != 4) {
				    System.out.println("\nPlease enter your choice:\n1. Enter student details\n2. Enter classroom details\n3. Show the list of student and classroom details from the database\n4. Exit");
				    choice = sc.nextInt();

				    switch (choice) {
				        case 1:
				            // Prompt the user for student details
				            System.out.println("Enter student ID: ");
				            int studentId = sc.nextInt();
				            sc.nextLine();
				            System.out.println("Enter student name: ");
				            String studentName = sc.nextLine();
				            System.out.println("Enter student mark1: ");
				            int studentMark1 = sc.nextInt();
				            System.out.println("Enter student mark2: ");
				           int studentMark2=sc.nextInt();
				           System.out.print("Hello");
				            // Insert the student details into the database
				            PreparedStatement studentStmt = conn.prepareStatement("INSERT INTO student (rno, name, mark1, mark2) VALUES (?, ?, ?, ?)");
				            System.out.print("After Insertion");
				            
				            studentStmt.setInt(1, studentId);
				            studentStmt.setString(2, studentName);
				            studentStmt.setInt(3, studentMark1);
				            studentStmt.setInt(4, studentMark2);
                            if(studentStmt.executeUpdate()>0)
                            {
				            System.out.println("Student details inserted successfully");
                            }
				            break;

				        case 2:
				            // Prompt the user for classroom details
				            System.out.print("Enter classroom ID: ");
				            int classroomId = sc.nextInt();
				         
				            System.out.print("Enter section: ");
				            String section = sc.next();
				            System.out.print("Enter capacity: ");
				            int capacity = sc.nextInt();

				            // Insert the classroom details into the database
				            PreparedStatement classroomStmt = conn.prepareStatement("INSERT INTO classroom (id, section, capacity) VALUES (?,  ?, ?)");
				            classroomStmt.setInt(1, classroomId);
				            
				            classroomStmt.setString(2, section);
				            classroomStmt.setInt(3, capacity);
				            if(classroomStmt.executeUpdate()>0)
				            {
				            System.out.println("Classroom details inserted successfully");
				            }
				            break;

				        case 3:
				            // Show the list of student and classroom details from the database
				            ResultSet rs = stmt.executeQuery("SELECT * FROM student JOIN classroom ON student.rno = classroom.id");
				            while (rs.next()) {
				                System.out.println("Student ID: " + rs.getInt("rno"));
				                System.out.println("Student name: " + rs.getString("name"));
				                System.out.println("Student mark1: " + rs.getInt("mark1"));
				                System.out.println("Student mark2: " + rs.getInt("mark2"));  
				                System.out.println("Classroom ID: " + rs.getInt("id"));
				                
				                System.out.println("Classroom section: " + rs.getString("section"));
				                System.out.println("Classroom capacity: " + rs.getInt("capacity"));  
				            }
				            break;
				        case 4:
				           break;
				        default:
				        	System.out.println("Choose correct choice");                  	
				    }
				}
			}
            ResultSet rs = stmt.executeQuery("select rno,name,sum(mark1+mark2) as totalmarks,(mark1+mark2)/2 as average from student group by rno");
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("rno"));
                System.out.println("Student name: " + rs.getString("name"));
                System.out.println("Student totalmarks: " + rs.getInt("totalmarks"));
                System.out.println("Student marks average: " + rs.getInt("average"));  
            }
            ResultSet r = stmt.executeQuery("select rno,name,sum(mark1+mark2) as totalmarks from student group by rno order by totalmarks");
            while (r.next()) {
            	System.out.println("Student ID: " + r.getInt("rno"));
                System.out.println("Student name: " + r.getString("name"));
                System.out.println("Student totalmarks: " + r.getInt("totalmarks"));
               
    
        }
        }
        catch(Exception e)
        {}
    }
}