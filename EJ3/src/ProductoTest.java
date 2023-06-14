public class ProductoTest {
    public static void main(String[] args){
        Producto[] productos = {
            new Producto ("Guitarra",120.52,5),
            new Producto ("Guitarra",120.52,15),
            new Producto ("Guitarra",120.52,25),
            new Producto ("Guitarra",120.52,53),
            new Producto ("Guitarra",120.52,51)
        };

        for(Producto producto : productos){
            double valortotal = producto.precio * producto.cantidad;
            System.out.println("El Valor total de : " + producto.nombre +
                     " Es de : " + valortotal);
            System.out.println("-----------------");
        }


    }
}
