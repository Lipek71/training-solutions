package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Member> connenctions = new ArrayList<>();
    public void connectMember(Member member){
        connenctions.add(member);
    }

    public List<Member> getConnections(){
        return connenctions;
    }

    public List<String> connectedNames(){
        List<String> connectedNamesList = new ArrayList<>();
        for(Member memberName : connenctions){
            connectedNamesList.add(memberName.getName());
        }
        return connectedNamesList;
    }

    @Override
    public String toString() {
        return name + " " + connectedNames().toString();
    }
}
