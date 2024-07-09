package com.aluracursos.conversormonedas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);
        Conversor consulta = new Conversor();
        boolean continuar = true;
        DecimalFormat df = new DecimalFormat("#.00");

        while(continuar){
            System.out.println(InterfazDelPrograma.mensajeMenuSeleccion);
            var seleccionBase = leerDato.nextInt();
            if (seleccionBase ==0){
                System.out.println(InterfazDelPrograma.mensajeSalida);
                break;
            }

            System.out.println(InterfazDelPrograma.mensajeMenuConvercion);
            var seleccionPara = leerDato.nextInt();
            if (seleccionPara ==0){
                System.out.println(InterfazDelPrograma.mensajeSalida);
                break;
            }

            System.out.println(InterfazDelPrograma.mensajeCantidad);
            var cantidad = leerDato.nextDouble();

            Divisa divisa = consulta.convertirDivisa(seleccionBase, seleccionPara, cantidad);

            System.out.println("Resultado de la conversión: " + cantidad +
                    " " + divisa.base_code() + " son " +
                    df.format(cantidad * divisa.conversion_rate()) +
                    " " + divisa.target_code());

            System.out.println("Si desea realizar otra conversion, escriba S");
            String siguiente = leerDato.next().toUpperCase();
            if (!siguiente.equals("S")){
                continuar = false;
                System.out.println(InterfazDelPrograma.mensajeSalida);
            }
        }
    }
}
