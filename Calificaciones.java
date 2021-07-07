//Mario Alejandro Aguirre A.  |  2944585
import java.util.Scanner;

public class Calificaciones {

   ////////FUNCIONES
    //PROMEDIO
    public float Promedio(float[] calif)
    {
        float suma =0;
        float promedio = 0;
        int i=0;

        for(i=0;i<=4;i++)
        {
            suma = suma + calif[i];
        }
        promedio = suma/5;

        return promedio;
    }

    //CALIF FINAL EN LETRA
    public String Final (double Prom)
    {
        String Calif = "";

        if(Prom<=50)
        {
            Calif="F";
        } else if (Prom >=51 && Prom <=60 )
        {
            Calif ="E";
        } else if(Prom >=61 && Prom <=70)
        {
            Calif="D";
        } else if (Prom >=71 && Prom <= 80)
        {
            Calif = "C";
        } else if (Prom >=81 && Prom<= 90)
        {
            Calif = "B";
        } else if (Prom >= 91 && Prom <=100)
        {
            Calif = "A";
        }

        return Calif;
    }

    //IMPRESION en PANTALLA
    public void Impresion (float[] calif, String Nombre, double Promedio, String Final)
    {
        int contador = 1;
        System.out.println("Nombre del estudiante: " + Nombre);
        for(int i=0;i<=4;i++)
        {
            System.out.println("Calificacion " + contador + ": " + calif[i]);
            contador ++;
        }

        System.out.println("Promedio: " + Promedio);
        System.out.println("Calificacion: " + Final);
    }

    ///MAIN
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        float[] calif={0,0,0,0,0};

        System.out.println("Ingresa nombre: ");
        String Nombre = scan.nextLine();
        //System.out.print(""+Nombre);

        System.out.println("\nIngresa calif 1:");
        calif[0]= scan.nextInt();

        System.out.println("Ingresa calif 2:");
        calif[1]= scan.nextInt();

        System.out.println("Ingresa calif 3:");
        calif[2]= scan.nextInt();

        System.out.println("Ingresa calif 4:");
        calif[3]= scan.nextInt();

        System.out.println("Ingresa calif 5:");
        calif[4]= scan.nextInt();

        //Promedio
        Calificaciones obj = new Calificaciones();
        double res = obj.Promedio(calif);
        System.out.println("Tu promedio es: " + res);

        //Calif en letra
        String Cal = obj.Final(res);
        System.out.println("Tu calificacion final es: " +Cal);

        //Impresion en Pantalla//
        System.out.println("\nRESUMEN IMPRESO");
        obj.Impresion(calif, Nombre, res, Cal);

    }
}
