public class Main {

    public static void main(String[] args) {

        Football football = new Football();
        System.out.printf("Calling fail %s %n ", football.fail());
        System.out.printf("Calling compete %s %n ", football.compete());
        System.out.printf("Calling start %S  %n", Start.onField());
        System.out.printf("Calling Let go %s  %n", Bench.letGo());
        System.out.printf("Calling the team %d  %n", football.game());
        System.out.printf("Calling the cuts %d  %n", football.cut());

        EvenMore evenMore = new EvenMore();
        System.out.printf("Calling %s %n", evenMore.boo());
        System.out.printf("Calling %s %n", evenMore.compete());
        System.out.printf("Calling %s %n", evenMore.boo2());

    }
}
