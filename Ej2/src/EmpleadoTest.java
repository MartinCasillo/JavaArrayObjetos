public class EmpleadoTest {
    public static void main(String[] args){
        Empleado[] empleados = {

                new Empleado("Martin",150000,3),
                new Empleado("Nicolas",50000,1),
                new Empleado("Juan",110000,7),
                new Empleado("Pedro",70000,6)

        };

        for(Empleado empleado : empleados){
            System.out.println("El empleado : " + empleado.nombre
            + "Tiene un salario de : " + empleado.salario + " y una antiguedad de : " + empleado.antiguedad);
            System.out.println("------------------------------");
        }

        for (Empleado empleado : empleados) {
            if(empleado.antiguedad >= 5){
                empleado.salario = empleado.salario * 1.10;
                System.out.println("----------------");
                System.out.println("A : " + empleado.nombre +
                        " Se le aumento el salario a : " + empleado.salario);
            }else{
                System.out.println("----------------");
                System.out.println("A : " + empleado.nombre +
                        " No se le aumento por que no cumpe con la antiguedad");
            }
        }
    }
}
