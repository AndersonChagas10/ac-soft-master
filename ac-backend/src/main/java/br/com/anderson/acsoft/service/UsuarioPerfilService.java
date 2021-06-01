package br.com.anderson.acsoft.service;

import br.com.anderson.acsoft.model.Usuario;
import br.com.anderson.acsoft.domain.model.UsuarioPerfil;

public interface UsuarioPerfilService extends GenericService  {

    UsuarioPerfil getById(Long id);
    UsuarioPerfil save(UsuarioPerfil usuarioPerfil);
}
