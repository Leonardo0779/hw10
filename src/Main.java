public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s", fullName);

        System.out.println("\nTask2");
        String fullNameMax = fullName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameMax.toUpperCase());

        System.out.println("\nTask3");
        String fullNameNew = "Иванов Семён Семёнович";
        fullNameNew = fullNameNew.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s", fullNameNew);
    }
}