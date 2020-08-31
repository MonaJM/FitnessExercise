/**
 * @author Mona Jakob Meshal
 */
public class Employee extends Person {

    private int hours;
    private int salary;

    //Setters
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Getters
    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        String result = super.toString();
        return result+this.getHours()+"\t"+this.getSalary()+"\t";
    }
}
