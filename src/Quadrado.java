public class Quadrado {
// calcula area e perimetro

    double lado;

    Quadrado(double lado){ //recebendo parametro via construtor
        this.lado = lado;
    }

    double calculoArea (){
       return lado*lado;
    }

    double calculoPerimetro () {
        double perimetro = 4 * lado;
        return perimetro;
    }

}
