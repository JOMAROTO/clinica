package co.edu.uniquindio.servicios;

import co.edu.uniquindio.modelo.Administrador;
import java.util.List;
import java.util.Optional;
// Esta interfaz define los servicios que se pueden realizar sobre la entidad Administrador
public interface AdministradorService {
  
    Administrador guardarAdministrador(Administrador administrador);
    Administrador actualizarAdministrador(Administrador administrador);
    void eliminarAdministrador(String codigo);
    List<Administrador> obtenerTodosLosAdministradores();
    Optional<Administrador> obtenerAdministradorPorCodigo(String codigo);
}
