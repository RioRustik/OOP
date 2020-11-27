package ru.kusiapkulov.studentAndRecordBook.blockThree.recordBook;

public class Main {

    public static void main(String[] args) {


//        Human human1 = new Human("Клеопатра", 152);
//        Human human2 = new Human("Пушкин", 167);
//        Human human3 = new Human("Леброн", 189);
//        System.out.println(human1);
//        System.out.println(human2);
//        System.out.println(human3);

//        Name name1 = new Name("Клеопатра", null, null);
//        Name name2 = new Name("Александр", "Сергеевич", "Пушкин");
//        Name name3 = new Name("Владимир", null, "Маяковский");
//        Name name1 = new Name("Клеопатра");
//        Name name2 = new Name("Александр", "Сергеевич", "Пушкин");
//        Name name3 = new Name("Владимир", "Маяковский");
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);

//        HumanName humanName = new HumanName(new Name("Клеопатра"), 152);
//        HumanName humanName2 = new HumanName(new Name("Александр", "Сергеевич", "Пушкин"), 167);
//        HumanName humanName3 = new HumanName( new Name("Владимир", "Маяковский"), 189);
//        System.out.println(humanName);
//        System.out.println(humanName2);
//        System.out.println(humanName3);

//        HumanParent human1 = new HumanParent(new Name("Иван", "Чудов"), null);
//        HumanParent human2 = new HumanParent(new Name("Петр", "Чудов"), human1);
//        HumanParent human3 = new HumanParent( new Name("Борис"), human2);
//        System.out.println(human1);
//        System.out.println(human2);
//        System.out.println(human3);

        StudentBook s1 = new StudentBook("Вася", 171896, new RecordBook[]
                  {
                  new RecordBook("информатика", "Ермаков", 5),
                  new RecordBook("математика", "Петрова", 4),
                  new RecordBook("физика", "Сидоров", 5)
                  }
        );
        System.out.println(s1);
        s1.book[2] = new RecordBook("Англский язык", "Буров", 4);
        System.out.println(s1);
        StudentBook s2 = new StudentBook("Петя", 191896);
        s2.book = s1.book.clone();
        System.out.println(s2);
        s2.book[1].grade = 5;
        System.out.println(s2);



    }
}