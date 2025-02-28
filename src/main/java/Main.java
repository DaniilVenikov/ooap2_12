import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
    }


}

class General implements Serializable {

    public Class<?> getType() {
        return this.getClass();
    }

    public static <TFrom extends Any, TTo extends Any> TTo assignmentAttempt(TFrom from, TTo to) {

        var classFrom = from.getType();
        var classTo = to.getType();
        if (classTo.isAssignableFrom(classFrom)) {
            return (TTo) from;
        }

        return (TTo) new None();
    }
}

class Any extends General {

}



final class None extends Any {
    //
}

