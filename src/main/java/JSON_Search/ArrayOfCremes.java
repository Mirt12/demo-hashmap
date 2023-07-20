package JSON_Search;

public class ArrayOfCremes {
    Creme creme1;
    Creme creme2;

    public ArrayOfCremes(Creme creme1, Creme creme2) {
        this.creme1 = creme1;
        this.creme2 = creme2;
    }

    @Override
    public String toString() {
        return "ArrayOfCremes{" +
                "creme1=" + creme1 +
                ", creme2=" + creme2 +
                '}';
    }
}
