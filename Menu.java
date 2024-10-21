// Made by Zujeily Gonzalez Barrantes

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {

    public static void main(String[] args) {

        //Objetos y varible
        boolean whileConfirmacion = true;
        Scanner scanner = new Scanner(System.in);
        String dato = "";
        LocalDate fechaHistorico = LocalDate.now();

        // menu
        while (whileConfirmacion) {
            System.out.print("***************************************" + "\n" +
                    "     " + "\n" +
                    "Bienvenido al Conversor de Monedas:  " + "\n" +
                    "     " + "\n" +
                    "** Escriba el # relacionado con la conversion de moneda que ocupa :  **" + "\n" +
                    "1- Dolar =>> Peso Argentino" + "\n" +
                    "2- Peso Argentino =>> Dolar" + "\n" +
                    "3- Dolar =>> Real Brasileño" + "\n" +
                    "4- Real Brasileño =>> Dolar" + "\n" +
                    "5- Dolar =>> Peso colombiano" + "\n" +
                    "6- Peso colombiano =>> Dolar" + "\n" +
                    "7- Dolar =>> Colon Costarricense " + "\n" +
                    "8- Colon Costarricense =>> Dolar " + "\n" +
                    "9- Salir " + "\n" +
                    "     " + "\n" +
                    "***************************************" + "\n");
            int number = scanner.nextInt();
            if (number == 9) {
                System.out.println("Gracias por usar el conversor de Moneras de Zujeily");
                whileConfirmacion = false;
            } else {
                System.out.println("Dame el valor que quieres convertir ? ");
                double valor = scanner.nextDouble();
                switch (number) {

                    case 1:
                        ConversionMonedaAPI consulta = new ConversionMonedaAPI();
                        Moneda moneda = consulta.conversionDeMoneda("USD", "ARS", valor);
                        dato = "Si convertimos $" + valor + " dolares USD a peso argentino ARS, el resultado seria " + moneda.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 2:
                        ConversionMonedaAPI consultaDos = new ConversionMonedaAPI();
                        Moneda monedaDos = consultaDos.conversionDeMoneda("ARS", "USD", valor);
                        dato = "Si convertimos " + valor + " pesos argentinos ARS, a dolares USD, este es el resultado " + monedaDos.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 3:
                        ConversionMonedaAPI consultaTres = new ConversionMonedaAPI();
                        Moneda monedaTres = consultaTres.conversionDeMoneda("USD", "BRL", valor);
                        dato = "Si convertimos " + valor + " dolares USD, a Real Brasileño BRL este es el resultado " + monedaTres.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 4:
                        ConversionMonedaAPI consultaCuatro = new ConversionMonedaAPI();
                        Moneda monedaCuatro = consultaCuatro.conversionDeMoneda("BRL", "USD", valor);
                        dato = "Si convertimos  " + valor + " reales Brasileños BRL, a dolares USD este es el resultado " + monedaCuatro.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 5:
                        ConversionMonedaAPI consultaCinco = new ConversionMonedaAPI();
                        Moneda monedaCinco = consultaCinco.conversionDeMoneda("USD", "COP", valor);
                        dato = "Si convertimos  " + valor + " dolares USD a pesos colombianos COP, el resultado es " + monedaCinco.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 6:
                        ConversionMonedaAPI consultaSeis = new ConversionMonedaAPI();
                        Moneda monedaSeis = consultaSeis.conversionDeMoneda("COP", "USD", valor);
                        dato = "Si convertimos  " + valor + " pesos colombianos COP a dolares USD, el resultado es " + monedaSeis.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 7:
                        ConversionMonedaAPI consultaSiete = new ConversionMonedaAPI();
                        Moneda monedaSiete = consultaSiete.conversionDeMoneda("USD", "CRC", valor);
                        dato = "Si convertimos  " + valor + "  dolares USD a colon costarricense CRC el resultado es " + monedaSiete.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    case 8:
                        ConversionMonedaAPI consultaOcho = new ConversionMonedaAPI();
                        Moneda monedaOcho = consultaOcho.conversionDeMoneda("CRC", "USD", valor);
                        dato = "Si convertimos  " + valor + " colon costarricense CRC el resultado es " + monedaOcho.conversion_result();
                        System.out.println("Valor convertido: " + "\n" + dato);
                        whileConfirmacion = true;
                        break;
                    default:
                        System.out.println("Ehhh.. ese numero/letra no esta en el menu, intentemos de nuevo");
                        whileConfirmacion = true;
                        break;
                }


            }
        }

    }
}


