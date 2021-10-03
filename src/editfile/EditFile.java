/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trm
 */
public class EditFile {

    /**************MAIN**********************
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "archivos/texto.odt";
         escribirFicheroFileWritter(ruta);
         leerFicheroFileReader(ruta);
        escribirFicheroBufferedWritter(ruta);
        leerFicheroBufferedReader(ruta);
    }
    
    /***************************************************************************
     * FileWritter
     * @param nombre 
     */
    public static void escribirFicheroFileWritter(String nombre){
        String texto = "<Libros><Libro><Titulo>El Quijote</Titulo></Libro></Libros>";
        try {
            FileWriter fichero = new FileWriter(nombre);
            fichero.write(texto + "\r\n");
            // Cerramos el fichero
            fichero.close();
            
        }catch(IOException ex){
            Logger.getLogger(EditFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder al fichero" + ex.toString()); 
        }catch(Exception e){
            System.out.println("error al acceder al fichero" + e.toString());
        }
    }
    
    /***************************************************************************
     * FileReader
     * @param nombre 
     */
    public static void leerFicheroFileReader(String nombre){
        try {
            FileReader fichero = new FileReader(nombre);
            int valor = fichero.read();
            while (valor != -1){
                System.out.print((char)valor);
                valor = fichero.read();
            }
            // Cerramos el fichero
            fichero.close();
            
        }catch(IOException ex){
            Logger.getLogger(EditFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder al fichero" + ex.toString()); 
        }catch(Exception e){
            System.out.println("error al acceder al fichero" + e.toString());
        }
    }
    
    /***************************************************************************
     * BufferedWritter
     * @param nombre 
     */
    public static void escribirFicheroBufferedWritter(String nombre){
        String texto = "ESTAMOS APRENDIENDO A PROGRAMAR, SIN PRISA PERO SIN PAUSA";
        try {
            FileWriter fichero = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fichero);
            bw.write(texto);
            bw.newLine();
            bw.write("Funciona nenuuu");
            //Guardamos los cambios del fichero
            bw.flush();
            // Cerramos el fichero
            fichero.close();
            bw.close();
            
        }catch(IOException ex){
            Logger.getLogger(EditFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder al fichero" + ex.toString()); 
        }catch(Exception e){
            System.out.println("error al acceder al fichero" + e.toString());
        }
    }
    
    /***************************************************************************
     * BufferedReader
     * @param nombre 
     */
    public static void leerFicheroBufferedReader(String nombre){
        try {
            FileReader fichero = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fichero);
            String linea = br.readLine();
            
            while (linea != null){
                System.out.print(linea);
                linea = br.readLine();
            }
            // Cerramos el fichero
            fichero.close();
            br.close();
        }catch(IOException ex){
            Logger.getLogger(EditFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder al fichero" + ex.toString()); 
        }catch(Exception e){
            System.out.println("error al acceder al fichero" + e.toString());
        }
    }
 
}
