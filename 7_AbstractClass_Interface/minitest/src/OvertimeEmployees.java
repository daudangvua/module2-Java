public class OvertimeEmployees extends Personnel{
    private double timeWork;

    public OvertimeEmployees() {
    }
    public OvertimeEmployees(double timeWork) {
        this.timeWork = timeWork;
    }
    public OvertimeEmployees(String id, String fullName, int age, String phone, String email, double timeWork) {
        super(id, fullName, age, phone, email);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public double getFoodReceived() {
        return getTimeWork()*100000;
    }
    @Override
    public String toString() {
        return "Bán thời gian:" +
                "\nid: " + getId() +
                "\nfull name: " + getFullName() +
                "\nage: " + getAge() +
                "\nphone: " + getPhone() +
                "\nemail: " + getEmail() +
                "\ntimework: " + getTimeWork()+'\n';
    }
}
