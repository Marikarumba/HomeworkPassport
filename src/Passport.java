import java.util.Objects;
import java.time.LocalDate;

public class Passport {

    private final int numberPassport;
    private final String surname;
    private final String name;
    private final String secondName;
    private final String birthday;

    public Passport(int numberPassport, String surname, String name, String secondName, String birthday) {
        if ( surname == null || name == null  || birthday == null) {
            throw new IllegalArgumentException(" Данные должны быть заполнены полностью");
        }
        if (numberPassport != 0 && numberPassport > 0) {
            this.numberPassport = numberPassport;
        } else {
            throw new IllegalArgumentException("Неверный номер пасспорта");
        }
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport == passport.numberPassport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberPassport=" + numberPassport +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}