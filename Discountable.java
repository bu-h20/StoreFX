 
public interface Discountable { 
    public abstract String getCode(); 
    public abstract void setCode(String code); 
     
    public abstract double getBeforDiscount(); 
    public abstract void setBeforDiscount(double beforDiscount); 
     
    public abstract double getAfterDiscount(); 
    public abstract void setAfterDiscount(double afterDiscount); 
     
    public abstract double getPercentOfDiscount(); 
    public abstract void setPercentOfDiscount(double 
afterDiscount); 
}
