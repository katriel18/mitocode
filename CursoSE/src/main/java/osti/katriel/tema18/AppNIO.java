package osti.katriel.tema18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * AppNIO
 */
public class AppNIO {

    public void operacionesFile(String operacion) throws IOException {

        Path path=Paths.get("katriel.txt");

        Path pathOrigen=Paths.get("katriel1.txt");
        Path pathDestino=Paths.get("katriel2.txt");

        Path pathDestino2=Paths.get("doc/katriel1.txt");
           
        switch (operacion) {
            case "existe":
            boolean existe=Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});//Ignora archivos con el mismo nombre
            System.out.println(existe);
            break;
            case "crear":
            Path nuevoPath=Files.createDirectory(path);
            break;
            case "copiar":
            Files.copy(pathOrigen,pathDestino,StandardCopyOption.REPLACE_EXISTING);
            break;
            case "mover":
            Files.move(pathOrigen,pathDestino2,StandardCopyOption.REPLACE_EXISTING);
            
            break;
            case "eliminar":
            Files.delete(pathDestino2);
            default:
            break;

        }

    }

    public void leer() {
        
    }
    public void name() {
        
    }

    public static void main(String args[]) throws IOException {
        AppNIO app=new AppNIO();
        app.operacionesFile("eliminar");
    }
}