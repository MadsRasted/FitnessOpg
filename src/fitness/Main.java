package fitness;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Instanciering af klasser
        Adminstration ad = new Adminstration();
        Instructor ins = new Instructor();
        Member basic = new Member();
        FullMember full = new FullMember();

        //Oprettelse af lister
        List<Employee> emps = new ArrayList<Employee>();
        List<Member> members = new ArrayList<Member>();

        //Employee liste
        System.out.printf("FITNESS EMPOLYEES" + "\n" + "%-10s %-10s %-10s %-10s %-10s"," Name","CPR","Hours","Salary","Vacation" + "\n" + "********************************************* "+ "\n");
        emps.add(ad.createAdmin("Mads", 1008981717));
        emps.add(ad.createAdmin("Nick", 1237498988));
        emps.add(ins.createInstructor("Emil", 18981098, 14));
        for (Employee object : emps) {
            System.out.println(object);
        }

        System.out.println("");

        //Member liste
        members.add(basic.createBasicM("Nick", 1511931313));
        members.add(full.createFullM("Mads", 1008981838));
        System.out.printf("FITNESS Members" + "\n" + "%-10s %-10s %-10s %-10s"," Name","CPR","MemberType","Fee"+ "\n" + "********************************************* "+ "\n");
        for (Member objects : members) {
            System.out.println(objects);
        }

        System.out.println("");

        //Fuld liste
        System.out.println();
    }
}


