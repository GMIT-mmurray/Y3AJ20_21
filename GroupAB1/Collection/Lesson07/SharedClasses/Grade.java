public class Grade {

    public static Grade fromValues(String [] values) {
        String lastName  = values[0].trim();
        String firstName  = values[1].trim();
        String SSN  = values[2].trim();
        Float test1 = Float.parseFloat(values[3]);
        Float test2 = Float.parseFloat(values[4]);
        Float test3 = Float.parseFloat(values[5]);
        Float test4 = Float.parseFloat(values[6]);
        Float finalGrade = Float.parseFloat(values[7]);

        return new Grade(lastName,firstName,SSN,test1,test2,test3,test4,finalGrade);
    }


    public String firstName;
    public String lastName;
    public String SSN;
    public Float test1;
    public Float test2;
    public Float test3;
    public Float test4;
    public Float finalGrade;


    public Grade(String lastName, String firstName, String SSN, Float test1,
                 Float test2, Float test3, Float test4, Float finalGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.SSN = SSN;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.finalGrade = finalGrade;
    }
}