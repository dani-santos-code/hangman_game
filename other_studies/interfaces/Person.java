public class Person, implements Talk {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String chat() {
        return "Hi, I'm a Person";
    }
}