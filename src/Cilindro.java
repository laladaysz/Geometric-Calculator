public class Cilindro {

    double raio;
    double altura;

    Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    double calculoVolume () {
        double volume = Math.PI * Math.pow(raio, 2);
        return volume;
    }

    double calculoArea (){
        double area = (2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio, 2));
        return  area;
    }

}
