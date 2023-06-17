package genericsintro;

public class Painter<T extends Building> {
    public void paint(T building) {
        building.paint();
    }

    public T getBuilding(T building) {
        return building;
    }
}
