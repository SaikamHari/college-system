public class Staff {
    int id;
    String name;
    String department;

    public Staff(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public String toString() {
        return "Staff ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}