package CustomException;

public class TestCustom {

    static void validate(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("age is not valid to vote");
        }else{
            System.out.println("You can vote!!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(18);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception Occured"+e);
        } finally {
            System.out.println("end");
        }
    }
}
