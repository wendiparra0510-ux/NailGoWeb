package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
                "<h1>ClienteServlet funcionando correctamente con GET</h1>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String servicio = request.getParameter("servicio");
        String profesional = request.getParameter("profesional");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");

        request.setAttribute("nombre", nombre);
        request.setAttribute("servicio", servicio);
        request.setAttribute("profesional", profesional);
        request.setAttribute("fecha", fecha);
        request.setAttribute("hora", hora);

        request.getRequestDispatcher("resultado.jsp")
                .forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet para gestión de citas NailGo";
    }
}