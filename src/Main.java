import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String NombreEmpleado,DocumentoEmpleado,DiaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double horasTrabajadas = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double AuxilioTransporte = 200000;
        double ValorHorasExtra = 0;
        double cantidadHorasExtras = 0;
        double TotalValorHorasExtra = 0;

        System.out.println("Ingrese el nombre del empleado");
        NombreEmpleado = Sc.nextLine();
        System.out.println("ingrese el documento del empleado");
        DocumentoEmpleado = Sc.nextLine();
        System.out.println("Que dia tomo de descanso solamente Lunes a viernes");
        DiaDescanso = Sc. nextLine();

    }
}