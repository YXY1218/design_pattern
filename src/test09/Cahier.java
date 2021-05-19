package test09;

public class Cahier {
    private String name;

    private String content;

    private String persons;

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

    public Memento getMemento() {
        return new Memento(this);
    }

    public void setMemento(Memento memento) {
        this.name = memento.getName();
        this.content = memento.getContent ();
        this.persons = memento.getPersons ();
    }
}

