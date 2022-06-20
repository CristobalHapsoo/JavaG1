<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Cristobal Hapsoo</title>
        </head>

        <body>
            <h1>Hola
                <c:out value="${marca}"></c:out>
                <c:out value="${modelo}"></c:out>
                <c:out value="${anio}"></c:out>
            </h1>
            <p>
                <c:out value="${velocidad}"></c:out>
            </p>
            <br>
            <%-- ${} --> esto es un place holder--%>
                <p>
                    <c:out value="${auto.marca} ${auto.getModelo()} ${auto.anio} ${auto.velocidad}"></c:out>
                </p>
        </body>

        </html>