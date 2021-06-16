package Dominio;


public class Estudiantes {
    private String genero;
    private int estudiantes;
    private double promedio;
    
    public Estudiantes (String genero, int estudiante, double promedio) {
        this.genero = genero;
        this.estudiantes = estudiante;
        this.promedio = promedio;
        
    }
        public String getGenero() {
            return genero;   
        }   
        
        public int getEstudiantes() {
            return estudiantes;
        }
        public double getPromedio() {
            return promedio;
    }
    
    @Override
    public  String toString(){
        return this.genero+" "+this.estudiantes+" "+this.promedio;
    }
}