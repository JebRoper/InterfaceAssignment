/**
 * Created by admin on 3/30/17.
 */
public interface Bench {
    String fail();
    static String letGo(){
        return "Cut from the team";
    }
    default int cut(){
        return 15;
    }


}

