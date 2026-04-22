public abstract class Clothes { 
        
       private String color; 
       private String size; 
       private double price; 
 
    public Clothes() {   } 
 
        
    public Clothes(String color, String size, double price) { 
        this.color = color; 
        this.size = size; 
        this.price = price; 
    } 
 
    public String getColor() { 
        return color; 
    } 
 
    public String getSize() { 
        return size; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    public void setColor(String color) { 
        this.color = color; 
    } 
 
    public void setSize(String size) { 
        this.size = size; 
    } 
 
    public void setPrice(double price) { 
        this.price = price; 
    } 
 
    @Override 
    public String toString() { 
        return "Clothes{" + "color=" + color + ", 
size=" + size + ", price=" + price + '}'; 
    } 
     
} 
