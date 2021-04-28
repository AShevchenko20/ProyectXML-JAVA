package supermercado;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int num;
do{
do{
System.out.println("=============Pantalla Principal=============");
System.out.println("(1)-Stock");
System.out.println("(2)-Vendes");
System.out.println("(3)-Sortir");
System.out.print("Elige una opcion: ");
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
String[][] stock = {{"1","Pan","2€"},{"2","Patatas","1€"},{"3","Sprite","1.2€"},{"4","Pescado","3€"},{"5","Almendras","1€"},{"6","Cola","1€"},{"7","Lipton","1.05€"},{"8","Jamon","50€"},{"9","Hamburgesa","2€"}};
int num;
do{
do{
System.out.println("===================Stock====================");
System.out.println("(1)-Afegir Productes");
System.out.println("(2)-Consultar");
System.out.println("(3)-Sortir");
System.out.print("Elige una opcion: ");
num = entrada.nextInt();
}
while(num<1 || num>3);
if(num==1){String[] array=Afegir(stock);GuardaEnStock(array,stock);}
if(num==2){ConsultarStock(stock);}
if(num==3){return;}
}
while(num!=3);
}
public static String[] Afegir(String[][] stock){
Scanner entrada = new Scanner(System.in);
String[] array = new String[3];
System.out.println("============Afeigent el Producte============");    
array[0]=""+(stock.length+1);
System.out.println("Es el "+(stock.length+1)+" producto");
System.out.println("Introduce el Nombre del producto: ");
System.out.print(">");
array[1]=entrada.next();
System.out.println("Introduce el Precio del producto: ");
System.out.print(">");
array[2]=entrada.next();
return array;
}
public static void ConsultarStock(String[][] array){
System.out.println("");
System.out.println("============Listado de Productos============");
System.out.println("(ID)            (Nombre)          (Precio)");
for(int i=0;i<array.length;i++){
for(int n=0;n<array[i].length;n++){
System.out.printf("%-17s",array[i][n]);
}System.out.println("");
}
System.out.println("");
}
public static void GuardaEnStock(String[] array, String[][] stock){
}
public static void Vendes(){
Scanner entrada = new Scanner(System.in);
System.out.println("===================Vendes===================");
System.out.print(">");
System.out.println("");
}
}