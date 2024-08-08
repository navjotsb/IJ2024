package TodoList;

public class DoTo {
    String name;
    Boolean complete;

    public DoTo(String name, Boolean complete) {
        this.name = name;
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "DoTo{" +
                "name='" + name + '\'' +
                ", complete=" + complete +
                '}';
    }
}
