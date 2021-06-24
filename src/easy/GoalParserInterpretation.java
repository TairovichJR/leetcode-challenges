package easy;

/**
 * Created by tairovich_jr on 2021-06-24.
 */
public class GoalParserInterpretation {
    public String interpret(String command) {

        return command.replace("G", "G").replace("()","o")
                .replace("(al)", "al");
    }

    public static void main(String[] args) {

        System.out.println(new GoalParserInterpretation().interpret("(al)G(al)()()G"));
    }
}
