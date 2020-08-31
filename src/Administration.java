/**
 * @author Mona Jakob Meshal
 */
public class Administration extends Employee {

    private int vacation;

    //Constructor
    public Administration(){
        //Set methods inherited from Employee
        this.setHours(37);
        this.setSalary(23000);
        this.setVacation(5);
    }
    //Setters
    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    //Getters
    public int getVacation(){
        return vacation;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+this.getVacation();
    }
}
