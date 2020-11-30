package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name, String otherName) {
        for (Member memberName : members) {
            if (memberName.getName().equals(name)) {
                for (Member memberOtherName : members) {
                    if (memberOtherName.getName().equals(otherName)) {
                        memberName.connectMember(memberOtherName);
                    }
                }
            }
        }
    }

    public Member findByName(String name) {
        Member findMember = null;
        for (Member memberName : members) {
            if (memberName.getName().equals(name)) {
                findMember = memberName;
            }
        }
        return findMember;
    }

    public List<String> bidirectionalConnections() {
        List<String> bidirectionalConnectionList = new ArrayList<>();
        for (Member memberFirst : members) {
            for (Member memberSecond : members) {
                for (Member memberConnect : memberSecond.getConnections()) {
                    if (memberConnect.getName().equals(memberFirst.getName())) {
                        String biconn = memberFirst.getName() + " - " + memberSecond.getName();
                        bidirectionalConnectionList.add(biconn);
                    }
                }
            }
        }
        return bidirectionalConnectionList;
    }

    public List<Member> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
