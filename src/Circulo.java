public class Circulo {

    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double calculoArea (){
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    double calculoPerimetro (){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}
