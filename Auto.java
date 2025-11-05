package vehiculo;

public class Auto extends vehiculo{
    //atributos adicional
    private int puertas;

    //Constructor


    public Auto(String marca,int anio,int puerta ) {
        super(marca, anio);
        this.puertas = puertas;

    }
    //Metodo
    @Override

    public void encender(){
        System.out.println("El auto de marca" + marca + "arranca con llave");
    }

    public void mostrarAuto(){
        super.mostrarInfo();
        System.out.println("Puertas: " + puertas);
    }

}
