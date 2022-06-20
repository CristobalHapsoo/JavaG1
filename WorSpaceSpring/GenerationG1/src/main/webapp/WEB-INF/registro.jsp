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
        <form:form action="/registro/auto" method="post" modelAttribute="auto">
            <form:label path="marca">Marca:</form:label>
            <form:input path="marca" />
            <br>
            <form:label path="modelo">Modelo:</form:label>
            <form:input path="modelo" />
            <br>
            <form:label path="anio">Anio:</form:label>
            <form:input type="String" path="anio" />
            <br>

            <form:label path="velocidad">velocidad:</form:label>
            <form:input type="Double" path="velocidad" />
            <br>




            <button type="submit" class="btn btn-outline-primary">Guardar Auto</button>
        </form:form>

    </div>

    <body>

    </body>

    </html>