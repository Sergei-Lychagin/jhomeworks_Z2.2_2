public class Main {
    public static void main(String[] args) throws Exception {
        BmiService service = new BmiService();
        double index = service.calculate(76.50, 1.80);
        System.out.printf("%.2f\n",index);
    }
}
