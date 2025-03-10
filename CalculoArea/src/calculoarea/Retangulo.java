
package calculoarea;

public class Retangulo implements FormaGeometrica{
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public float calculaArea() {
        return (float) (base * altura);
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2 * (base + altura));
    }
    
    
}
