public class Cone {

    double altura;
    double geratriz;
    double raio;

    Cone(double altura, double geratriz, double raio){
        this.altura = altura;
        this.geratriz = geratriz;
        this.raio = raio;
    }

    double calculoVolume (){
        double volume = 1/3 * Math.PI * Math.pow(raio, 2.0) * altura;
        return volume;
    }

    double calculoArea() {
        double area = Math.PI * raio * Math.sqrt(Math.pow(altura, 2.0) + Math.pow(raio, 2.0));
        return area;
    }

}
