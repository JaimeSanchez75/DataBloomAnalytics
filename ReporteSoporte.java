public class ReporteSoporte {

    // Atributos
    private String correo;
    private String tipoReporte;
    private String mensaje;
    private String estado;  // Por ejemplo: "Pendiente", "En proceso", "Resuelto"
    private String fechaEnvio;

    // Constructor
    public ReporteSoporte(String correo, String tipoReporte, String mensaje, String fechaEnvio) {
        this.correo = correo;
        this.tipoReporte = tipoReporte;
        this.mensaje = mensaje;
        this.estado = "Pendiente";
        this.fechaEnvio = fechaEnvio;
    }

    // Método implementado
    public String generarConfirmacion(String nombreUsuario) {
        return "Hola " + nombreUsuario + ", hemos recibido tu reporte sobre \"" 
            + tipoReporte + "\". Nuestro equipo de soporte te contactará al correo " 
            + correo + " en un plazo de 48 horas.";
    }

    // Getters y setters (no es obligatorio implementarlos todos para este ejercicio)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}