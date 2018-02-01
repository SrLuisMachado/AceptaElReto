import java.util.Scanner;

public class YoSoyTuPadre {

		    public static void main(String args[]){
		                
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Cuantos casos de prueba?");
		        int INTENTOS = sc.nextInt();

		        String nombre[] = new String[INTENTOS];
		        String nombre2[] = new String [INTENTOS];

		        for(int i=0; i<nombre.length; i++){
		            nombre[i] = sc.next();
		            nombre2[i] = sc.next();
		        }
		        
		        for(int i=0; i<nombre.length; i++){
		            if(nombre[i].equals("Luke") && nombre2[i].equals("padre")){
		                System.out.println("TOP SECRET");
		            } else {
		                System.out.println(nombre[i] + ", yo soy tu "+nombre2[i]);
		            }
		        }
		    }
		}