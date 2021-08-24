package za.ac.cput.entity;

public class Waiter {
    private String id;
    private String name;

    private Waiter() {
    }
    public Waiter(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
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
        public Waiter build(){
        return new Waiter(this);
        }
        public Waiter.Builder copy(Waiter waiter){
            this.id = waiter.id;
            this.name = waiter.name;
            return this;
        }
    }
}
