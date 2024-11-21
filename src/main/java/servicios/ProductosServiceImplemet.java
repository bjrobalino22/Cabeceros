package servicios;

import modelos.Producto;

import java.util.Arrays;
import java.util.List;

public class ProductosServiceImplemet  implements ProductosService{
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1, "laptop", "computacion",545.45 ),
                new Producto(2, "cocina", "casa",400.52 ),
                new Producto(3, "mause", "tecnoligia",802.41));

    }
 }
