public class FullTimeEmployee extends Personnel {
    private double bonus;
    private double fine;
    private double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public FullTimeEmployee(String id, String fullName, int age, String phone, String email, double bonus, double fine, double salary) {
        super(id, fullName, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getFoodReceived() {
        return getSalary()+(getBonus()-getFine());
    }

    @Override
    public String toString() {
        return "Toàn thời gian:" +
                "\nid: " + getId() +
                "\nfull name: " + getFullName() +
                "\nage: " + getAge() +
                "\nphone: " + getPhone() +
                "\nemail: " + getEmail() +
                "\nbonus: " + getBonus() +
                "\nfine: " + getFine() +
                "\nsalary: " + getSalary()+'\n';
    }

}
