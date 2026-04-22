
public class User { 
 
 protected String firstName ; 
 protected String lastName; 
 private String username; 
 private String password; 
 private String number; 
 private String email ; 
  
 
    public User() { 
        firstName = "Bushra"; 
        lastName = "Al-Harbi"; 
        username = "User123"; 
        password = "Arl@159"; 
        number = "0539371052"; 
        email = "Bu.ar@gmail.com"; 
    } 
 
    public User(String firstName, String lastName, String number, 
String email) { 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.number = number; 
        this.email = email; 
    } 
 
     
    public User( String username , String password) { 
        this.username = username; 
        this.password =  password; 
    } 
 
    public String getFirstName() { 
        return firstName; 
    } 
 
    public String getLastName() { 
        return lastName; 
    } 
 
    public String getUsername() { 
        return username; 
    } 
 
 
    public String getPassword() { 
        return password; 
    } 
 
    public String getNumber() { 
        return number; 
    } 
 
    public String getEmail() { 
        return email; 
    } 
 
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    } 
 
    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    } 
 
    public void setUsername(String username) { 
        this.username = username; 
    } 
 
    public void setPassword(String password) { 
        this.password = password; 
    } 
 
    public void setNumber(String number) { 
        this.number = number; 
    } 
 
    public void setEmail(String email) { 
        this.email = email; 
    } 
 
    @Override 
    public String toString() { 
        return "User{" + 
                "firstName='" + firstName + '\'' + ", 
lastName='" + lastName + '\'' + ", username='" + username 
+ '\'' + 
                ", password='" + password + '\'' + ", 
number='" + number + '\'' +  ", email='" + email + '\'' + 
'}'; 
     
} 
     
         
    } 
