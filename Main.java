package vehiculo;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Lexus RC", 2022, 2);
        Moto moto1 = new Moto("Honda", 2022, true);

        System.out.println("Auto");
        auto1.mostrarAuto();
        auto1.encender();

        System.out.println("\nMoto");
        moto1.mostrarMoto();
        moto1.encender();
    }
}

/*
¿Por qué el método encender() de Auto y Moto reemplaza el de Vehiculo?
para cambiar su comportamiento.
¿Qué pasa si quitamos @Override?
no pasa nada, pero al copilar no detecta errores al sobrescribir.
¿Qué modificadores permiten herencia?
public, protected
¿Podemos crear una clase Camion con su propio encender()?
Si, solo estariamos sobreescibiendo
* */

