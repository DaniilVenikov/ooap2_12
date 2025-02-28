import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        General general = new General();

        Any any = new Any();

        Any.assignmentAttempt(any, general);
    }


}

class General implements Serializable {
    public static <T> void assignmentAttempt(General target, T source) {
        if (source instanceof General) {
            target = (General) source;
            System.out.printf("Successfully, object %s", target.getClass());
            return;
        }

        target = new None();
        System.out.printf("Error, object %s", target.getClass());

    }
}

class Any extends General {
    public static <T> void assignmentAttempt(Any target, T source) {
        if (source instanceof Any) {
            target = (Any) source;
            System.out.printf("Successfully, object %s", target.getClass());
            return;
        }

        target = new None();
        System.out.printf("Error, object %s", target.getClass());
    }
}



final class None extends Any {
    //
}

