public class BmiService {
    public double calculate(int massa, double height) {
        double indeks;
        double height2;
        height2 = height * height;
        indeks = massa / height2;
        return indeks;
    }
}