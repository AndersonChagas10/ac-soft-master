package br.com.anderson.acsoft.service;

import br.com.anderson.acsoft.domain.model.Processo;

import java.util.List;

public interface ProcessoService extends GenericService  {

    Processo getById(Long id);
    Processo save(Processo processo);
    List<Processo> findAllPedenteParecer(String username);
}
