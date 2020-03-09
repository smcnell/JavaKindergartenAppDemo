public class ScKindergartenCalculator extends KindergartenCalculator{

    @Override
    public boolean calculatesPassingOrFailure(Score score) {
        return score.getReadingScore() > 80 && score.getMathScore() > 80;
    }
}
