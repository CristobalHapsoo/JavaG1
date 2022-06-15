<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <div>
        <c:if test="${msgError!= null }">
            <c:out value="${msgError }"></c:out>
        </c:if>
        <form:form action="/registro/usuario" method="post" modelAttribute="usuario">
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre" />
            <br>
            <form:label path="apellido">Apellido:</form:label>
            <form:input path="apellido" />
            <br>
            <form:label path="edad">Edad:</form:label>
            <form:input type="number" path="edad" />
            <br>
            <input type="submit" value="Registrar">
        </form:form>

    </div>

    <body>

    </body>

    </html>