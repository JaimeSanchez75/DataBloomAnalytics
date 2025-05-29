import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReporteSoporteTest {

    @Test
    public void testGenerarConfirmacion() {
        // Datos de entrada simulados
        ReporteSoporte reporte = new ReporteSoporte(
            "usuario@ejemplo.com",
            "Problemas inicio de sesión y permisos",
            "No puedo iniciar sesión desde ayer.",
            "2025-05-29"
        );

        // Ejecución del método con parámetro
        String resultado = reporte.generarConfirmacion("Carlos");

        // Resultado esperado
        String esperado = "Hola Carlos, hemos recibido tu reporte sobre \"Problemas inicio de sesión y permisos\". Nuestro equipo de soporte te contactará al correo usuario@ejemplo.com en un plazo de 48 horas.";

        // Verificación
        assertEquals(esperado, resultado);
    }
}