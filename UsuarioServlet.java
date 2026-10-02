import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {

    // Método POST para recibir y procesar los datos del formulario
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Capturamos los datos enviados desde el formulario HTML
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String rol = request.getParameter("rol");
        String nivel = request.getParameter("nivel");

        // Guardamos los datos en la petición para pasárselos al JSP
        request.setAttribute("usuarioNombre", nombre);
        request.setAttribute("usuarioCorreo", correo);
        request.setAttribute("usuarioRol", rol);
        request.setAttribute("usuarioNivel", nivel);

        // Redirigimos la respuesta a la página dinámica JSP
        request.getRequestDispatcher("bienvenida.jsp").forward(request, response);
    }

    // Método GET por si se intenta acceder a la ruta directamente desde el navegador
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.getWriter().println("Por favor regístrese a través del formulario HTML.");
    }
}
