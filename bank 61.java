import java.util.*;
class Bank 
{ 
    float getROI() 
    { 
        return 0; 
    } 
} 
class SBI extends Bank 
{ 
    float getROI() 
    { 
        return 8.4f; 
    } 
} 
class ICICI extends Bank 
{ 
    float getROI() 
    { 
        return 7.3f; 
    } 
} 
class AXIS extends Bank 
{ 
    float getROI() 
    { 
        return 9.7f; 
    } 
} 
 
public class Interest5
{ 
    public static void main(String[] args) 
	{ 
        Bank b; 
        b = new SBI(); 
        System.out.println("SBI: " + b.getROI()+"%"); 
	Bank c; 
        c = new ICICI(); 
        System.out.println("ICICI: " + c.getROI()+"%"); 
	Bank d; 
        d = new AXIS(); 
        System.out.println("AXIS: " + d.getROI()+"%"); 
    	} 
} 
