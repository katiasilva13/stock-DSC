package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

    /*
     * Crie um sistema quee receba inumeros times
     * num campeonato
     * com pontos
     * pode usar lista
     * ex: get em /campeonatos  =  lista de time campeonatos
     * ex: post ou put /times/{id} = altera o time de id tal
     * id pode ser a posição/index na lista
     */

    //  List<String> times = new ArrayList<String>();
//    List<String> campeonatos = new ArrayList<String>();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


/*
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/campeonatos")
    public List<String> camps(@RequestBody Map<String, String> json) {
        return campeonatos;
    }

    @PostMapping("/campeonatos")
    public String criarCamp(@RequestBody Map<String, String> json) {
        campeonatos.add(json.get("name"));
        return Iterables.getLast(campeonatos);
        // return String.format("%s adicionado à campeonatos!", Iterables.getLast(campeonatos));
        // return String.format("%s adicionado à campeonatos!", campeonatos.get(campeonatos.size()-1));
    }

    @GetMapping("/campeonatos/{id}")
    public String campId(@PathVariable Integer id) {
        return campeonatos.get(id);
    }

    @DeleteMapping("/campeonatos/{id}")
    public List<String> deleteCamp(@PathVariable Integer id) {
        campeonatos.remove(campeonatos.get(id));
        return campeonatos;
    }

    @GetMapping("/times")
    public List<String> times(@RequestBody Map<String, String> json) {
        return times;
    }

    @PostMapping("/times")
    public String criarTime(@RequestBody Map<String, String> json) {
        times.add(json.get("name"));
        return Iterables.getLast(times);
    }

    @GetMapping("/times/{id}")
    public String timeId(@PathVariable Integer id) {
        return times.get(id);
    }

    @DeleteMapping("/times/{id}")
    public List<String> deleteTime(@PathVariable Integer id) {
        times.remove(times.get(id));
        return times;
    }
*/

}
            