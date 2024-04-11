package com.example.lab2.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@Controller
public class HomeController {

    @RequestMapping(value ={ "/patito_hule"},method = RequestMethod.GET)
    public String vistaPatitoHule(){
        return "patito_hule";
    }

    @PostMapping("/ejecutar")
    public String ejecutarAccion(@RequestParam("numerofilas") String numeroFilas,
                                 @RequestParam("numerocolumnas") String numeroColumnas,
                                 @RequestParam("posicionesiniciales") String posicionesIniciales,
                                 @RequestParam("numerofotostomadas") String numeroFotosTomadas)
                                 {
        System.out.println("Numero de Filas: " + numeroFilas + "\n" +
                "Numero de Columnas: " + numeroColumnas + "\n" +
                "Posiciones Iniciales: " + posicionesIniciales + "\n"+
                "Numero de Fotos Tomadas: " + numeroFotosTomadas);
        int filas = Integer.parseInt(numeroFilas);
        int columnas = Integer.parseInt(numeroColumnas);
        int posiciones = Integer.parseInt(posicionesIniciales);
        int fotos = Integer.parseInt(numeroFotosTomadas);
        return "patito_hule";

    }
}