/**
 * Created by admin on 3/30/17.
 */
public interface Start {
    String compete();
    static String onField(){
        return "Team on the field";
    }
    default int game(){
        return 11;

    }

}
