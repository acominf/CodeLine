package CodeLine;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Account 
{
        private String nombre;
	private String userID;
	private String email;
	private String password;
        private int puntaje;
	
	public void addAccount(String nomb,String User, String Email, String Password)
	{
                setNombre(nomb);
		setUserID(User);
		setEmail(Email);
		setPassword(Password);
                setPuntaje(0);
	}
        
        public void setNombre(String nomb) {
            this.nombre = nomb;
        }
        public String getNombre() {
            return this.nombre;
        }
	public String getUserID() {
		return userID;
	}

       public int getPuntaje() {
           return puntaje;
       }     
       
       public void setPuntaje(int pu) {
           this.puntaje = pu;
       }
       
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        
        public boolean escribeArchivo(String nombArch)
        {
            String texto = ""+nombre+"/"+""+userID+"/"+email+"/"+password+"/"+puntaje;
            FileWriter archivo = null;
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");
            try {
                if(!existeArchivo(nombArch)){
                    archivo = new FileWriter(directorioActual+separador+"src/CodeLine/BaseDeDatos/"+nombArch);
                    PrintWriter escritor = new PrintWriter(archivo);
                    escritor.write(texto);
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
        
        public boolean existeArchivo(String nombArch)
        {
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");            
            File archivo = new File(directorioActual+separador+"src/CodeLine/BaseDeDatos/"+nombArch);
            if(archivo.exists())
                return true;
            else
                return false;
        }

    
}
