package br.com.anderson.acsoft.api.v1.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Relation(value = "usuario", collectionRelation = "usuarios")
public class UsuarioDto extends ResourceSupport {

    private Long cod;
    private String nome;
    private String usuario;
    private String email;
    private String senha;
    private List<UsuarioPerfilDto> perfis;
    private String accessToken;

}
