import java.util.stream.LongStream;

public class KindergartenPassingApp {
    public static void main(String[] args) {
        Score score = new Score();
        score.setReadingScore(40);
        score.setMathScore(70);
        score.setAlphabetScore(80);

        HillsboroughCountyCalculator hillsboroughCountyCalculator = new HillsboroughCountyCalculator();
        System.out.println(hillsboroughCountyCalculator.calculatesPassingOrFailure(score));
        System.out.println(score.getMathScore());
    }
}
