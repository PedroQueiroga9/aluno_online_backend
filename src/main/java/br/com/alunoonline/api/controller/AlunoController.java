package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Aluno> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return repository.save(aluno);
    }
}
