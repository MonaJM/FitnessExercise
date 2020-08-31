/**
 * @author Mona Jakob Meshal
 */
public class Member extends Person {

    private boolean isBasic;

    //Setters
    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    //Getters
    public String getMembertype(){
        if (this.isBasic){
            return "Basic";
        }
        return "Full";
        //return this.isBasic ? "Basic" : "Full"; //? = if true, : = else false
    }

    public int getMonthlyFee(){
        if (this.isBasic){
            return 199;
        }
        return 299;
        //return this.isBasic ? 199 : 299; //? = if true, : = else false
    }
    @Override
    public String toString() {
        return super.toString()+this.getMembertype()+"\t"+this.getMonthlyFee();
    }
}
