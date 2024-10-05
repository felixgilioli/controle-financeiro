package br.com.felixgilioli.controlefinanceiro.service;

import br.com.felixgilioli.controlefinanceiro.model.Categoria;
import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;

@Service
public record CategoriaService() {

    public Categoria create(Categoria categoria) {
        if (StringUtils.isBlank(categoria.descricao())) {
            throw new IllegalArgumentException("descrição inválida");
        }

        return categoria;
    }
}
