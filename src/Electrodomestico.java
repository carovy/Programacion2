public class Electrodomestico {
    private String nombre, color;
    private int consumoEnergico;
    private double precio, peso;
    private static double balance = 0;

    public Electrodomestico(String nombre, String color, int consumo, double precio, double peso) {
        this.nombre = nombre;
        this.color = color;
        consumoEnergico = consumo;
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico() {
        this("N","Gris plata", 10, 100, 2);

    }

    public Electrodomestico(String nombre, int consumo, double precio) {
        this.nombre = nombre;
        consumoEnergico = consumo;
        this.precio = precio;
    }

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    public boolean esBajoConsumo() {
        return consumoEnergico < 45;
    }

    public double getBalance() {
        return precio / peso;
    }

    public boolean esAltaGama() {
        return balance > 3;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergico() {
        return consumoEnergico;
    }

    public void setConsumoEnergico(int consumoEnergico) {
        this.consumoEnergico = consumoEnergico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        balance= e1.getBalance();
        boolean altaGama=e1.esAltaGama();
        System.out.println(altaGama);
    }
}
