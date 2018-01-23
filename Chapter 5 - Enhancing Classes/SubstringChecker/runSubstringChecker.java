package SubstringChecker;

public class runSubstringChecker {
    public static void main(String[] args) {
        SubstringChecker questionChecker = new SubstringChecker("question");

        System.out.println(questionChecker.accept("This is a rhetorical question."));
        System.out.println(questionChecker.accept("question"));
        System.out.println(questionChecker.accept("Question: are you ok?"));
        System.out.println(questionChecker.accept("Answer: No"));

        System.out.println("The string being checked is: "+questionChecker.toString());
    }
}
