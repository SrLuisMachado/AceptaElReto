import java.util.Scanner;

public class LadoOscuro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int dato=sc.nextInt();    
        for(int i=0;i<dato;i++)
        {
            int midiclorianos=sc.nextInt();
            String base5=base5(midiclorianos, 5);
            if(cuantos4(base5)>1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }      
    }
    static String base5(int num, int base)
    {
    	String cambio = Integer.toString(num, base);
    	return cambio;
    }
    
    static int cuantos4(String numero)
    {
        char calculo[]=numero.toCharArray();
        int cantidad=0;
        for(int i=0;i<calculo.length;i++)
        {
            if(calculo[i]=='4')
                cantidad++;
        }
        
        if(cantidad>1)
            return cantidad;
        else
            return 1;

	}

}
