public class Passport {
    String number;
    String dateOfBirth;
    Accomodation accomodation;

    public Passport(String number, String dateOfBirth, Accomodation accomodation) {
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        this.accomodation = accomodation;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", accomodation=" + accomodation +
                '}';
    }
}
