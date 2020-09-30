package ordenpalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Archivo {
    
    //Arreglo Que Contiene Frase Correcta.....................................
    String[] FraseCorrecta = {"Mi", "Nombre", "Es", "Edgar", 
        "Rosales", "De", "Septimo","Semestre"};
    //Arreglo Para Frase Desordenada..........................................
    String[] FraseDesordenada = new String[9];
    //Arreglo Para Frase Ordenada.............................................
    String[] FraseOrdenada = new String[9];   
    
    //Para Que No Nos Mande Null..............................................
    static boolean condicion;
    
    //Metodo Para Leer Nuestro Archivo........................................
    public void LecturaArchivo() throws FileNotFoundException{
        File Archivo = new File("/home/ometlann/Escritorio/FraseDesordenada");
        Scanner leer = new Scanner(Archivo);
        
        
        //Leemos Y Almacenamos En EL Recorrido.................
        String recorrido = "";
        condicion = true;
        while(leer.hasNext()){
            recorrido = leer.nextLine();
        }
        
        //Token Separa Las Palabras............................
        StringTokenizer separa = new StringTokenizer(recorrido);
        int contador = 0;
        while(separa.hasMoreTokens()){
            FraseDesordenada[contador] = separa.nextToken();;
            System.out.print(FraseDesordenada[contador] + "        ");
            contador++;
        }
    }
    
    public void Comparacion(){
        for(int i = 0; i <= FraseCorrecta.length - 1; i++){
            for(int j = 0; j <= FraseDesordenada.length - 1; j++){
                //Comparamos Las Plabras Y las Vamos Asignando
                if(FraseCorrecta[i].equals(FraseDesordenada[j])){
                    FraseOrdenada[i] = FraseDesordenada[j];
                    System.out.print(FraseOrdenada[i] + " ");
                }
            }
        }
    }
}
