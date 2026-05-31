package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet encargado de procesar las reservas de citas de NailGo.
 *
 * @author Wendy Parra
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    /**
     * Atiende las solicitudes GET.
     * Muestra un mensaje de prueba para verificar que el servlet funciona.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
                "<h1>ClienteServlet funcionando correctamente con GET</h1>"
        );
    }

    /**
     * Atiende las solicitudes POST enviadas desde el formulario de reservas.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los datos enviados desde el formulario
        String nombre = request.getParameter("nombre");
        String servicio = request.getParameter("servicio");
        String profesional = request.getParameter("profesional");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");

        // Guardar los datos como atributos para enviarlos al JSP
        request.setAttribute("nombre", nombre);
        request.setAttribute("servicio", servicio);
        request.setAttribute("profesional", profesional);
        request.setAttribute("fecha", fecha);
        request.setAttribute("hora", hora);

        // Redireccionar a la página que muestra la confirmación de la cita
        request.getRequestDispatcher("resultado.jsp")
                .forward(request, response);
    }

    /**
     * Retorna una descripción breve del servlet.
     */
    @Override
    public String getServletInfo() {
        return "Servlet para gestión de citas NailGo";
    }
}