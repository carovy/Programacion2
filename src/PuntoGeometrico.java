public class PuntoGeometrico {
    private int puntoX1, puntoY1;

    public PuntoGeometrico(int corX, int corY) {
        puntoX1 = corX;
        puntoY1 = corY;
    }

    public PuntoGeometrico() {
        this(0, 0);
    }

    public void desplazarPuntos(int incrementoX, int incrementoY) {
        puntoX1 = puntoX1 + incrementoX;
        puntoY1 = puntoY1 + incrementoY;
    }

    public double calcularEuclidea(PuntoGeometrico p2) {
        return Math.sqrt(((puntoX1 - p2.puntoX1) * (puntoX1 - p2.puntoX1)) + ((puntoY1 - p2.puntoY1) * (puntoY1 - p2.puntoY1)));
    }

    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(2, 4);
        p1.desplazarPuntos(4, 5);
        PuntoGeometrico p2 = new PuntoGeometrico(1, 1);
        double distancia = p1.calcularEuclidea(p2);
    }
}
