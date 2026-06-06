package com.escola.cadastro_alunos.controller;

import com.escola.cadastro_alunos.model.Aluno;
import com.escola.cadastro_alunos.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("*")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    // GET - LISTAR TODOS
    @GetMapping
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id).orElseThrow();
    }

    // POST - CADASTRAR
    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // PUT - ATUALIZAR - COMPLETO
    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id,
                           @RequestBody Aluno alunoAtualizado) {

        Aluno aluno = alunoRepository.findById(id).orElseThrow();

        aluno.setNome(alunoAtualizado.getNome());
        aluno.setIdade(alunoAtualizado.getIdade());
        aluno.setSerie(alunoAtualizado.getSerie());
        aluno.setTelefone_responsavel(alunoAtualizado.getTelefone_responsavel());
        aluno.setEmail(alunoAtualizado.getEmail());
        aluno.setEndereco(alunoAtualizado.getEndereco());
        aluno.setCpf(alunoAtualizado.getCpf());
        aluno.setCpf_responsavel(alunoAtualizado.getCpf_responsavel());

        return alunoRepository.save(aluno);
    }

    // PATCH - ATUALIZAR - PARCIAL
    @PatchMapping("/{id}")
    public Aluno atualizarParcial(@PathVariable Long id,
                                  @RequestBody Aluno alunoAtualizado) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow();

        if (alunoAtualizado.getNome() != null) {
            aluno.setNome(alunoAtualizado.getNome());
        }
        if (alunoAtualizado.getIdade() != 0) {
            aluno.setIdade(alunoAtualizado.getIdade());
        }
        if (alunoAtualizado.getSerie() != null) {
            aluno.setSerie(alunoAtualizado.getSerie());
        }
        if (alunoAtualizado.getTelefone_responsavel() != null) {
            aluno.setTelefone_responsavel(alunoAtualizado.getTelefone_responsavel());
        }
        if (alunoAtualizado.getEmail() != null) {
            aluno.setEmail(alunoAtualizado.getEmail());
        }
        if (alunoAtualizado.getEndereco() != null) {
            aluno.setEndereco(alunoAtualizado.getEndereco());
        }
        if (alunoAtualizado.getCpf() != null) {
            aluno.setCpf(alunoAtualizado.getCpf());
        }
        if (alunoAtualizado.getCpf_responsavel() != null) {
            aluno.setCpf_responsavel(alunoAtualizado.getCpf_responsavel());
        }

        return alunoRepository.save(aluno);
    }

    // DELETE - DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}