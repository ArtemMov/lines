public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);


        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - "+ upperFullName);

        fullName = "Ёжиков Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё","Е");
        System.out.println("Данные Ф. И. О. сотрудника — "+ fullName);

    }

}