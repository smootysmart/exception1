package exception1;

public class LAB5 {
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try{
            doThis();
        }
        catch(Exception e){
            System.out.println("Main method recieve exception " + e.getMessage());
    }
}
    public static void doThis() throws Exception{
            System.out.println("Method doThis() call method doThat()");
            doThat();
        }
    public static void doThat() throws Exception{
        System.out.println(1/0);
//        throw new Exception("Hello");
    }
}
