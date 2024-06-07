public class Hexagono {

    double lado;

    Hexagono (double lado) {
        this.lado = lado;
    }

    double calculoArea (){
        double area = 6 * lado * Math.sqrt(3.0/4.0);
        return area;
    }

    double calculoPerimetro () {
        double perimetro = lado * 6;
        return  perimetro;
    }



}

