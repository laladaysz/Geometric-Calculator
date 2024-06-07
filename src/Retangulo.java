public class Retangulo {

    double base;
    double altura;

    Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calculoArea () {
        double area;
        return area = base * altura;
    }

    double calculoPerimetro () {
        double perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

}
