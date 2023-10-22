package co.edu.uniquindio.servicios;

import java.util.List;
import java.util.Optional;

import co.edu.uniquindio.modelo.Usuario;

public interface UsuarioService {
    // Esta interfaz define los servicios que se pueden realizar sobre la entidad Usuario
    Usuario guardarUsuario(Usuario usuario);
    Optional<Usuario> obtenerUsuarioPorCedula(String cedula);
    List<Usuario> obtenerTodosLosUsuarios();
    void eliminarUsuario(String cedula);

}
