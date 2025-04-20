public class Jugador {

    private int id;

    private String nombre;

    private Pais[] paises;

    //Crear clase color? nah
    private String color;

    private Objetivo objetivo;

    public int ponerFichas(Pais pais, int cantidad){
        if (chekearPais(pais)){
            return pais.sumarFichas(cantidad);
        }
        //devolver el error?
        return pais.sumarFichas(cantidad);
    }

    public boolean chekearPais(Pais pais){
        //agregar la logica para verificar que es dueño del pais
        return true;
    }
}
