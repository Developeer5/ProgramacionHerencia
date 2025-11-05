package vehiculo;

public class Moto extends vehiculo{

    private boolean tieneCasco;

    public Moto(String marca,int anio, boolean tieneCasco) {
        super(marca,anio);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void encender(){
        System.out.println("La moto de marca " + marca + " arrancando con botón.");
    }

    public void mostrarMoto(){
        super.mostrarInfo();
        System.out.println("¿Tiene casco?: " + tieneCasco);
    }

}
