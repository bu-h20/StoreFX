import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
 
public class MainOfProject { 
 
    public static void main(String[] args) { 
         
        // Create 2 User objects 
        User user = new User(); 
        User user1 = new User("Lena", "Ahmed", "0556372682", 
"lena.doe@example.com"); 
        User user2 = new User("Rand", "Waleed", "0356279537", 
"Rand.doe@example.com"); 
         
 
        // Create 5 Hoodies objects 
        Hoodies hoodie1 = new Hoodies("White", "M", true, 250.0); 
        Hoodies hoodie2 = new Hoodies("Black", "L", false, 250.0); 
        Hoodies hoodie3 = new Hoodies("Purple", "S", true, 250.0); 
        Hoodies hoodie4 = new Hoodies("Gray", "XL", false, 250.0); 
        Hoodies hoodie5 = new Hoodies("Navy", "M", true, 250.0); 
 
        // Create 2 T-shirts objects 
        T_shirts tshirt1 = new T_shirts("Cotton", "Red", "M", 150); 
        T_shirts tshirt2 = new T_shirts("Polyester", "Blue", "L", 
150); 
        T_shirts tshirt3 = new T_shirts("Polyester", "Blue", "L", 
150); 
         
         
        // Create Jeans objects 
        Jeans jeans1 = new Jeans("Straight" , " Black " , "40" , 200); 
        Jeans jeans2 = new Jeans("Relazxed" , " Black " , "38" , 200); 
 
        //Populate T-shirt data from a file 
        Hoodies h = new Hoodies(); 
        h.writeHoodies("hoodies.txt"); 
        readHoodies("hoodies.txt"); 
 
        // Compare two User objects 
        boolean compare = equals(user1, user2); 
        if(compare){ 
            System.out.println("\nPasswords are 
equals\n"); 
        } 
        else System.out.println("\nPasswords are not 
equal\n"); 
// Call printReceipt() method 
        printReceipt(hoodie1); 
 
        // Call the calculateTotalRevenue method 
        List<Clothes> hoodiesList = new ArrayList<>(); 
        hoodiesList.add(hoodie1); 
        hoodiesList.add(hoodie2); 
        hoodiesList.add(hoodie3); 
        hoodiesList.add(hoodie4); 
        hoodiesList.add(hoodie5); 
         
        List<Clothes> tshirts = new ArrayList<>(); 
        tshirts.add(tshirt1); 
        tshirts.add(tshirt2); 
        tshirts.add(tshirt3); 
         
         
        System.out.println("\nTotal Revenue: " + 
(calculateTotalRevenue(hoodiesList) + calculateTotalRevenue(tshirts)) 
); 
 
        // Call Display() method 
        Display(user1, user2, hoodie1, hoodie2, hoodie3, hoodie4, 
hoodie5, tshirt1, tshirt2, tshirt3 , jeans1 , jeans2); 
    } 
 
 
public static void readHoodies(String fileName) { 
    File f = new File(fileName); 
    Scanner r = null; 
    try { 
        r = new Scanner(f); 
        while (r.hasNextLine()) { 
            String line = r.nextLine(); 
            System.out.println(line); 
        } 
    } catch (FileNotFoundException e) { 
        System.out.println("Error reading file: " + 
fileName); 
    } finally { 
        if (r != null) { 
            r.close(); 
        } 
    } 
 
    } 
 
public static boolean equals(Object obj1 , Object obj2) { 
    if (obj1 instanceof Clothes && obj2 instanceof Clothes 
) {  
 User a = (User) obj1; 
        User b = (User) obj2; 
        if (a.getPassword().equals(b.getPassword()))  
            return true;  
         else  
            return false;     
    } 
    else  
        return false; 
     
} 
 
 
    public static void printReceipt(Clothes a) { 
        System.out.println("Receipt:"); 
        System.out.println("Color: " + a.getColor()); 
        System.out.println("Size: " + a.getSize()); 
        System.out.println("Price: " + a.getPrice()); 
         
    } 
     
    public static double calculateTotalRevenue(List<Clothes> clothes) 
{ 
    double totalRevenue = 0; 
    for (Clothes c : clothes) { 
        totalRevenue += c.getPrice(); 
    } 
    return totalRevenue; 
} 
 
 
 
    public static void Display(User user1, User user2, Hoodies 
hoodie1, Hoodies hoodie2, Hoodies hoodie3, Hoodies hoodie4, Hoodies 
hoodie5, T_shirts tshirt1, T_shirts tshirt2, T_shirts tshirt3 , Jeans 
jeans1 , Jeans jeans2) { 
        System.out.println("\nUser Information:"); 
        System.out.println("user 1:" + user1.getFirstName() + " " + 
user1.getLastName() + ", " + user1.getNumber() + ", " +  
user1.getEmail() ); 
        System.out.println("user 2:" + 
user2.getFirstName() + " "+user2.getLastName() + ", " + 
user2.getNumber() + ", " +  user2.getEmail() ); 
       System.out.println("\nHoodies Information:"); 
        System.out.println("Hoodie 1: " + hoodie1.getColor() + ", " + 
hoodie1.getSize() + ", " + hoodie1.getPrice() + ", With Hat: " + 
hoodie1.isWithHat()); 
        System.out.println("Hoodie 2: " + hoodie2.getColor() + ", " + 
hoodie2.getSize() + ", " + hoodie2.getPrice() + ", With Hat: " + 
hoodie2.isWithHat()); 
        System.out.println("Hoodie 3: " + hoodie3.getColor() + ", " + 
hoodie3.getSize() + ", " + hoodie3.getPrice() + ", With Hat: " + 
hoodie3.isWithHat()); 
        System.out.println("Hoodie 4: " + hoodie4.getColor() + ", " + 
hoodie4.getSize() + ", " + hoodie4.getPrice() + ", With Hat: " + 
hoodie4.isWithHat()); 
        System.out.println("Hoodie 5: " + hoodie5.getColor() + ", " + 
hoodie5.getSize() + ", " + hoodie5.getPrice() + ", With Hat: " + 
hoodie5.isWithHat()); 
 
        System.out.println("\nT-shirt Information:"); 
        System.out.println("T-shirt 1: " + tshirt1.getFabric() + ", " 
+ tshirt1.getColor() + ", " + tshirt1.getSize() + ", " + 
tshirt1.getPrice()); 
        System.out.println("T-shirt 2: " + tshirt2.getFabric() + ", " 
+ tshirt2.getColor() + ", " + tshirt2.getSize() + ", " + 
tshirt2.getPrice()); 
        System.out.println("T-shirt 3: " + tshirt3.getFabric() + ", " 
+ tshirt3.getColor() + ", " + tshirt3.getSize() + ", " + 
tshirt3.getPrice()); 
     
        System.out.println("\nJeans Information:"); 
        System.out.println("Jeans 1: "+  jeans1.getTypeOfJeans() + ", 
"  + jeans1.getColor() + ", " + jeans1.getSize() + ", " + 
jeans1.getPrice()); 
        System.out.println("Jeans 2: "+  jeans2.getTypeOfJeans() + ", 
"  + jeans2.getColor() + ", " + jeans2.getSize() + ", " + 
jeans2.getPrice()); 
 } 
}



  
