package DulceGalleta;

//Importación de librerías
import java.util.List;
import java.util.ArrayList;

class EmpleadoVentas extends Empleado {
    private List<Venta> ventas;

    public EmpleadoVentas(String rut, String nombres, String apellidos, String direccion, String movil, String correo) {
        super(rut, nombres, apellidos, direccion, movil, correo);
        //Creamos un array de nombre ventas para ir almacenando las ventas por empleado
        this.ventas = new ArrayList<>();
    }

    public void registrarVenta(String tipoGalleta, double montoVenta) {
        Venta venta = new Venta(tipoGalleta, montoVenta);
        ventas.add(venta);
    }

    public double calcularTotalVentas() {
        double totalVentas = 0;
        for (Venta venta : ventas) {
            totalVentas += venta.getMontoVenta();
        }
        return totalVentas;
    }
}
