package ma.sp1.entities;

public class EntitiesClass {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntitiesClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
