package CodeLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
    public boolean escribeArchivo(String nombArch, String contenido, String seccion)
        {
            FileWriter archivo = null;
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");
            try {
                if(!existeArchivo(nombArch, seccion)){
                    archivo = new FileWriter(directorioActual+separador+"src/CodeLine/" + seccion + "/"+nombArch);
                    PrintWriter escritor = new PrintWriter(archivo);
                    escritor.write(contenido);
                    return true;
                }
            } catch (IOException e) {
                System.out.println("Entrada/Salida de datos");
            } finally {
              if (archivo != null)
              {
                try{
                    archivo.close();
                } catch (IOException e) {
                    System.out.println("Entrada/Salida de datos");
                }
              }
            }
            return false;
        }
        
        public boolean existeArchivo(String nombArch, String seccion)
        {
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");            
            File archivo = new File(directorioActual+separador+"src/CodeLine/" + seccion + "/"+nombArch);
            if(archivo.exists())
                return true;
            else
                return false;
        }
        
        public String LeeArchivo(String nombArch, String seccion)
        { 
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");
            String texto = "";
            try {
                if(existeArchivo(nombArch, seccion)){
                    FileReader archivo = new FileReader(directorioActual+separador+"src/CodeLine/" + seccion + "/"+nombArch);
                    BufferedReader b = new BufferedReader(archivo);
                    String cadena;
                    while((cadena = b.readLine()) != null) {
                        texto += cadena;
                    }
                    b.close();
                    return texto;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado en seccion:"+seccion);
            }
            catch (IOException e) {
                System.out.println("Entrada/Salida de datos");
            }
            return texto;
        }
}
