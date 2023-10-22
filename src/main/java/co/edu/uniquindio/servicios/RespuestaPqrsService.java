package co.edu.uniquindio.servicios;

import co.edu.uniquindio.modelo.RespuestaPqrs;

public interface RespuestaPqrsService {
    // Esta interfaz define los servicios que se pueden realizar sobre la entidad RespuestaPqrs
    RespuestaPqrs guardarRespuestaPqrs(RespuestaPqrs respuestaPqrs);
    RespuestaPqrs actualizarRespuestaPqrs(RespuestaPqrs respuestaPqrs);
    void eliminarRespuestaPqrs(String idRespuesta);
    RespuestaPqrs obtenerRespuestaPqrsPorId(String idRespuesta);
}
