package br.com.anderson.acsoft.service.impl;

import br.com.anderson.acsoft.domain.model.PersistentObject;
import br.com.anderson.acsoftdomain.model.Usuario;
import br.com.anderson.acsoft.domain.model.UsuarioPerfil;
import br.com.anderson.acsoft.domain.repository.UsuarioPerfilRepository;
import br.com.anderson.acsoft.domain.repository.UsuarioRepository;
import br.com.anderson.acsoft.service.UsuarioPerfilService;
import br.com.anderson.acsoft.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioPerfilServiceImpl implements UsuarioPerfilService {

    private final UsuarioPerfilRepository usuarioPerfilRepository;

    @Override
    public UsuarioPerfil getById(Long id) {
        return usuarioPerfilRepository.findById(id).orElse(null);
    }

    @Override
    public UsuarioPerfil save(UsuarioPerfil usuarioPerfil) {
        return usuarioPerfilRepository.save(usuarioPerfil);
    }

    @Override
    public List<UsuarioPerfil> findAll() {
        List<UsuarioPerfil> perfis = new ArrayList<>();
        usuarioPerfilRepository.findAll().forEach(perfis::add);
        return perfis;
    }


    @Override
    public void delete(Long id) {
        UsuarioPerfil perfil = getById(id);
        if(perfil != null) {
            usuarioPerfilRepository.delete(perfil);
        }
    }
}
