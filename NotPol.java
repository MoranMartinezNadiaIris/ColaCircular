/*
 * Notación prefija o Polaca es una 
 * forma de escribir operaciones diferente a 
 * la ordinaria
 * Ejemplo 
 * 		Normal ==> Polaca
 * 		3 + 4  ==> + 3 4 
 * 
 * Siempre usamos un <espacio> entre los
 * operandos y la operación va al principio,
 * y se repite hasta terminar con los operandos
 * 
 *   + 3 10 
 *   13
 * Los operandos se toman de dos en dos
 * por lo que :
 * 
 *   + 4 5 6 7
 * 
 * implica primero resolver: 4 + 5 = 9
 * 
 * + 9 6 7
 * 
 * volvemos a tomar dos numeros: 9 + 6 = 15
 * 
 * + 15 7
 * 
 * repetimos hasta que no haya más: 15 + 7
 * 
 * 22
 * 
 * 
 * Nota:
 * La notacion polaca no funciona exactamente
 * como la describi aqui, en Automatas I y II
 * se vera a profundidad.
 * 
 * Ejercicio
 * Escribir una calculadora basica en notacion
 * polaca para aplicar operaciones basicas de
 * Suma, Resta, Multiplicacion y Division
 * que implemente una cola circular que
 * soporte 1 Operacion y 5 operandos.
 * Escriba el resultado e imprima.
 * 
 * Corrida de escritorio
 * 
 * Bienvenido a este programa!
 * Escribe tu operacion:
 * > +
 * Escribe el operando 1:
 * > 1
 * Escribe el operando 2:
 * > 2
 * Escribe el operando 3:
 * > 3
 * Escribe el operando 4:
 * > 4
 * Escribe el operando 5:
 * > 5
 * 
 * El resulado es 15
 * Notacion Polaca: + 1 2 3 4 5 
 */ 
import java.util.Scanner;
public class NotPol {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        cola<Integer> cd= new<Integer> cola(6);
        boolean ban=false;
        String sim="";
        int n=0,n2=0,n3=0,n4=0,n5=0;
         System.out.println("Binevenido a este programa!");
         System.out.println("Escribe tu operacion:");
    do{
        System.out.println("Seleccione una opcion\nsuma +\nresta -\nmultiplicacion *\ndivicion / ");
        sim=sc.next();
        switch(sim){
            case "+":
           try{
          System.out.println("Escribe el operando 1:");
           n=sc.nextInt();
          cd.encolar(n);
           System.out.println("Escribe el operando 2:");
           n2=sc.nextInt();
          cd.encolar(n2);
           System.out.println("Escribe el operando 3:");
           n3=sc.nextInt();
          cd.encolar(n3);
           System.out.println("Escribe el operando 4:");
           n4=sc.nextInt();
          cd.encolar(n4);
           System.out.println("Escribe el operando 5:");
           n5=sc.nextInt();
          cd.encolar(n5);
          int j=cd.suma(n, n2, n3,n4, n5);
           System.out.println("Suma Polaca + "+j);
          int r=cd.sacar();
           System.out.print("+ "+r);
            r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);      
       }catch(ExcepcionColaLLena  err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
                   ban=true;
                break;
            case "-":
          try{
          System.out.println("Escribe el operando 1:");
           n=sc.nextInt();
          cd.encolar(n);
           System.out.println("Escribe el operando 2:");
           n2=sc.nextInt();
          cd.encolar(n2);
           System.out.println("Escribe el operando 3:");
           n3=sc.nextInt();
          cd.encolar(n3);
           System.out.println("Escribe el operando 4:");
           n4=sc.nextInt();
          cd.encolar(n4);
           System.out.println("Escribe el operando 5:");
           n5=sc.nextInt();
          cd.encolar(n5);
          int j=cd.resta(n, n2, n3,n4, n5);
           System.out.println("Resta Polaca - "+j);
          int r=cd.sacar();
           System.out.print("- "+r);
            r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);      
       }catch(ExcepcionColaLLena  err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
          ban=true;
                break;
            case "*":
           try{
          System.out.println("Escribe el operando 1:");
           n=sc.nextInt();
          cd.encolar(n);
           System.out.println("Escribe el operando 2:");
           n2=sc.nextInt();
          cd.encolar(n2);
           System.out.println("Escribe el operando 3:");
           n3=sc.nextInt();
          cd.encolar(n3);
           System.out.println("Escribe el operando 4:");
           n4=sc.nextInt();
          cd.encolar(n4);
           System.out.println("Escribe el operando 5:");
           n5=sc.nextInt();
          cd.encolar(n5);
          int j=cd.multiplicacion(n, n2, n3,n4, n5);
           System.out.println("Multiplicacion Polaca * "+j);
          int r=cd.sacar();
           System.out.print("* "+r);
            r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);      
       }catch(ExcepcionColaLLena  err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
           ban=true;
                break;
            case "/":
           try{
          System.out.println("Escribe el operando 1:");
           n=sc.nextInt();
          cd.encolar(n);
           System.out.println("Escribe el operando 2:");
           n2=sc.nextInt();
          cd.encolar(n2);
           System.out.println("Escribe el operando 3:");
           n3=sc.nextInt();
          cd.encolar(n3);
           System.out.println("Escribe el operando 4:");
           n4=sc.nextInt();
          cd.encolar(n4);
           System.out.println("Escribe el operando 5:");
           n5=sc.nextInt();
          cd.encolar(n5);
          int j=cd.divicion(n, n2, n3,n4, n5);
           System.out.println("Divicion Polaca / "+j);
          int r=cd.sacar();
           System.out.print("/ "+r);
            r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);
           r=cd.sacar();
           System.out.print(" "+r);      
       }catch(ExcepcionColaLLena  err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
           ban=true;
                break;
            case ".":
                ban=false;
                break;
        }
    }while(ban==false);
    }
}
