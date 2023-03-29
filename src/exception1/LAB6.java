package exception1;

public class LAB6 {
    public static void main(String[] args) {
        try{
        System.out.println(1/0);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            StackTraceElement[] st = e.getStackTrace();
            for(int i = 0;i < st.length;i++){
                System.out.print(st[i].getClassName());
                System.out.print(st[i].getMethodName());
                System.out.print(st[i].getFileName());
                System.out.print(st[i].getLineNumber());
            }
        }
    }
}
