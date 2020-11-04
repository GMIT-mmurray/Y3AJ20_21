public class Grade {

    public static Grade fromValues(String [] values) {
       // int id = Integer.parseInt(values[0]);
        String name = values[1].trim();
        String email = values[2].trim();
        return new Grade(1, name, email);
    }

    public int id;
    public String name;
    public String email;

    public Grade(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}