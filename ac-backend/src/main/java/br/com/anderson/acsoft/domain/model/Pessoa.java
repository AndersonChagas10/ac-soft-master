package br.com.anderson.acsoft.domain.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Pessoa extends PersistentObject {

    private String nome;

    public Pessoa(Long id) {
        setId(id);
    }
}
