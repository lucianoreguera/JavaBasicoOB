package com.interfaces.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {
    // estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // OPERACIONES CRUD

    // CREATE - guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
