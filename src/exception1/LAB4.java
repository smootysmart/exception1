package exception1;

public class LAB4 {
    //Answer1
//    public static void main(String[] args) {
//    try{
//            System.out.println("statement1");
//            System.out.println("statement2");
//            System.out.println("statement3");
//    }
//    catch(ArrayIndexOutOfBoundsException e){    }
//    catch(ArithmeticException e){ 
//        throw new StringIndexOutOfBoundsException();
//    }
//    finally {
//        System.out.println("statement4");
//    }
//        System.out.println("statement5");
//}

//Answer 2    
//    public static void main(String[] args) {
//    try{
//            System.out.println("statement1");
//            System.out.println(1/0);
//            System.out.println("statement2");
//            System.out.println("statement3");
//    }
//    catch(ArrayIndexOutOfBoundsException e){    }
//    catch(ArithmeticException e){ 
//        throw new StringIndexOutOfBoundsException();
//    }
//    finally {
//        System.out.println("statement4");
//    }
//        System.out.println("statement5");
//}
    
//Answer 3
//      public static void main(String[] args) {
//            String s ="abc";
//        try{
//            System.out.println("statement1");
//            System.out.println(s.charAt(3));
//            System.out.println("statement2");
//            System.out.println("statement3");
//    }
//    catch(ArrayIndexOutOfBoundsException e){    }
//    catch(ArithmeticException e){ 
//        throw new StringIndexOutOfBoundsException();
//    }
//    finally {
//        System.out.println("statement4");
//    }
//        System.out.println("statement5");
//}
    
//Answer 4
          public static void main(String[] args) {
            Object o = null;
        try{
            System.out.println("statement1");
            System.out.println(o.toString());
            System.out.println("statement2");
            System.out.println("statement3");
    }
    catch(ArrayIndexOutOfBoundsException e){    }
    catch(ArithmeticException e){ 
        throw new StringIndexOutOfBoundsException();
    }
    finally {
        System.out.println("statement4");
    }
        System.out.println("statement5");
}
}
