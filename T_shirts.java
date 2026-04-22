public class T_shirts extends Clothes implements  Discountable{ 
    private String Fabric; 
    private boolean isAvailable; 
    private double percentOfDiscount; 
    private double beforDiscount; 
    private double afterDiscount; 
    private String code; 
     
    T_shirts(){ 
    this.beforDiscount = 250; 
    this.code = "new20"; 
    this.percentOfDiscount= 20; 
    this.afterDiscount = 200; 
    this.percentOfDiscount= 20; 
    } 
     
    T_shirts(String Fabric, String color, String size, double price){ 
        this.Fabric = Fabric; 
        super.setSize(size); 
        super.setColor(color); 
        super.setPrice(price); 
         
    } 
     
 
 
    public String getFabric() { 
        return Fabric; 
    } 
     
    public boolean isIsAvailable() { 
        return isAvailable; 
    } 
 
    public void setFabric(String Fabric) { 
        this.Fabric = Fabric; 
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
        return "T_shirts{" + 
                "Fabric='" + Fabric + '\'' + ", isAvailable=" + 
isAvailable + ", discountCode='" +  
                ", percentOfDiscount=" + percentOfDiscount + ", 
beforeDiscount=" + getBeforDiscount() + ", afterDiscount=" + 
getAfterDiscount() + 
                ", code='" + code + '\'' + ", color='" + getColor() + 
'\'' + ", size='" + getSize() + '\'' + ", price=" + 
getPrice() + '}'; 
    } 
} 






  
