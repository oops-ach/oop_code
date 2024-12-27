package sources;

import java.util.ArrayList;
import java.util.List;


public class School {
    private List<Person> members;

    public School(){
        this.members = new ArrayList<>();
    }

    public void addMember(Person person){
        this.members.add(person);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Person member : members){
            str.append(member.toString()).append("\n");
        }
        return str.toString();
    }
}
