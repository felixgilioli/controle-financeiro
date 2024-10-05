package br.com.felixgilioli.controlefinanceiro.api;

import br.com.felixgilioli.controlefinanceiro.model.Categoria;
import br.com.felixgilioli.controlefinanceiro.service.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public record CategoriaController(CategoriaService categoriaService) {

    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaService.create(categoria);
    }
}
