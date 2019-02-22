import java.util.Random;
import java.util.Scanner;

public class Actividad1 {

    Random R = new Random();
    int matriz[][];
    int colLength,renLength;

    public Actividad1(int r,int c) {
        matriz =  new int[r][c];
        renLength = r;
        colLength = c;
        for (int ren = 0; ren < renLength; ren++) 
            for (int col = 0; col < colLength; col++) 
                matriz[ren][col] = R.nextInt(100);
    }

    public void sumar() {
        for (int[] ren : matriz){
            int conP = 0, conT = 0, conI = 0;
            for (int col : ren) {                
                if (col<10) 
                    System.out.print("0"+col+" ");  
                else
                    System.out.print(col+" ");    
                
                conT += col; 

                if(col%2 == 0)
                    conP += col;                                  
                
                conI = conT-conP;
                
            }
            System.out.print("| Pares: "+ conP +"| Inpares: "+ conI +"| Total: "+ conT);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int col,ren;
        Scanner R = new Scanner(System.in);
        System.out.print("Renglones: ");
        System.out.flush();
        ren = R.nextInt();
        System.out.print("Columnas: ");
        System.out.flush();
        col = R.nextInt();
        Actividad1 clss = new Actividad1(ren,col);
        clss.sumar();
    }
}