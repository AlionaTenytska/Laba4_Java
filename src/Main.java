public class Main {
    public static void main(String[] args) {

        P p = new P();

        Student[] students = new Student[5];

        Subject[] subjects ={
                new Subject("Java"),
                new Subject("ТППС"),
                new Subject("Web"),
                new Subject("C#"),
                new Subject("ММДО")};


        students[0] = new Student(1, 2, "Алена", "Tеницкая", "КБ-71", subjects);
        students[1] = new Student(2, 3, "Игорь", "Новиков", "КБ-71",subjects);
        students[2] = new Student(3, 4, "Дмитрий", "Смирнов", "КБ-71",subjects);
        students[3] = new Student(4, 5, "Елена", "Октябрская", "КБ-71",subjects);
        students[4] = new Student(5, 6, "Мария", "Остапенко", "КБ-71",subjects);

        for(Student student : students){

            p.println("Студент номер - "+student.getId());
            p.println("Имя: "+student.getName());
            p.println("Фамилия: "+student.getSurname());
            p.println("Группа: "+student.getGroup());
            for(Subject subject: subjects){
                p.println("Название предмета - "+subject.getNameSubject());
                p.println("Оценка - "+subject.getMark());
                p.println("Статус ( сдан или нет)  - "+subject.getPassed());
            }
            p.print("*****************************************\n");

        }

        for(Student student : students){
            p.println("Средняя оценка студента "+student.getId() );
            p.println("Средняя оценка:"+student.averageMark());


        }

        Student bestStudent = Utils.getTheBestStudent(students);

        p.println("Наилучший студент: " + bestStudent.getName() +" "+ bestStudent.getSurname() + " со средним балом - " +bestStudent.averageMark());

        String bestSubject = Utils.getTheBestSubject(students);
        p.println(bestSubject);







    }




}
