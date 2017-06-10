/**
 * Created by esephak on 6/10/2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String nickName;
    private int rollId;
    private int Mark;

    public Student(int rollId){
        this.rollId = rollId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public int getRollId() {
        return rollId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                ", rollId=" + getRollId() +
                ", Mark=" + getMark() +
                '}';
    }
}
