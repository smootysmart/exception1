package exception1;



public class LAB1 {
    public static void main(String[] args) {
        //System.out.println(1/0);
        //^ ArithmeticException Error
        
        //int[] list = new int[5];
        //System.out.println(list[5]);
        //^ArrayIndexOutOfBoundException
    
        //String s ="abc";
        //System.out.println(s.charAt(3));
        //^StringIndexOutOfBoundException
    
        //Object o = new Object();
        //String s = (String)o;
        //^ClassCastException
        
        //Object o = null;
        //System.out.println(o.toString());
        //^NullPointerException
        
        System.out.println(1.0/0);
    }
}
