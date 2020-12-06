package methodparam.measuring;

public class Measurement {
    private double[] datas;

    public Measurement(double[] datas) {
        this.datas = datas;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        for (double data : datas) {
            if (data > lower && data < upper) {
                return (int) data;
            }
        }
        return -1;
    }

    public double maximum(){
        double maximumValue = datas[0];
        for(int i = 1; i < datas.length; i++){
            if  ( datas[i] > maximumValue){
                maximumValue = datas[i];
            }
        }
        return maximumValue;
    }


    public double minimum(){
        double minimumValue = datas[0];
        for(int i = 1; i < datas.length; i++){
            if  ( datas[i] < minimumValue){
                minimumValue = datas[i];
            }
        }
        return minimumValue;
    }

    public ExtremValues minmax(){
        return new ExtremValues(minimum(),maximum());
    }

}
