package Controlador;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/// implementamos el path llave para conectarnos
@WebServlet("/Formulario")

public class Formulario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //el cabesero que devuelve al servidor
        response.setContentType("text/html; charset=UTF-8");
        // Recibimos parametros por medio de get
        //cliente manda un parametro
        String metodoHttp = request.getMethod();
        String requestURI = request.getRequestURI();
        String requestURL = request.getRequestURL().toString();
        String contexPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String ip = request.getLocalAddr();
        int port = request.getLocalPort();
        String scheme = request.getScheme();
        String host = request.getHeader("Host");
        String Uel1 = ":/"+host+":"+port+contexPath+servletPath;



        //escribir dentro de mi navegador variable printwriter
        PrintWriter out = response.getWriter();
        //ecribimos la respuesta en htnl
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset =\"utf-8\">");
        out.println("<title>Cabeceros</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Manejo de Cabecero</h1>");
        out.println("<ul>");
        out.println("<li>Metodo utilizado para la peticion GET: " + metodoHttp + " </li>");
        out.println("<li>Metodo utilizado para la peticion URI: " + requestURI+ " </li>");
        out.println("<li>Metodo utilizado para la peticion URl: " + requestURL+ " </li>");
        out.println("<li>Metodo utilizado para la peticion Path: " + contexPath+ " </li>");
        out.println("<li>Metodo utilizado para la peticion SPath: " + servletPath+ " </li>");
        out.println("<li>Metodo utilizado para la peticion IP:" + ip+ " </li>");
        out.println("<li>Metodo utilizado para la peticion port:" + port+ " </li>");
        out.println("<li>Metodo utilizado para la peticion scheme: " + scheme + " </li>");
        out.println("<li>Metodo utilizado para la peticion host: " + host+ " </li>");
        out.println("<li>Metodo utilizado para la peticion Uel1: " + Uel1+ " </li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }


}
