public class LOCATION {

    public int row;
    public int column;
    public double maxValue;

    public LOCATION(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static LOCATION locateLargest(double[][] a) {

        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new LOCATION(row,column,maxValue);
    }


}
    
