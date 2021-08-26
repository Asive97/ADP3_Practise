package za.ac.cput.entity;

public class Manager {
    private String id;
    private String name;

    private Manager(){}

    public Manager(Builder builder) {
        this.id = builder.id;
        this.name =builder.name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Waiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Manager build(){
            return new Manager(this);
        }
        public Manager.Builder copy(Manager manager){
            this.id = manager.id;
            this.name = manager.name;
            return this;
        }
    }

}
