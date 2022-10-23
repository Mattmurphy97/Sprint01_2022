import java.io.*;
import java.util.*;

public class TestCrud {
    public static void main(String[] args) throws IOException {

        Person testPerson = new Person("Matt Murphy", "1231231231", "m@m.m");

        Scanner sc = new Scanner(System.in);
        FileWriter appendFile = new FileWriter("Database\\db.txt");
        appendFile.write(testPerson.getName());
        appendFile.write(csv());
        appendFile.write(testPerson.getPhone());
        appendFile.write(csv());
        appendFile.close();
    }

    public static String csv() {
        return ", ";
    }
}
