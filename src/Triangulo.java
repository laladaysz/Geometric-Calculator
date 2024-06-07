public class Triangulo {

    double lado;

    Triangulo (double lado) {
        this.lado = lado;
    }

    double calculoArea () {
        double area = lado * Math.sqrt(3.0/4.0);
        return area;
    }

    double calculoPerimetro (){
        double perimetro = lado * 3;
        return  perimetro;
    }






}
