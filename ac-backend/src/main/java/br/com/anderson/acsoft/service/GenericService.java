package br.com.anderson.acsoft.service;

import br.com.anderson.acsoft.domain.model.PersistentObject;
import br.com.anderson.acsoft.domain.model.Usuario;

import java.util.List;

public interface GenericService {

    <T extends PersistentObject> T getById(Long id);

    <T extends PersistentObject> List<T> findAll();

    void delete(Long id);
}
