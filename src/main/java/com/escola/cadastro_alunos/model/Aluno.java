package com.escola.cadastro_alunos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String serie;
    private String telefone_responsavel;
    private String email;
    private String endereco;
    private String cpf;
    private String cpf_responsavel;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getTelefone_responsavel() { return telefone_responsavel; }
    public void setTelefone_responsavel(String telefone_responsavel) { this.telefone_responsavel = telefone_responsavel; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCpf_responsavel() { return cpf_responsavel; }
    public void setCpf_responsavel(String cpf_responsavel) { this.cpf_responsavel = cpf_responsavel; }
}