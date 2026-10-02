<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Bienvenido - Campus Ejercicios</title>
</head>
<body>

    <h1>¡Bienvenido/a a Campus Ejercicios de Programación!</h1>

    <div style="border: 1px solid #ccc; padding: 15px; width: 350px;">
        <h3>Datos del Perfil Registrado:</h3>
        
        <!-- Elementos JSP <%= %> para mostrar la información capturada -->
        <p><strong>Nombre:</strong> <%= request.getAttribute("usuarioNombre") %></p>
        <p><strong>Correo:</strong> <%= request.getAttribute("usuarioCorreo") %></p>
        <p><strong>Rol Asignado:</strong> <%= request.getAttribute("usuarioRol") %></p>
        <p><strong>Nivel de Inicio:</strong> <%= request.getAttribute("usuarioNivel") %></p>
    </div>

    <br>
    <p><em>Todo listo para comenzar a ensayar código, ejecutar y subir de nivel.</em></p>

    <a href="registro.html">Volver al inicio</a>

</body>
</html>
