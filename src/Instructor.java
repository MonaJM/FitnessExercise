/**
 * @author Mona Jakob Meshal
 */
public class Instructor extends Employee {

    //Getters
    @Override
    public int getSalary(){
        return this.getHours()*456; // return salary from Employee 456/hour.
    }
}
