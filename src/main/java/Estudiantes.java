import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {

            System.out.println("CONTROL DE CALIFICACIONES");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
;
                    System.out.println("        REGISTRAR ESTUDIANTE");

                    System.out.print("Cuatnos Estudiantes registraras?: ");

                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= cantidad; i++) {

;
                        System.out.println("Estudiante " + i);


                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Parcial 1: ");
                        double e1 = sc.nextDouble();

                        System.out.print("Parcial 2: ");
                        double e2 = sc.nextDouble();

                        System.out.print("Parcial 3: ");
                        double e3 = sc.nextDouble();
                        sc.nextLine();

                        double promedio = (e1 + e2 + e3) / 3;

                        System.out.printf("Promedio: ", promedio);

                        if (promedio >= 6) {
                            System.out.println("Resultado: APROBADO");
                        } else {
                            System.out.println("Resultado: REPROBADO");
                        }
                    }
                    break;

                case 2:
                    // Mostrar estadisticas (pendiente)
                    break;

                case 3:
                    System.out.println("El programa a temrinade");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
