public class Grade {

    public static Grade fromValues(String [] values) {
        String lastName = values[0].trim();
        String firstName = values[1].trim();
        String SSN = values[2].trim();
        float test1 = Float.parseFloat(values[3]);
        float test2 = Float.parseFloat(values[4]);
        float test3 = Float.parseFloat(values[5]);
        float test4 = Float.parseFloat(values[6]);
        float finalGrade = Float.parseFloat(values[7]);
        String grade = values[8].trim();
        return new Grade(firstName,lastName,SSN,test1,test2,test3,test4,finalGrade,grade);
    }

    public String firestname;
    public String lastName;
    public String SSN;
    public float test1;
    public float test2;
    public float test3;
    public float test4;
    public float finalGrade;
    public String grade;

    public Grade(String firestname, String lastName, String SSN,
                 float test1, float test2, float test3, float test4,
                 float finalGrade, String grade) {
        this.firestname = firestname;
        this.lastName = lastName;
        this.SSN = SSN;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.finalGrade = finalGrade;
        this.grade = grade;
    }
}