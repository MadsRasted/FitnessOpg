package fitness;

public class FullMember extends Member {

    //Attributes
    String memberType = "Full";
    int fee = 299;

    //Constructors
    public FullMember(){
    }

    public FullMember(String name, int cpr, String memberType, int fee) {
        super(name, cpr, memberType, fee);
    }

    //Methods
    public Member createFullM(String name, int cpr){
        Member full = new FullMember(name, cpr, memberType, fee);
        return full;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s", name, cpr, memberType, fee);
    }

}
