<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reserva Confirmada</title>
</head>
<body>

    <h1>Reserva Registrada</h1>

    <p><strong>Cliente:</strong> <%= request.getAttribute("nombre") %></p>

    <p><strong>Servicio:</strong> <%= request.getAttribute("servicio") %></p>

    <p><strong>Profesional:</strong> <%= request.getAttribute("profesional") %></p>

    <p><strong>Fecha:</strong> <%= request.getAttribute("fecha") %></p>

    <p><strong>Hora:</strong> <%= request.getAttribute("hora") %></p>

    <br>

    <a href="index.html">Volver al inicio</a>

</body>
</html>