package br.com.anderson.acsoft.domain.repository;

import br.com.anderson.acsoft.domain.model.UsuarioPerfil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPerfilRepository extends CrudRepository<UsuarioPerfil, Long> {
    
}
