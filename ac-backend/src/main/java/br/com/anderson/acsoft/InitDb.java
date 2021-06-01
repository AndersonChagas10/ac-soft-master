package br.com.anderson.acsoft;

import br.com.anderson.acsoft.domain.model.Usuario;
import br.com.anderson.acsoft.domain.model.UsuarioPerfil;
import br.com.anderson.acsoft.domain.repository.UsuarioPerfilRepository;
import br.com.anderson.acsoft.domain.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class InitDb implements CommandLineRunner {

    private UsuarioRepository usuarioRepository;
    private UsuarioPerfilRepository usuarioPerfilRepository;

    @Override
    public void run(String... strings) throws Exception {
        PasswordEncoder encoder = new BCryptPasswordEncoder(12);
        usuarioPerfilRepository.save(UsuarioPerfil.builder().descricao("USER_TRIADOR").build());
        usuarioPerfilRepository.save(UsuarioPerfil.builder().descricao("USER_FINALIZADOR").build());
        UsuarioPerfil usuarioPerfil = usuarioPerfilRepository.save(UsuarioPerfil.builder().descricao("ADMIN").build());
        Usuario usuario = Usuario.builder()
                .usuario("admin")
                .email("aachagas@yahoo.com.br")
                .senha(encoder.encode("admin"))
                .perfis(Arrays.asList(usuarioPerfil))
                .build();
        usuario.setNome("Anderson Chagas");
        usuarioRepository.save(usuario);
    }
}
