/**
 * Created by admin on 3/30/17.
 */
public interface Another extends Start {

    String boo();

    default String boo2() {
        return "boo2";
    };

}
