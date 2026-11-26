interface Bank {
    double getRateOfInterest();
}
class SBI implements Bank {
    public double getRateOfInterest() {
        return 7.5; 
    }
}
class HDFC implements Bank {
    
    public double getRateOfInterest() {
        return 8.0;
    }
}
class ICICI implements Bank {
    public double getRateOfInterest() {
        return 7.75; 
    }
}
public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();
        
        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%");
    }
}