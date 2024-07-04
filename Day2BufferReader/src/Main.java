//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.* ;
public class Main {
    public static void main(String[] args) {

        //Access Modifiers
        //                              private     default     protected   public
        //Same Class                    yes         yes         yes         yes
        //Same package subClass         No          yes         yes         yes
        //Same package non subClass     No          yes         yes         yes
        //Different package subClass    No          No          Yes         Yes
        //Same package non subClass     No          No          No          yes

        //sub class , inherited class , derived class , child class are one and the same
        //base class and parent class

        //Its common pratice to take input from scanner object
        //there are other ways to take input
        //we can take from file and as well as

        //reading string from console
        try {
            InputStreamReader i = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(i);
            System.out.println("Write ur message");
            String message = b.readLine();
            System.out.println("message : "+message);
        }catch (IOException e) {
            System.out.println("Could Not Read");
        }
        //Reading a file
        try {
            FileReader fr = new FileReader("Day2BufferReader/story.txt");
            int data;
            while((data = fr.read()) > 0){
                System.out.print((char)data);
            }
            fr.close(); // Always close the FileReader when done
        } catch (IOException e) {
            // Handle the exception gracefully
            // e.printStackTrace();
            System.out.println("Could Not Read");
        }

    }
}