package homeWorkOneR;

public class HotDrinc extends Product{
    private String taste;
    private double volume;
    private double temperature;

    public HotDrinc(String name, double cost, String taste, double volume, double temperature) {
        super(name, cost);
        this.taste = taste;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    public HotDrinc(String name, double cost) {
        super(name, cost);
    }
}
