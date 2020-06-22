
package practica_github;


public class Proveedores {
    
    private static String telefono;
    private static String nit;
    private static String direccion;
    private static Integer cantidad;
    private static String nombreProveedor;

    public Proveedores() {
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Proveedores.telefono = telefono;
    }

    public static String getNit() {
        return nit;
    }

    public static void setNit(String nit) {
        Proveedores.nit = nit;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Proveedores.direccion = direccion;
    }

    public static Integer getCantidad() {
        return cantidad;
    }

    public static void setCantidad(Integer cantidad) {
        Proveedores.cantidad = cantidad;
    }

    public static String getNombreProveedor() {
        return nombreProveedor;
    }

    public static void setNombreProveedor(String nombreProveedor) {
        Proveedores.nombreProveedor = nombreProveedor;
    }
    
    
    
}
