/**
 * Created by admin on 3/30/17.
 */
public class Football implements Start, Bench {
    public Football() {
    }

    @Override
    public String fail() {
        return "Didn't make the cut";
    }

    @Override
    public String compete() {
        return "Out on the field";
    }
}


