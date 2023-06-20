package DulceGalleta;

class Empleado {
	//Definición de variables
    private String rut;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;

    
    //objeto Empleado
    public Empleado(String rut, String nombres, String apellidos, String direccion, String telefono, String email) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    //Accesadores son getCampo()
    //Mutadores son setCampo()

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}