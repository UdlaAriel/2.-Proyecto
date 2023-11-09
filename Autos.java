public class Autos {
    String marca;
    String modelo;
    String color = "Rosadooo";
    Double cilindraje;
    public String detalleAuto(){
        String detalle = "\nMarca " + this.marca +
                "\nModelo " + this.modelo +
                "\nColor " + this.color +
                "\nCilindraje " + this.cilindraje;

        return detalle;
    }

    public String acelerar(int rpm){
        return "Auto " + this.marca + " el auto esta acelerando a "+ rpm + " rpm";
    }

    public String km (int kilometraje, int years){
        return "El auto " + this.marca + " posee un kilometraje de " + kilometraje + " km. Tiene " + years + " años.";
    }
}
