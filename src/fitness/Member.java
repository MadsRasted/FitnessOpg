package fitness;

public class Member {

    //Attributes
    String name;
    int cpr;
    String memberType = "Basic";
    int fee = 199;

    //Constructors
    public Member() {
    }

    public Member(String name, int cpr, String memberType, int fee) {
        this.name = name;
        this.cpr = cpr;
        this.memberType = memberType;
        this.fee = fee;
    }

    //Methods
    public Member createBasicM(String name, int cpr){
        Member basic = new Member(name, cpr, memberType, fee);
        return basic;
    }

    @Override
    public String toString() {
        return name + "    " + cpr + "    " + memberType + "       " + fee;
    }
}
