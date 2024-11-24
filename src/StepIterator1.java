import java.util.Collection;
import java.util.Iterator;

public class StepIterator<T>{
    private Collection<T> collection;
    private int step;
    public StepIterator(Collection<T> collection,int step) throws illegalStepIterator
    {
        this.collection=collection;
        if (step <= 0) {
            throw new illegalStepIterator("Step size must be higher than 0");
        }
        this.step = step;


    }
    public void SetStep(int step)
    {
        this.step=step;
    }
    public int GetStep()
    {
        return this.step;
    }
    public Collection<T> PrintCollection(Collection c){
        Iterator<T> iterator = this.collection.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            T element = iterator.next();
            count++;

            if (count % step == 0) {
                System.out.println(element);
            }
        }

        // Return the original collection
        return this.collection;

    }


}
