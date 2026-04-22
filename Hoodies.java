import java.io.File; 
import java.io.IOException; 
import java.io.PrintWriter; 
 
 
public class Hoodies extends Clothes implements Discountable { 
    private boolean withHat;   
    private boolean isAvailable; 
    private double percentOfDiscount; 
    private double beforDiscount; 
    private double afterDiscount; 
    private String code; 
     
    Hoodies(){ 
    this.beforDiscount = 250; 
    this.code = "new20"; 
    this.percentOfDiscount= 20; 
    this.afterDiscount = 200; 
    this.withHat = true; 
    this.isAvailable = true; 
    } 
     
 
    public Hoodies(String color, String size , boolean withHat , 
double price  ) { 
    super.setColor(color); 
    super.setSize(size); 
    super.setPrice(price); 
    this.withHat = withHat; 
       
         
    } 
 
 
 
    public boolean isWithHat() { 
        return withHat; 
    } 
 
    public boolean isIsAvailable() { 
        return isAvailable; 
    } 
 
    public void setWithHat(boolean withHat) { 
        this.withHat = withHat; 
    } 
 
    public void setIsAvailable(boolean isAvailable) { 
        this.isAvailable = isAvailable; 
    } 
 @Override 
    public String getCode() { 
    return code;    } 
 
 
 
    @Override 
    public double getBeforDiscount() { 
    return getPrice();    } 
 
 
 
    @Override 
    public double getAfterDiscount() { 
     return  (getPrice())-((getPrice()*(percentOfDiscount)/100));  } 
 
    @Override 
    public void setCode(String code) { 
     this.code = code;   } 
 
    @Override 
    public void setBeforDiscount(double beforDiscount) { 
     this.beforDiscount = beforDiscount; } 
 
    @Override 
    public void setAfterDiscount(double afterDiscount) { 
    this.afterDiscount = afterDiscount;    } 
 
    @Override 
    public double getPercentOfDiscount() { 
    return percentOfDiscount; } 
 
    @Override 
    public void setPercentOfDiscount(double percentOfDiscount) { 
    this.percentOfDiscount = percentOfDiscount;     
    } 
 
    @Override
     public String toString() { 
        return "Hoodies{" + "withHat=" + withHat + ", 
isAvailable=" + isAvailable + '}'; 
    } 
 
 
public  void writeHoodies(String fileName) { 
    File f = new File(fileName); 
    try { 
        PrintWriter x = new PrintWriter(f); 
        x.println("Color  |   Size   | Price"); 
        x.println("White  | S/M/L/XL | 250SAR"); 
        x.println("Black  | S/M/L/XL | 250SAR"); 
        x.println("purble | S/M/L/XL | 250SAR"); 
        x.close(); 
    } catch (IOException e) { 
        System.out.println("An error occurred while writing to the 
file: " + fileName); 
    } 
    } 
         
        } 
