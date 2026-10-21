package day21.first;

public class Main{
    public static void main(String[] args) {


        checkErr check = new checkErr();

        System.out.println(check.check(2));
        System.out.println(check.check(19));

    }


}


class checkErr {


    String strings[] = {
            "Ошибка ввода", "Ошибка вывода", "Место на диске", "Превышен лимит"};



    public String check(int i) {
        if (i >= 0 & (i < strings.length)) {
            return strings[i];
        } else {
            return "Несуществующий тип ошибки";
        }
    }

}