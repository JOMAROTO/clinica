package co.edu.uniquindio.servicios;

import co.edu.uniquindio.modelo.Pqrs;

public interface PqrsService {
    // Esta interfaz define los servicios que se pueden realizar sobre la entidad Pqrs
    Pqrs guardarPqrs(Pqrs pqrs);
    Pqrs actualizarPqrs(Pqrs pqrs);
    void eliminarPqrs(String numRadicado);
    Pqrs obtenerPqrsPorNumeroRadicado(String numRadicado);
}
