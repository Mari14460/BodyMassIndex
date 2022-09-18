public class Main {
    public static void main(String[] args) {
        double weight = 65; // вес в кг
        double height = 177;// рост в сантиметрах

        BmiService service = new BmiService(); // создаем instance (экземпляр объекта/копия)
        double bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}