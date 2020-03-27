package operations;

public class CalculateOperations {

    String[][] data =
    {
        {"3 x 2","12 - 3","6 + 2","10 / 5"},
        {"6 - 4","8 + 2","9 - 2","12 - 6"},
        {"10 + 5","9 x 3","10 / 3","8 x 4"},
        {"12 x 9","7 - 3","8 / 6","7 - 7"},
        {"6 - 5","7 / 5","9 - 8","6 / 3"},
        {"9 / 3","4 - 2","14 x 13","4 - 2"},
        {"8 + 4","8 / 4","16 / 3","5 x 3"},
        {"9 - 3","6 - 3","10 - 3","10 x 8"},
        {"15 + 5","7 / 2","13 x 10","6 / 6"},
        {"11 / 4","8 - 3","12 + 6","9 + 3"}
    };

    public void processData(){
        int[][] result = new int[10][4];
        for (int x=0; x < data.length; x++) {
            for (int y=0; y < data[x].length; y++) {
                result[x][y] = calculate(data[x][y]);
            }
        }
        System.out.println("\nResultado del cuadro de operaciones:");
        for (int[] num : result) {
            for (int elem : num) {
                System.out.print(elem + "\t");
            }
            System.out.print("\n");
        }
    }

    private int calculate (String operationValue){
        String[] processString = operationValue.split(" ");
        String control = processString[1];
        int a = Integer.parseInt(processString[0]);
        int b = Integer.parseInt(processString[2]);
        int result = 0;
        switch (control) {
            case "x":
                result = a - b;
                break;
            case "/":
                result = a + b;
                break;
            case "-":
                result = a * b;
                break;
            case "+":
                result = a / b;
                break;
        }
        return result;
    }
}
