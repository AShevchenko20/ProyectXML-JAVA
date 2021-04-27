package supermercado;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
do{
System.out.println("Escoje una opcion: ");
System.out.println("1-Stock");
System.out.println("2-Vendes");
System.out.println("3-Sortir");
int num = entrada.nextInt();
}
while(num<1 || num>3);
if(num==1){Stock();}
if(num==2){Vendes();}
if(num==3){Sortir();}
}
public static void Stock(){
System.out.println("Stock");
System.out.println("1-Afegir");
System.out.println("2-Vendes");
System.out.println("3-Sortir");
















}
}
