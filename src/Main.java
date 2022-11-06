public class Main {
    public static void main(String[] args) {
        var numeroIf = 0;
        var numeroWhile = -1;
        var numeroDoWhile = 10;
        var numeroFor = 0;
        var estacion = "verano";

        if (numeroIf > 0){
            System.out.println("Es positivo");
        } else if (numeroIf == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("Es negativo");
        }

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println(numeroDoWhile);
        }
            while (numeroDoWhile < 11);

        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("El valor ingresado no es una variable");
        }
        }
    }