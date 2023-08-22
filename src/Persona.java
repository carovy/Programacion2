import java.time.LocalDate;

public class Persona {
    private String nombre, apellido, sexo;
    private int edad, dni;
    private LocalDate nacimiento;
    private double peso, altura, imc;
    private final double MAXIMC = 25;
    private final double MINIMC = 18.5;
    LocalDate hoy = LocalDate.now();


    public Persona(int dni) {
        this(dni, "N", "N", "Femenino", 1, 1, LocalDate.of(2000, 1, 1));
    }

    public Persona(int dni, String nombre, String apellido, String sexo, double peso, double altura, LocalDate nac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        nacimiento = nac;
        this.peso = peso;
        this.altura = altura;

    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate nac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        nacimiento = nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return peso / (altura * altura);
    }

    public boolean isFitness() {
        return imc > MINIMC && imc < MAXIMC;
    }

    public boolean isCumpleanios() {

        return (nacimiento.getDayOfMonth() == hoy.getDayOfMonth()) && (nacimiento.getMonthValue() == hoy.getMonthValue());
    }
    public boolean verificarEdad(){
        return  hoy.getYear() - nacimiento.getYear() == edad;
    }

    public void mostrarDatos(){
        System.out.println(dni+" "+nombre+" "+apellido+" "+sexo+" "+altura+" "+peso+" "+nacimiento);
    }

    public boolean isMayor(int edadMayor) {
        return edad > edadMayor;
    }

    public static void main(String[] args) {
        Persona p1= new Persona(42773657,"simon" , "castelnuovo", "Masculino",80,180, LocalDate.of(2000,8,19));
        p1.setEdad(23);
        System.out.println(p1.edad);
        p1.mostrarDatos();
        boolean isMayor= p1.isMayor(20);
        if (isMayor)
            System.out.println(p1.nombre+" es mayor");
        boolean edadCoincide= p1.verificarEdad();
        System.out.println(edadCoincide);
    }
}
