package ICO_POO_2258;

import java.util.Scanner;

public class cafeteraDriver {
    public static void main(String[] args) {
        MaqCafe cafetera = new MaqCafe();
        System.out.println(cafetera);

        while (true){
            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese la opcion de cafe deseado: ");
            System.out.println("1. Americano");
            System.out.println("2. Expresso");
            System.out.println("3. Capuchino");
            System.out.println("4. Salir al menu");

            int entrada = Integer.parseInt(teclado.nextLine());

            if (entrada == 1 || entrada == 2 || entrada == 3 || entrada == 4){
                if (entrada == 1) {
                    if ((cafetera.getAguaTotal() >= 180) && (cafetera.getCafeTotal() >= 15) && (cafetera.getVasosTotal() >= 1)) {
                        cafetera.Americano();
                        System.out.println(cafetera);
                    } else {
                        System.out.println("NO hay ingredientes necesarios para realizar el cafe\n");
                        System.out.println("Material necesario:\nAgua:180ml Cafe:15g Vasos:1\n");
                        System.out.println(cafetera);
                    }
                }
                if (entrada == 2) {
                    if ((cafetera.getAguaTotal() >= 120) && (cafetera.getCafeTotal() >= 20) && (cafetera.getVasosTotal() >= 1)) {
                        cafetera.Expresso();
                        System.out.println(cafetera);

                    } else {
                        System.out.println("NO hay ingredientes necesarios parsa realizar el cafe\n");
                        System.out.println("Material necesario:\nAgua:120ml Cafe:20g Vasos:1\n");
                        System.out.println(cafetera);
                    }
                }
                if (entrada == 3) {
                    if ((cafetera.getAguaTotal() >= 100) && (cafetera.getCafeTotal() >= 14) && (cafetera.getVasosTotal() >= 1) && (cafetera.getCremaTotal() >= 70)) {
                        cafetera.Capuchino();
                        System.out.println(cafetera);
                    } else {
                        System.out.println("NO hay ingredientes necesarios para realizar el cafe.\n");
                        System.out.println("Material necesario:\nAgua:100ml Cafe:20g Crema:70ml Vasos:1\n");
                        System.out.println(cafetera);
                    }
                }
                if (entrada == 4) {
                    break;
                }
            }
            else {
                System.out.println("Ingrese una opcion valida\n");
            }

        }
    }
}


