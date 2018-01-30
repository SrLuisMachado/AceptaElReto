import java.util.Scanner;

public class Hangares {
 static boolean inicio=true;
		    public static void main(String[] args) {
		        
		        while(inicio)
		        {
		            Scanner sc= new Scanner(System.in);
		            System.out.println("Hangares");
		            int hangar=sc.nextInt();
		            if(hangar!=0)
		            {
		                int hangares[]=new int[hangar];
		                for(int i=0;i<hangar;i++)
		                {
		                    hangares[i]=sc.nextInt();
		                }
		                
		                System.out.println("Naves");
		                int cantidad=sc.nextInt();                
		                int naves[]=new int[cantidad];
		                
		                for(int i=0;i<cantidad;i++)
		                {
		                    naves[i]=sc.nextInt();
		                }
		                
		                if(CalcularEspacio(hangares, naves))
		                    System.out.println("SI");
		                else
		                    System.out.println("NO");
		                
		            }
		            else
		                inicio=false;
		        }
		    }
		    
		    public static boolean CalcularEspacio(int []hangares, int []naves)
		    {
		    	boolean salida=false;
		        for (int i=0;i<naves.length;i++){
		            int hangar = HangarMasGrande(hangares);
		            if (hangar>=naves[i]) {
		                hangares[hangar]=hangares[hangar]-naves[i];
		                salida = true;
		            } else
		                salida=false;
		        }
		        return salida;

	}
		    public static int HangarMasGrande(int[] hangares){
		        int maximo = -1;
		        int posicion =-1;
		        for (int i=0;i<hangares.length;i++){
		            if (hangares[i]>maximo) {
		                maximo=hangares[i];
		                posicion = i;
		            }
		        }
		        return posicion;
		    }

}
