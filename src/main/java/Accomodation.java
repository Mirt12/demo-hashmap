public class Accomodation {
    String street;
    int building;
    int appartment;

    public Accomodation(String street, int building, int appartment) {
        this.street = street;
        this.building = building;
        this.appartment = appartment;
    }

    @Override
    public String toString() {
        return "Accomodation{" +
                "street='" + street + '\'' +
                ", building=" + building +
                ", appartment=" + appartment +
                '}';
    }
}
