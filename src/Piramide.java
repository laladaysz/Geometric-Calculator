public class Piramide {

    double altura;
    double apotema;
    double arestaBase;

    Piramide(double altura, double apotema, double arestaBase){
        this.altura = altura;
        this.apotema = apotema;
        this.arestaBase = arestaBase;
    }

    double calculoArea () {
        double area = (2 * arestaBase * apotema) + Math.pow(arestaBase, 2);
        return area;
    }

    double calculoVolume (){
        double volume = ((arestaBase * 4) * altura)/3;
        return volume;
    }
}
