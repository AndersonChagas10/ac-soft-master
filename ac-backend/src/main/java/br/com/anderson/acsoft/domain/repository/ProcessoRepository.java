package br.com.anderson.acsoft.domain.repository;

import br.com.anderson.acsoft.domain.model.Processo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessoRepository extends CrudRepository<Processo, Long> {

    List<Processo> findAllByUsuariosUsuario(String username);
}
