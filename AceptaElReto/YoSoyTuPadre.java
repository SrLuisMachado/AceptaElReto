import java.util.Scanner;

public class YoSoyTuPadre {

		    public static void main(String args[]){
		                
		        Scanner input = new Scanner(System.in);
		        System.out.println("Cuantos casos de prueba?");
		        int INTENTOS = input.nextInt();

		        String nombre[] = new String[INTENTOS];
		        String nombre2[] = new String [INTENTOS];

		        for(int i=0; i<nombre.length; i++){
		            nombre[i] = input.next();
		            nombre2[i] = input.next();
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