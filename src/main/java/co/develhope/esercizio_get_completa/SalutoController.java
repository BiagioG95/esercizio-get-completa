package co.develhope.esercizio_get_completa;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class SalutoController {
    @GetMapping("/ciao/Lombardia")
    public Saluto getSaluto(@RequestParam String nome) {
        return new Saluto(nome, "Lombardia", "Ciao " + nome + ", com'è il tempo in Lombardia?");
    }
}
