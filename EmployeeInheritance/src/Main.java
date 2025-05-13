import com.yuvam.employee.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Employee e1 = new ProductionWorker("Yuvam" , "01", "01-01-2025" , 1, 25);
        System.out.println(e1.toString());
    }
}