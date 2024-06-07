public class Paralelepipedo {

    double comprimento;
    double altura;
    double largura;

    Paralelepipedo ( double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    double calculoVolume (){
        double volume = comprimento * altura * largura;
        return volume;
    }

    double calculoArea () {
        double area = 2 * ((comprimento * altura)+(altura*largura)+(comprimento*largura));
        return area;
    }

}
