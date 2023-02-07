public class Main {
    public static void main(String[] args) {
        Capitan horatio = new Capitan("MAR321", "Horatio", "Hornblower");
        Capitan jack = new Capitan("MAR123", "Jack", "Aubrey");

        Velero velerojack = new Velero(jack, 5000, 150, 2021, 8);
        System.out.println(velerojack);

        System.out.println("El costo de la embarcacion en velero es: " + velerojack.calcularCosto());
        if(velerojack.evaluarVelero()) System.out.println("El velero es grande!");
        else System.out.println("El velero no es considerador grande");

        Velero veleroHoratio = new Velero(horatio, 6000, 120, 2019, 3);
        System.out.println(veleroHoratio);

        System.out.println("El costo de la embarcacion en velero es: " + veleroHoratio.calcularCosto());
        if(veleroHoratio.evaluarVelero()) System.out.println("El velero es grande!");
        else System.out.println("El velero no es considerado grande");

        Capitan patxi = new Capitan("PAC465", "Patxi", "Barrenetxea");
        Capitan marko = new Capitan("CAR651", "Marko", "Ramius");

        Yate yatePatxi = new Yate(patxi, 90000, 950, 2022, 60);
        System.out.println(yatePatxi);

        System.out.println("El costo de la embarcacion en Yate es: " + yatePatxi.calcularCosto());
        if(yatePatxi.esDeLujo()) System.out.println("El Yate es de lujo!");
        else System.out.println("El yate es bastante humilde");

        Yate yateMarko = new Yate(marko, 35000, 680, 2017, 7);
        System.out.println(yateMarko);

        System.out.println("El costo de la embarcacion en Yate es: " + yateMarko.calcularCosto());
        if(yateMarko.esDeLujo()) System.out.println("El Yate es de lujo!");
        else System.out.println("El yate es bastante humilde");


    }
}