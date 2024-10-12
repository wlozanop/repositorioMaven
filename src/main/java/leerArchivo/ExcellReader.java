package leerArchivo;

import com.poiji.bind.Poiji;
import modelo.Usuario;

import java.io.File;
import java.util.List;

public class ExcellReader {
    private static String excelPath = "src/main/resources/data/dataExcel/dataExcel.xlsx";

    //Método que lee la pestaña usuarios del archivo Excel
    public static List<Usuario> getUsuariosList() {
        return Poiji.fromExcel(new File(excelPath), Usuario.class);
    }
}
