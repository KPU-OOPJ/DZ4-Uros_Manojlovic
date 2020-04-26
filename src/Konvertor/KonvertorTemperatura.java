package Konvertor;

public class KonvertorTemperatura {
    
    public double konvertujCuF(double a){
        return (a*9)/5+32;
    }
    
    public double konvertujFuC(double a){
        return (a-32)*(5-9);
    }
}
