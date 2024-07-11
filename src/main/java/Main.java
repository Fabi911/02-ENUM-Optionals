import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
        PersonRepository personRepository = new PersonRepository(new ArrayList<>());
        personRepository.addPerson(new Person("1", "John", DaysOfWeek.MONDAY));
        personRepository.addPerson(new Person("2", "Jane", DaysOfWeek.TUESDAY));
        System.out.println(personRepository.getPersonById("1"));
        System.out.println(personRepository.getPersonById("3"));
    }



}