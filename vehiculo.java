package vehiculo;

public class vehiculo {
    protected String marca;
    protected int anio;

    public vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void mostrarInfo(){
        System.out.println("La Marca: " + marca);
        System.out.println("El año: " + anio);
    }

    public void encender() {
        System.out.println("EL vehiculo se enciende");
    }
}
