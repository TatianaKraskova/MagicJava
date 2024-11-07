package main.java.org.hogwarts;

import java.util.Comparator;

public class StudentFacultyComparator implements Comparator<Student> {
    @Override
    public int compare(Student faculty1, Student faculty2) {
        return faculty1.getFaculty().compareTo(faculty2.getFaculty());
    }
}

/*

Collections !!! haven`t completed !!!

Первое задание
Прочитайте задачу полностью, прежде, чем к ней приступить. Если сейчас она кажется вам слишком сложной, отложите ее до прохождения урока по List, а затем вернитесь.

В проекте Magic уже есть класс Student.
Нужно реализовать Comparable для сортировки по возрастанию возраста волшебника.
Затем создать 2 разных Comparator для сортировки по алфавитному возрастанию имени и по алфавитному убыванию факультета.
Запустите в методе main три разные сортировки, и убедитесь в их работоспособности.
Для сортировки используйте коллекцию ArrayList.
Для добавление элементов в коллекцию используйте метод add.
 */
