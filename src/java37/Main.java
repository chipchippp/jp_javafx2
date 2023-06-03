package java37;



public class Main {
    public static void main(String[] args) {
        Date date = new Date(19, 7, 2002);
        Date date2 = new Date(17, 2, 2001);
        Date date3 = new Date(19, 7, 2002);

        ClassRoom classRoom = new ClassRoom("DH01", "Khoa Công nghệ Thông tin");
        ClassRoom classRoom2 = new ClassRoom("DH02", "Khoa Khoa học Máy tính");
        ClassRoom classRoom3 = new ClassRoom("DH03", "Khoa An ninh mạng");

        Students students = new Students("0001", "Tùng ITV", date, 9.0, classRoom);
        Students students2 = new Students("0002", "Tùng ITV", date2, 4.5, classRoom2);
        Students students3 = new Students("0003", "Tùng ITV", date3, 8.9, classRoom3);

        System.out.println("lấy tên Khoa: ");
        System.out.println("student1: "+students.courseName());
        System.out.println("student2: "+students2.courseName());
        System.out.println("student3: "+students3.courseName());

        System.out.println("kiểm tra thi đạt: ");
        System.out.println("student1: "+students.passTheExam());
        System.out.println("student2: "+students2.passTheExam());
        System.out.println("student3: "+students3.passTheExam());


        System.out.println("Kiểm tra cùng ngày sinh: ");
        System.out.println("student1 and student2: " +students.checkSameDateOfBirth(students2));
        System.out.println("student1 and student3: " +students.checkSameDateOfBirth(students3));

    }
}
