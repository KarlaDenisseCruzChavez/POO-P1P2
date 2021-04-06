
package Parcial1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class MainProyecto {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        Cliente[] clientes;
        int tam;
       
        System.out.print("Defina el tamaño de la cartera: ");
        tam = scn.nextInt();
        clientes = new Cliente[tam];  
          int tam2=tam;
        
         for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
        }
         
        int opcion;
        int opcion2=0;
        int n=1;
        int c=0;
        int nC=0;
        
        
        do{
           
            System.out.println("--------------------------------------------------------");
            System.out.println("Tamaño de la cartera: " + tam);
            System.out.println("Espacio en la cartera: " + tam2);
            System.out.println("1) Agregar cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Buscar cliente");
            System.out.println("0) Cerrar sistema");
            System.out.println("Elige una opcion: ");
            opcion = scn.nextInt();
            
        
          
           switch(opcion){
           
               case 1: 
                   System.out.println("REGISTRO DE CLIENTE");
                    
                    if(nC<tam){
                    nC+=n;
                   try{  
                    for (int i = c; i < nC ; i++) {
                        System.out.print("Código del cliente: ");
                        clientes[i].setCodigoCliente(scn.nextInt());
                        System.out.print("Nombre: ");
                        clientes[i].setNombre(bf .readLine());
                        System.out.print("Apellido paterno: ");
                        clientes[i].setApellidoPaterno(bf .readLine());
                        System.out.print("Apellido materno: ");
                        clientes[i].setApellidoMaterno(bf .readLine());
                        System.out.print("Teléfono: ");
                        clientes[i].setTelefono(bf .readLine());
                        System.out.print("Dirección:  ");
                        clientes[i].setDireccion(bf .readLine());
                        System.out.print("Edad: ");
                        clientes[i].setEdad(scn.nextInt());
                    i++;
                    c++;
                   }
                    }catch(Exception e){
                            System.out.println(e.getMessage());
                            }
                   tam2--;
                   }else{
                        System.out.println("NO SE PUEDEN AGREGAR MÁS CLIENTES!!");
                    
                    }
                    
                   break;
           
               case 2:
                   if(nC==0){
                       System.out.println("AUN NO HAY CLIENTES REGISTRADOS");
                   }else{
                   System.out.println("LISTADO DE CLIENTES");
                   for (int i = 0; i < nC; i++) {
                       System.out.println("Código del cliente: " + clientes[i].getCodigoCliente());
                       System.out.println("Nombre del cliente: " + clientes[i].getNombre());
                       System.out.println("Apellido paterno del cliente: " + clientes[i].getApellidoPaterno());
                       System.out.println("Apellido materno del cliente: " + clientes[i].getApellidoMaterno());
                       System.out.println("Teléfono del cliente: " + clientes[i].getTelefono());
                       System.out.println("Direccion del cliente: " + clientes[i].getDireccion());
                       System.out.println("Edad del cliente: " + clientes[i].getEdad());
                   }
               }
            break;
            
               case 3:
                   int cod;
                   System.out.println("BUSCAR CLIENTE");
                   System.out.println("Usted tiene 3 opciones");
                   System.out.println("1) Buscar por código");
                   System.out.println("2) Buscar por nombre");
                   System.out.println("0) Regresar al menú anterior");
                   opcion2=scn.nextInt();
                   
                   if(opcion2==1){
                       System.out.println("Introduzca el código que buscará: ");
                       cod=scn.nextInt();

                              if(cod>=0&&cod<=tam){

                                   System.out.println("Nombre del cliente: " + clientes[cod-1].getNombre());
                                     System.out.println("Apellido paterno del cliente: " + clientes[cod-1].getApellidoPaterno());
                                     System.out.println("Apellido materno del cliente: " + clientes[cod-1].getApellidoMaterno());
                                     System.out.println("Teléfono del cliente: " + clientes[cod-1].getTelefono());
                                     System.out.println("Direccion del cliente: " + clientes[cod-1].getDireccion());
                                     System.out.println("Edad del cliente: " + clientes[cod-1].getEdad());
                                  
                                      
                       }else{
                                  System.out.println("Ese código no existe");
                              }
             
                   
                   }else if(opcion2==2){
                       
                       
                       int pos=-1;
                      String nomb=""; 
                       System.out.println("BUSCAR POR NOMBRE");
                       try{
                       System.out.print("Introduzca el nombre que desea buscar: ");
                        
                       nomb=(bf .readLine());
                       }catch(Exception e){
                           System.out.println(e.getMessage());
                       }
                           for (int i = 0; i < clientes.length; i++) { 
                               
                       if(nomb.equals(clientes[i].getNombre())){
                     pos=i;
                      System.out.println("Código del cliente: " + clientes[i].getCodigoCliente());
                       System.out.println("Nombre del cliente: " + clientes[i].getNombre());
                       System.out.println("Apellido paterno del cliente: " + clientes[i].getApellidoPaterno());
                       System.out.println("Apellido materno del cliente: " + clientes[i].getApellidoMaterno());
                       System.out.println("Teléfono del cliente: " + clientes[i].getTelefono());
                       System.out.println("Direccion del cliente: " + clientes[i].getDireccion());
                       System.out.println("Edad del cliente: " + clientes[i].getEdad());
                       
                       }
                           }
                           
                       
                           if(pos==-1){
                           System.out.println("ESE NOMBRE NO EXISTE");
                       } 
                       
                           
                       
                   }
                   
                   break;
                   
                     case 0:
                         System.out.println("Gracias por usar el sistema :)");
                         break;

               }
          }while(opcion != 0 );
    }
} 

 