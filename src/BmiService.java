public class BmiService {
    public double calculate(double weight, double height){ // метод принимает вес, рост и возвращает индекс массы тела
        // как рассчитать индекс массы тела, существует простой ответ: необходимо вес (в килограммах)
        // разделить на возведенный в квадрат рост (в метрах), то есть
        // ИМТ = вес (кг): (рост (м))2

        double heightMeter = height/100;
        double bmi = weight / (heightMeter * heightMeter);
        return bmi; //  возвращаем bmi

    }
}
