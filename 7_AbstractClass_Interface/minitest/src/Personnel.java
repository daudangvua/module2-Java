public abstract class Personnel implements Comparable<Personnel> {
    private String id;
    private String fullName;
    private int age;
    private String phone;
    private String email;

    public Personnel() {
    }

    public Personnel(String id, String fullName, int age, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getFoodReceived();

    @Override
    public int compareTo(Personnel other) {
        return Double.compare(this.getFoodReceived(), other.getFoodReceived());
    }
    @Override
    public String toString() {
        return "Personnel{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
