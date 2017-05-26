package CodeLine;

import java.util.Arrays;

public class CheckString 
{
    private String cadena;
    
    public boolean verificaCadena(String cad)
    {
        cadena = cad;
        return cadena.length() != 0 && cadena.length() >= 6;
    }
    public int verificaCadenaInt(String cad)
    {
        cadena = cad;
        return cadena.length()-2;
    }
    
    public boolean verificaPassword(char[] cad1, char[] cad2)
    {
        if(cad1.length != cad2.length)
            return false;
        for(int i = 0; i < cad1.length && i < cad2.length; i++)
        {
            if(cad1[i] != cad2[i])
                return false;
        }
        return true;
    }
    
    public String convertToString(char[] cad)
    {
        String palabra = "";
        for(int i = 0; i < cad.length; i++)
        {
            palabra += cad[i];
        }
        return palabra;
    }
}
