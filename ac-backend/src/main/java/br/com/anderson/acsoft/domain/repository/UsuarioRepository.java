package br.com.anderson.acsoft.domain.repository;

import br.com.anderson.acsoft.domain.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsuario(String usuario);

    List<Usuario> findAllByPerfisDescricao(String descricao);
}
