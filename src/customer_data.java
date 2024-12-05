import java.io.IOException;
import java.util.List;

public class customer_data {

private file handler;

public customer_data(){
    handler=new file("Data.txt");
}

public  void register (String first_name,String last_name,String email,String password,String phone_number,String address, int age, String gender) throws IOException {
    String record=String.join("/",first_name,last_name,email,password,phone_number,address,Integer.toString(age),gender);
List <String> data=file.read();

data.add(record);
file.write(data);
}
public boolean login(String email, String password) throws IOException {
    List<String> data = file.read();
    for (String record : data) {
            String[] fields = record.split("/");
            if (fields[2].equals(email) && fields[3].equals(password)) {
                System.out.println("Login successful! Welcome, " + fields[0] + " " + fields[1]);
                return true;
            }
        }
        System.out.println("Invalid email or password.");
        return false;
    }


}


