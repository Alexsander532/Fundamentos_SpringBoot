package com.alexsander.fundamentos_springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


@RestController //Indica que esta classe é um controlador REST
@RequestMapping("/primeiraController") //Define a rota base para este controller
public class PrimeiraController {
    
    @GetMapping("primeiroMetodo/{id}") //Define o método HTTP GET para esta rota
    public String primeiroMetodo(@PathVariable String id) {
        return "Meu primeiro metodo api rest! ID: " + id;
    }

    
    @GetMapping("/metodocomQueryParams") //Define o método HTTP GET para esta rota
    public String metodoComQueryParams(@RequestParam String id) {
        return "Meu metodo com query params! ID: " + id;
    }

    @GetMapping("/metodocomQueryParams2") //Define o método HTTP GET para esta rota
    public String metodoComQueryParams(@RequestParam Map<String, String> allparams) {
        return "Meu metodo com query params! ID: " + allparams.entrySet(); //Retorna todos os parâmetros de consulta como uma string
    }
    @PostMapping("/metodocomBodyParams") 
    public String metodoComBodyParams(@RequestBody String username) {
        return "metodoComBodyParams: " + username; //Retorna todos os parâmetros de consulta como uma string
    }
    @PostMapping("/metodocomListHeader")
    public String metodoComListHeader(@RequestHeader Map<String, String> headers) {
        return "metodoComListHeader: " + headers.entrySet(); //Retorna todos os cabeçalhos como uma string
    }

    @GetMapping("metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario ("Alexsander");
        if (id > 5){
            return ResponseEntity.status(200).body(usuario);
        } else {
            return ResponseEntity.status(400).body("Numero menor que 5");
        }

    } 
    
    
}
