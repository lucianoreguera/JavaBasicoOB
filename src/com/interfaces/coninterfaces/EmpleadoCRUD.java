package com.interfaces.coninterfaces;

import com.interfaces.sininterfaces.Empleado;
import java.util.List;

public interface EmpleadoCRUD {
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
