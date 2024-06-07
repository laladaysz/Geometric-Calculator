public class Cubo {

    double lado;

    Cubo (double lado) {
        this.lado = lado;
    }

    double calculoVolume () {
        double volume = Math.pow(lado, 3);
        return volume;
    }

    double areaSuperficial () {
        double area = Math.pow(lado, 2) * 6;
        return  area;
    }
}
