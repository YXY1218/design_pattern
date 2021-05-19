package test09;

public class Memento {
    private String name;

    private String content;

    private String persons;

    public Memento (Cahier cahier) {
        this.name = cahier.getName();
        this.content = cahier.getContent ();
        this.persons = cahier.getPersons ();
    }

    public void setName (String name) {
        this.name =  name;
    }
    public String getName () {
        return this.name;
    }
    public void setContent (String content) {
        this.content = content;
    }
    public String getContent () {
        return this.content;
    }
    public void setPersons (String persons) {
        this.persons =  persons;
    }
    public String getPersons () {
        return this.persons;
    }
}
