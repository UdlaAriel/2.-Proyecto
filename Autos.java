public class Autos {
    String marca;
    String modelo;
    String color = "Rosadooo";
    Double cilindraje;
    public String detalleAuto(){

        //        String color = "Verde";
//        System.out.println("Marca "+ this.marca);
//        System.out.println("Modelo "+this.modelo);
//        System.out.println("Color "+this.color);
//        System.out.println("Cilindraje "+this.cilindraje);

        String da = "\nMarca " + this.marca +
                "\nModelo " + this.modelo +
                "\nColor " + this.color +
                "\nCilindraje " + this.cilindraje;

        return da;
    }

    public String acelerar(int rpm){
        return "Auto " + this.marca + " el auto esta acelerando a "+ rpm + " rpm";

    }

    public String km (int kilometraje, int years){
        return "El auto " + this.marca + "posee un kilometraje de " + kilometraje + " km. Tiene " + years + " anios.";
    }
}
