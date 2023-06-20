package DulceGalleta;

import java.util.List;
import java.util.ArrayList;

class SistemaVentas {
	//Declaramos una lista para los empleados
    private List<EmpleadoVentas> empleados;

    public SistemaVentas() {
    	//Se irán asignando los empleados al arreglo
        this.empleados = new ArrayList<>();
    }

    public void registrarEmpleado(EmpleadoVentas empleado) {
        empleados.add(empleado);
    }

  //Función que retorna el empleado con mayor venta
    public EmpleadoVentas obtenerEmpleadoConMayorVenta() {
        EmpleadoVentas empleadoMayorVenta = null;
        double mayorVenta = 0;

        //Recorremos el arreglo para el cálculo
        for (EmpleadoVentas empleado : empleados) {
            double totalVentas = empleado.calcularTotalVentas();
            if (totalVentas > mayorVenta) {
                mayorVenta = totalVentas;
                empleadoMayorVenta = empleado;
            }
        }

        return empleadoMayorVenta;
    }

    //Función que retorna el empleado con menor venta
    public EmpleadoVentas obtenerEmpleadoConMenorVenta() {
        EmpleadoVentas empleadoMenorVenta = null;
        double menorVenta = Double.MAX_VALUE;

      //Recorremos el arreglo para el cálculo
        for (EmpleadoVentas empleado : empleados) {
            double totalVentas = empleado.calcularTotalVentas();
            if (totalVentas < menorVenta) {
                menorVenta = totalVentas;
                empleadoMenorVenta = empleado;
            }
        }

        return empleadoMenorVenta;
    }
}
