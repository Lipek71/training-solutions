package exceptionmulticatch.converter;


public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String booleanStr){
        try {
           return converter.binaryStringToBooleanArray(booleanStr);
        } catch (NullPointerException | IllegalArgumentException ex){
            throw new InvalidBinaryStringException("Conversion fault", ex);
        }
    }

    public int answerTruePercent(String answers){
        boolean[] booleanArray = convert(answers);
        int count=0;
        for(int i=0; i < booleanArray.length; i++){
            if(booleanArray[i]){
                count++;
            }
        }
        return (int)Math.round((double)count / answers.length() * 100);
    }

    public static void main(String[] args) {
        AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());
        answerStat.convert(null);
    }
}
