package Day12_ExceptionHandling._1weInClass;

public class Exception {
    public static void main(String[] args) {
        p();
    }
    static void p(){
        try{
            n();
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
    static void n() throws IndexOutOfBoundsException{
        m(100);
        throw new IndexOutOfBoundsException("IOBE from m method");
    }
    static void m(int x) throws IndexOutOfBoundsException{
        if(x>100){
            throw new IndexOutOfBoundsException("this is IndexOutOfBoundException");
        }
    }
}
