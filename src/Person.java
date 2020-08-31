/**
 * @author Mona Jakob Meshal
 */
public class Person {

    protected String name;
    protected String cpr;

    //Constructor
    public Person(){

    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
    //Method

    public String getBasicInfo(){
        return this.getName()+"\t"+this.getCpr()+"\t";
    }

    @Override
    public String toString() {
        return this.getBasicInfo();
    }
}
