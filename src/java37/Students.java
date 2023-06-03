package java37;

public class Students {
    private String id, firstName;
    private Date birth;
    private double gpa;
    private ClassRoom classRoom;

    public Students(String id, String firstName, Date birth, double gpa, ClassRoom classRoom) {
        this.id = id;
        this.firstName = firstName;
        this.birth = birth;
        this.gpa = gpa;
        this.classRoom = classRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String courseName(){
        return this.classRoom.getCourse();
    }

    public boolean passTheExam(){
        return this.gpa >= 5;
    }

    public boolean checkSameDateOfBirth(Students otherStudents){
        return this.birth.equals(otherStudents.birth);
    }

}
