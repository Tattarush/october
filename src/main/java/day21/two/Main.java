package day21.two;

public class Main {
    public static void main(String[] args) {

        CheckErr checkErr = new CheckErr();

        Err err;
        err = checkErr.getInfo(2);
        System.out.println(err.index+" "+ err.text);
        err = checkErr.getInfo(19);
        System.out.println(err.index+" "+ err.text);

    }
}


class Err {
    String text;
    int index;

    Err(String text, int index) {
        this.text = text;
        this.index = index;
    }
}

class CheckErr {

    String msgs[] = {"Ошибка вывода", "Ошибка ввода",
            "Отсутствует место на диске", "Выход индекса за границы диапазона"
    };

    int howBad[] = {2, 3, 4, 5};


    Err getInfo(int i) {
        if (i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howBad[i]);
        } else {
            return new  Err("No information", 0);
        }
    }

}

