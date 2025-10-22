/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpi_db;
    import java.sql.*;
public class TPI_DB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tpi";
        String user = "root";
        String pass = "240115";

        // Parámetro legítimo (ejemplo)
        String safeParam = "PED-012345";

        // Intento de inyección (valor malicioso)
        String maliciousParam = "PED-012345' OR '1'='1";

        String sql = "SELECT id, numero, clienteNombre, total FROM pedido WHERE numero = ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {

            // PRUEBA 1: ejecución segura con parámetro legítimo
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, safeParam);
                try (ResultSet rs = ps.executeQuery()) {
                    System.out.println("Resultados con safeParam:");
                    while (rs.next()) {
                        System.out.printf("id=%d numero=%s cliente=%s total=%.2f%n",
                            rs.getInt("id"), rs.getString("numero"),
                            rs.getString("clienteNombre"), rs.getDouble("total"));
                    }
                }
            }

            // PRUEBA 2: intento de inyección con PreparedStatement
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, maliciousParam);
                try (ResultSet rs = ps.executeQuery()) {
                    System.out.println("Resultados con maliciousParam:");
                    boolean any = false;
                    while (rs.next()) {
                        any = true;
                        System.out.printf("id=%d numero=%s cliente=%s total=%.2f%n",
                            rs.getInt("id"), rs.getString("numero"),
                            rs.getString("clienteNombre"), rs.getDouble("total"));
                    }
                    if (!any) {
                        System.out.println("No se devolvieron filas — la inyección fue neutralizada.");
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
