public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 98F;
        float height = 1.91F;
        int index = service.calculate(weight, height);
        System.out.println("Your index is:");
        System.out.println(index);
    }
}
