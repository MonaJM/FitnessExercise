import java.util.ArrayList;

/**
 * @author Mona Jakob Meshal
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Person> myPersons = new ArrayList<Person>();

        //Admin
        myPersons.add(newAdmin("claus", "221175-1011"));
        myPersons.add(newAdmin("Anna", "011080-1014"));

        //Instructor
        myPersons.add(newInstructor("Tove", "011080-1014"));
        myPersons.add(newInstructor("Henning", "012090-1012"));

        //Members
        myPersons.add(newMember("Morten", "130195-1303", false));
        myPersons.add(newMember("Martin", "221175-1011", true));
        myPersons.add(newMember("Martina", "050970-1409", false));
        myPersons.add(newMember("Marcel", "221275-1013", true));

        System.out.println(employeeStr(myPersons));
        System.out.println(membersStr(myPersons));
        System.out.println(overviewStr(myPersons));
    }

    //Method - generating new administration obj
    public static Administration newAdmin(String name, String cpr){
        Administration myAdmin = new Administration();
        myAdmin.setName(name);
        myAdmin.setCpr(cpr);

        return myAdmin;
    }
    //Method - generating new instructor obj
    public static Instructor newInstructor(String name, String cpr) {
        Instructor newInstructor = new Instructor();
        newInstructor.setName(name);
        newInstructor.setCpr(cpr);

        return newInstructor;
    }

    //Method - generating new member obj
    public static Member newMember(String name, String cpr, boolean isBasic) {
        Member newMember = new Member();
        newMember.setName(name);
        newMember.setCpr(cpr);
        newMember.setBasic(isBasic);

        return newMember;
    }

    //Method - printing Fitness Employees
    public static String employeeStr(ArrayList<Person> list){
        String txt = "";

        txt = "\nFITNESS EMPLOYESS\nName\tCpr\tHours\tSalary\tVacation\n";
        txt += "******************************************\n";

        for (int i = 0; i <= list.size()-1; i++) //-1 = getting last position dynamically
        {
            if(list.get(i) instanceof Administration || list.get(i) instanceof Instructor) {
                txt += list.get(i).toString() +"\n";
            }
        }
        txt += "==========================================";
        return txt;
    }
    //Methods - printing Fitness Members
    public static String membersStr(ArrayList<Person> list) {
        String txt = "";

        txt = "\nFITNESS MEMBERS\nName\tCpr\tMemberType\tFee\n";
        txt += "******************************************\n";

        for (int i = 0; i <= list.size() - 1; i++) //-1 = getting last position dynamically
        {
            if (list.get(i) instanceof Member) {
                txt += list.get(i).toString() + "\n";
            }
        }
        txt += "==========================================";
        return txt;
    }
    //Methods - printing Fitness overview (Employees + Members)
    public static String overviewStr(ArrayList<Person> list) {
        String txt = "";

        txt = "\nFITNESS EMPLOYESS & MEMBERS Name and cpr\nName\tCpr\n";
        txt += "******************************************\n";

        for (int i = 0; i <= list.size() - 1; i++) //-1 = getting last position dynamically
        {
            txt += list.get(i).getBasicInfo()+"\n";
        }
        txt += "==========================================";
        return txt;
    }
}
