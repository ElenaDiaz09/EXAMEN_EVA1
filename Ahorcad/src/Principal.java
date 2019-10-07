
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner spider = new Scanner(System.in);
        boolean check = false, resu = false;
        char letri;
        int letras = 0;
        int intentar = 4;
        String[] palas = new String[]{"perro", "hospital", "trabajo", "amigo", "excusa", "espadachin", "cochipuerco"};
        
       
        String adivino = palas[(int)(Math.random()*palas.length)];
        char[] Palabra = adivino.toCharArray();
        char[] Cuau = new char [adivino.length()];
         int largo = (int)(adivino.length());
        for (int i = 0; i < adivino.length(); i++) {
            Cuau[i] = '_';
        }
        
        System.out.println("Bienvenido");
        System.out.println("Tienes 4 intentos");
        System.out.println(adivino);
        
        
         while(intentar > 0 && !resu){
        for (int i = 0; i < Palabra.length; i++) {
            System.out.print("["+Cuau[i]+"]");
        }
        System.out.println("\nPonga una letra ");
        letri = spider.next().charAt(0);
            check = false;
                for (int i = 0; i < Palabra.length; i++) {
                 if(letri == Palabra[i]){
                     Cuau[i] = Palabra[i];
                     check = true;
                     letras++;
                 }
             }
                if(!check){
                    for (int i = 0; i < 3; i++) {
                    intentar = intentar - 1;
                    System.out.println("Bruh");
                    System.out.println("\nPonga una letra ");
                    letri = spider.next().charAt(0);
                    
                }
                
                if(letras == largo){
                    resu = false;
                }
                else{
                    resu = true;
                }
                 System.out.println("Bienvenido");
                System.out.println("Tienes 4 intentos");
            for (int i = 0; i < adivino.length(); i++) {
                    Cuau[i] = '_';
             }    
           if(!resu){
                System.out.println("Ganaste");
            }
            else{
                System.out.println("Perdiste");
            }
            }
                
        }}}
    
    

    
    

