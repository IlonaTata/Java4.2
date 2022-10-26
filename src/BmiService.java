public class BmiService {
    public double calculate(int weight, double height) {
        double indeks;
        double height2;
        height2 = height * height;
        indeks = weight / height2;
        return indeks;
    }
}