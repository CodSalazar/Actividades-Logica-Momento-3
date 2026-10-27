class Carro {
    
     String marca;
     int velocidad;

    public Carro(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void encender() {
        System.out.println("El carro " + marca + " está encendido.");
    }

    public void acelerar(int incremento) {
        velocidad = velocidad + incremento;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public int consultarVelocidad() {
        return velocidad;
    }


}
public class Main{

    public static void main(String[] args) {

        Carro miCarro = new Carro("Toyota");

        miCarro.encender();
        miCarro.acelerar(50);
        int velocidadActual = miCarro.consultarVelocidad();

        System.out.println("El carro va a: " + velocidadActual + " km/h");

        Carro miCarro2 = new Carro("Mazda");

        miCarro2.encender();
        miCarro2.acelerar(70);
        int velocidadActual2 = miCarro2.consultarVelocidad();

        System.out.println("El carro va a: " + velocidadActual2 + " km/h");
    
    }
}