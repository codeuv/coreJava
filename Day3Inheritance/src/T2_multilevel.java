public class T2_multilevel {
    static class baby{
//        int infant_id ;
        String gender ;
        String mother ;

        public baby(/*int infant_id,*/ String mother, String gender) {
//            this.infant_id = infant_id;
            this.mother = mother;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "baby{" +
                    "gender='" + gender + '\'' +
                    ", mother='" + mother + '\'' +
                    '}';
        }
    }

    static class Adult  extends baby{
        String voter_id =  "None";
        String name ="None";
        public Adult(String mother, String gender, String voter_id ,String name) {
            super(mother, gender);
            this.voter_id = voter_id;
            this.name = name;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class Oldage extends Adult{
        int pension ;

        public Oldage(String mother, String gender, String voter_id, String name, int pension) {
            super(mother, gender, voter_id, name);
            this.pension = pension;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
