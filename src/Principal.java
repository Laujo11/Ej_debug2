class Persona {
    protected String nombre;
    protected java.util.Date fechaNac;
    protected String documento;
}

class Empleado extends Persona {
    protected int codigoEmp;
    protected char area;
    protected int antiguedad;
    
    public Empleado(int codigo) {
        if(codigo<1000)
        this.codigoEmp = codigo+1000;
        else
            this.codigoEmp  = codigo;
    }
}

class Formulario {
    char categoria;
    int numero;
    java.util.Date fechaExpedido;
}

class PlanillaSueldos extends Formulario {
    byte mes;
    Empleado Empleados[];
    
    public PlanillaSueldos(Empleado emples[]) {
        this.Empleados = emples;
    }
}

public class Principal {
    public static void main(String args[]) {
        
        Empleado emples[] = new Empleado[120];
        PlanillaSueldos p;
        
        for(int i= 0 ; i<120; i++)       //se crean 10 empleados
        emples[i] = new Empleado( i );  //y se guardan en el vector emples
                                        //Cada elemento del vector es un objeto 
        
        p = new PlanillaSueldos( emples );
    }
    
}