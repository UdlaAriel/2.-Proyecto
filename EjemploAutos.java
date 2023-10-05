public class EjemploAutos {
    public static void main(String[] args) {
        Autos nissan=new Autos();
        Autos mercedes=new Autos();
        Autos chery=new Autos();

        nissan.marca = "Nissan";
        nissan.modelo = "qashqai";
        nissan.color = "Azul";
        nissan.cilindraje = 7.8;

        //Nissan
//        System.out.println("Marca "+nissan.marca);
//        System.out.println("Modelo "+nissan.modelo);
//        System.out.println("Color "+nissan.color);
//        System.out.println("Cilindraje "+nissan.cilindraje);

        System.out.println(nissan.detalleAuto());
        System.out.println(nissan.acelerar(3500));
        System.out.println(nissan.km(10000,5));

        System.out.println(mercedes.detalleAuto());
        System.out.println(chery.detalleAuto());


    }
}
