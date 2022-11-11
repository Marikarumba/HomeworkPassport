import java.util.HashSet;
import java.util.Set;


    public class PassportList {

        Set <Passport> passports = new HashSet<>();


        public void addPassport(Passport passport){
            this.passports.add(passport);
        }

        public Passport findByNumber (int numberPassport){
            for (Passport passport: passports){
                if (passport.getNumberPassport() == numberPassport) {
                    return passport;
                }
            }
            return null;
        }
    }

