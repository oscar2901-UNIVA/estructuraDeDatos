/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafuncionesrecursivas;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class TareaFuncionesRecursivas {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datosEntrada=null;
        int datos=0;
        while(!"salir".equals(datosEntrada)){
            System.out.println("\n");
            System.out.println("----------------------------------------------------------------Menu----------------------------------------------------------------");
            System.out.println("\n1.-  Factorial");
            System.out.println("2.-  Sumatoria");
            System.out.println("3.-  Potencia");
            System.out.println("4.-  Multiplicación de m por n ");
            System.out.println("5.-  Division de m entre n ");
            System.out.println("6.-  Potencia utilizando funcion de multiplicar");
            System.out.println("7.-  Palindromo");
            System.out.println("8.-  Reversible");
            System.out.println("9.-  Torres de Hanoi");
            System.out.println("10.- For");
            System.out.println("11.- Fobonacci\n");
            Scanner entrada = new Scanner (System.in); 
            datosEntrada = entrada.nextLine(); 

            if(datosEntrada.trim().toLowerCase().equals("salir")){
                    System.exit(0);
            }else{
                if(datosEntrada.trim().equals("")){
                    System.out.println("Seleccione uno:");
                }else{
                    boolean regresar = false;
                    int opcion = 0;
                    try {
                        opcion = Integer.valueOf(datosEntrada);
                    } catch (NumberFormatException e) {
                        System.out.println(datosEntrada+" Ese numero no se encuentra en el menu");
                        regresar = true;
                    }
                    if(regresar){
                        
                    }else{
                        int n = 0;
                        int x = 0;
                        int m = 0;
                        int resultado = 0;
                        switch(opcion){
                            case 1: System.out.print("Ingrese el valor: ");
                                    datosEntrada = entrada.nextLine();
                                    resultado = new func().factorial(n);
                                    System.out.println("El factorial de n es: "+resultado);
                                    break;
                            case 2: System.out.print("Ingrese el valor: ");
                                    datosEntrada = entrada.nextLine();
                                    resultado = new func().Sumatoria(n);
                                    System.out.println("La sumatoria de n es: "+resultado);
                                    break; 
                            case 3: System.out.print("Ingrese el valor de x: ");
                                    datosEntrada = entrada.nextLine();                                    
                                    System.out.print("Ingrese el valor de n: ");
                                    datosEntrada = entrada.nextLine();                                   
                                    resultado = new func().Potencia(x, n);
                                    System.out.println("El resultado de elevar x a la n potencia es: "+resultado);                                    
                                    break;
                            case 4: System.out.print("Ingrese el valor de m: ");
                                    datosEntrada = entrada.nextLine();
                                    System.out.print("Ingrese el valor de n: ");
                                    datosEntrada = entrada.nextLine();
                                    resultado = new func().Multiplicacion(m, n);
                                    System.out.println("El resultado de elevar x a la n potencia es: "+resultado);
                                    break;                                    
                            case 5: System.out.print("Ingrese el valor de m: ");
                                    datosEntrada = entrada.nextLine();                    
                                    System.out.print("Ingrese el valor de n: ");
                                    datosEntrada = entrada.nextLine();
                                    resultado = new func().Division(m, n);
                                    System.out.println("El resultado de dividir m entre n es: "+resultado);
                                    break;
                            case 6: System.out.print("Ingrese el valor de x: ");
                                    datosEntrada = entrada.nextLine();
                                    System.out.print("Ingrese el valor de n: ");
                                    datosEntrada = entrada.nextLine();
                                    resultado = new func().potencia2(m, n);
                                    System.out.println("El resultado es: "+resultado);
                                    break;
                            case 7: System.out.print("Ingrese la frase: ");
                                    datosEntrada = entrada.nextLine();
                                    System.out.println( new func().Palindromo(datosEntrada, 0, datosEntrada.length()-1));
                                    break;  
                            case 8: System.out.print("Ingrese la frase: ");
                                    datosEntrada = entrada.nextLine();
                                    
                                    System.out.println( new func().Reversible(datosEntrada, datosEntrada.length()-1));
                                    break;                            
                            case 9: System.out.println("Numero de discos: ");
                                    n = entrada.nextInt();
                                    resultado = new func().torresHanoi(n, 1, 2, 3);    
                                    break;
                            case 10: System.out.print("Ingrese la frase a repetir ");
                                    datosEntrada = entrada.nextLine();
                                    System.out.print("Ingrese el numero de veces que quiere repetir la frase:  ");
                                    datos = Integer.parseInt(entrada.nextLine());
                                    new func().For(datos, datosEntrada);
                                    break;

                            case 11: System.out.print("Ingrese el valor de n: ");
                                    datos = Integer.parseInt(entrada.nextLine());
                                    System.out.println("el ultimo valor de la serie es : "+ new func().Fobonacci(datos));
                                    break;
                            default: System.out.println("Esa opcion no se encuentra en el menu"); 
                                     break;
                                     
                        }
                    }
                    
                }
            } 
        }
    }
    
}
