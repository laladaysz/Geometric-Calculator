public class Esfera {

    double raio;

    Esfera ( double raio){
        this.raio = raio;
    }

    double calculoArea (){
        double area = 4/3 * Math.PI * Math.pow(raio,2);
        return area;
    }

    double calculoVolume = 4/3 * Math.pow(raio, 3);
}
