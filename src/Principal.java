public class Principal {
    public static void main(String[] args) {
        System.out.println("Práctica 1 de Clases y Objetos");

        // CREAR OBJETO USANDO CONSTRUCTOR POR DEFAULT
        Persona rubensin = new Persona();
        // Llenando las propiedades del objeto
        rubensin.nombrePersona = "Rubén Torres Frias";
        rubensin.edadPersona = 37;
        rubensin.rfcPersona = "TOFR830919";
        rubensin.fechaNacimiento = "19 de Septiembre de 1983";
        System.out.println(rubensin.nombrePersona);

        // CREAR OBJETO USANDO EL SEGUNDO CONSTRUCTOR
        Persona memo = new Persona("Memo",19,"MEMO19","16 mayo 2001");
        System.out.println(memo.nombrePersona);
    }
}

class Persona{

    public String nombrePersona;
    public int edadPersona;
    public String rfcPersona;
    public String fechaNacimiento;

    // Este es el constructor por default
    public Persona(){ }

    // Otro constructor
    public Persona(String nombre, int edad, String rfc, String fecha){
        nombrePersona = nombre;
        edadPersona = edad;
        rfcPersona = rfc;
        fechaNacimiento = fecha;
    }
}