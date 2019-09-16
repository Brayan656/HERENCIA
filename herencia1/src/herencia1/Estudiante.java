
package herencia1;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{
 
    private String carnet;
    private double promedioNotas;
    private int numeroDeMaterias;

    public Estudiante() {
        
    }
    
    public Estudiante(String carnet, double promedioNotas, int numeroDeMaterias,String nombre, String apellido, int edad,double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroDeMaterias = numeroDeMaterias;
    }
    
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public int getNumeroDeMaterias() {
        return numeroDeMaterias;
    }
    public void setNumeroDeMaterias(int numeroDeMaterias) {
        this.numeroDeMaterias = numeroDeMaterias;
    }
    
   public double calcularPromedio(double notas,int numeroDeMaterias){
       return notas/numeroDeMaterias;
   }
   
   public double leerNotasEstudiante(int cantidadDeMaterias){
       double notas=0,promedio=0;
       for (int i = 0; i < cantidadDeMaterias; i++) {
           notas=notas+leerDatoTipoReal("ingresa la nota "+(i+1));
       }
       promedio=calcularPromedio(notas,cantidadDeMaterias);
       return promedio;
   }
   
   public Estudiante ingresarDatosEstudiante(){
       Estudiante nuevoEstudiante=new Estudiante();
       int edad = 0;
       String nombre="";
       String apellido = "";
       double peso=0;
       
       String carnet="";
       double promedioNotas=0;
       int numeroDeMaterias=0;
       
       
       nombre=leerDatoTipoCadena ("Ingresa el nombre del estudiante:");
       apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
       carnet=leerDatoTipoCadena ("Ingresa el carnet del estudiante:");
       edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
       peso = leerDatoTipoReal("Ingrese el peso del empleado: ");
       numeroDeMaterias= leerDatoTipoEntero("Ingresa el numero de materias: ");
       promedioNotas=leerNotasEstudiante(numeroDeMaterias);
       
       nuevoEstudiante.setNombre(nombre);
       nuevoEstudiante.setApellido(apellido);
       nuevoEstudiante.setEdad(edad);
       nuevoEstudiante.setPeso(peso);
       nuevoEstudiante.setCarnet(carnet);
       nuevoEstudiante.setNumeroDeMaterias(numeroDeMaterias);
       nuevoEstudiante.setPromedioNotas(promedioNotas);
       
       return (nuevoEstudiante);
   }
   
   public void imprimirReporteNotasEstudiante(){
       
       imprimirDatosPersona();
       JOptionPane.showMessageDialog(null,"carnet: "+carnet+"\nNumero de materias: "+numeroDeMaterias+"\nPromedo de notas: "+promedioNotas);

   }
}
