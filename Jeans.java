public class Jeans extends Clothes implements  Discountable{ 
    private String typeOfJeans; 
    private boolean isAvailable; 
    private double percentOfDiscount; 
    private double beforDiscount; 
    private double afterDiscount; 
    private String code; 
 
 
    Jeans(){ 
 
    this.code = "new20"; 
    this.percentOfDiscount= 20;} 
 
    Jeans(String typeOfJeans, String color, String size, double 
price){ 
    this.typeOfJeans = typeOfJeans; 
    super.setSize(size); 
    super.setColor(color); 
    super.setPrice(price);} 
 
    public String getTypeOfJeans() { 
        return typeOfJeans; 
    } 
 
    public void setTypeOfJeans(String typeOfJeans) { 
        this.typeOfJeans = typeOfJeans; 
    } 
     
     
         
     
    public boolean isIsAvailable() { 
        return isAvailable; 
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
        return "Jeans{" + "typeOfJeans=" + typeOfJeans + ", 
isAvailable=" + isAvailable + ", percentOfDiscount=" + 
percentOfDiscount + ", beforDiscount=" + beforDiscount + ", 
afterDiscount=" + afterDiscount + ", code=" + code + '}'; 
    } 
 
} 





