import java.util.Collection;

public class illegalStepIterator extends Exception{


    public illegalStepIterator(String message) {
        // Pass the message to the parent Exception class
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" illegal ";
    }
}
