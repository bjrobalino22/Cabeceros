package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelos.Producto;
import servicios.ProductosService;
import servicios.ProductosServiceImplemet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//Anotacion
@WebServlet({"/producto"})
public class ProductoXls extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductosService service = new ProductosServiceImplemet();
        List<Producto> productos = service.listar();
        resp.setContentType("text/html;charset=UTF-8");
        // Recibimos parametros por medio de get
        //cliente manda un parametro

        //escribir dentro de mi navegador variable printwriter
        PrintWriter out = resp.getWriter();
        //ecribimos la respuesta en htnl
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset =\"utf-8\">");
        out.println("<title> Listado de Productos</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Listado de Productos</h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID PRODUCTO</th>");
        out.println("<th>NOMBRE</th>");
        out.println("<th>CATEGORÍA</th>");
        out.println("<th>PRECIO</th>");
        out.println("</tr>");
//metodo flecha recorrer toda la lista que tengo
        productos.forEach(p -> {
            out.println("<tr>");
            //encapsulMOS LOS DATOS CON EL METODO GET CON TODOS LOS CONSECTOS
            out.println("<td>" + p.getIdProducto() + "</td>");
            out.println("<td>" + p.getNombre() + "</td>");
            out.println("<td>" + p.getCategoria() + "</td>");
            out.println("<td>" + p.getPrecio() + "</td>");
            out.println("</tr>");
        });
        out.println("</table>");

        }
    }




