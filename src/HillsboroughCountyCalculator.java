public class HillsboroughCountyCalculator extends FlKindergartenCalculator{
    public boolean isStudentAtRisk(Score score) {
        return score.getAlphabetScore() < 60;
    }

    public boolean calculatesPassingOrFailure(Score score) {
        score.setMathScore(200);
        return super.calculatesPassingOrFailure(score) && score.getAlphabetScore() > 50;
    }
}
