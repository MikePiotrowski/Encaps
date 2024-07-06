package Main;

import model.Student;
import model.Student2;
import util.ConsoleColorPrinter;

public class Main {
    public static void main(String[] args){

        Student student = new Student();
        student.setName("Michael");
        student.setAge(52);

        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_RED, "\nName: " + student.getName());
        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_RED, "Age: " + student.getAge());
        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_RED, "He is a male = " + student.male() + "!");

        Student2 student2 = new Student2();
        student2.setName("Beth");
        student2.setAge(56);

        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_BLUE, "\nName: " + student2.getName());
        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_BLUE, "Age: " + student2.getAge());
        ConsoleColorPrinter.printInColor(ConsoleColorPrinter.ANSI_BLUE, "She is a female = " + student2.female() + "!");
    }
}