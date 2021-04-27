package supermercado;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int num;
do{
do{
System.out.println("1-Stock");
System.out.println("2-Vendes");
System.out.println("3-Sortir");
System.out.print("Escribe el numero de la opcion: ");
num = entrada.nextInt();
}
while(num<1 || num>3);
if(num==1){Stock();}
if(num==2){Vendes();}
if(num==3){break;}
}
while(num!=3);
}
public static void Stock(){
Scanner entrada = new Scanner(System.in);
String[][] stock = new String[3][10]; 
int num;
do{
System.out.println("Stock");
System.out.println("1-Afegir Productes");
System.out.println("2-Consultar");
System.out.println("3-Sortir");
System.out.print("Escribe el numero de la opcion: ");
num = entrada.nextInt();
}
while(num<1 || num>3);
if(num==1){Afegir();}
if(num==2){Consultar(stock);}
if(num==3){return;}
}
public static void Vendes(){
Scanner entrada = new Scanner(System.in);
}
public static String[] Afegir(){
Scanner entrada = new Scanner(System.in);
String[] array = new String[3];
System.out.print("Dime el ID del producte: ");
array[1]=entrada.next();
System.out.print("Dime el Nombre del producte: ");
array[2]=entrada.next();
System.out.print("Dime el Precio del producte: ");
array[3]=entrada.next();
return array;
}
public static void Consultar(String[][] array){
for(int i=0;i<array.length;i++){
for(int n=0;n<array[i].length;n++){
System.out.printf("%-9s",array[i][n]);
}System.out.println("");
}
}
}
