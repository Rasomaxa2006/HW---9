//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
    //Задча 1
    System.out.println("Задача 1");
    int [] inputArray1 = {12_195, 15_000, 16_790, 4_987, 7_567};
    int sum = 0;
    int max = inputArray1[0];
    int min = inputArray1[0];
    for (int value : inputArray1) {
        sum = sum + value;
        if (value > max) {
            max = value;
        }
        if (value < min) {
            min = value;
        }
    }
    float average = (float) sum / inputArray1.length;
    float [] outputArray1 = {sum, max, min, average};
    for (int i = 0; i < inputArray1.length; i++) {
        System.out.println(inputArray1[i] + " ");
    }
    System.out.println(" ");
    for (int i = 0; i < outputArray1.length; i++){
        System.out.println(outputArray1[i] + " ");
    }
    System.out.println(" ");
    System.out.println("_________");

    //Задача 2
    System.out.println("Задача 2");
    int [] inputArray2 = {12_195, 15_000, 16_790, 4_987, 7_567};
    float [] outputArray2 = new float [inputArray2.length];
    for (int i : inputArray2) {
        System.out.println(i + " ");
    }
    System.out.println(" ");
    System.out.println("_________");

    //Задача 3
    System.out.println("Хадача 3");
    int [] inputArray3 = {12_195, 15_000, 16_790, 4_987, 7_567};
    boolean [] outputArray3 = new boolean[inputArray3.length];
    IntStream.range(0, inputArray3.length).forEach(i -> {
        if (inputArray3[i] > 5_000) {
            outputArray3[i] = true;
        } else {
            outputArray3[i] = false;
        }
    });
    System.out.println(Arrays.toString(outputArray3));
    System.out.println("_________");

    //Задача 4
    System.out.println("Задача 4");
    int [] inputArray4 = {2_300, 5_600, 1_700, -3_500, 12_500};
    boolean outputArray4 = true;
    int badValue = 0;
    for (int balance : inputArray4)
        if (balance < 0) {
            outputArray4 = false;
            badValue = balance;
            break;
        }
    System.out.println(Arrays.toString(inputArray4));
    System.out.println(outputArray4);
    if (!outputArray4) {
        System.out.println("Проблемное значение : " + badValue);
    }
    System.out.println("_________");

    //Задача 5
    System.out.println("Задача 5");
    int [] inputArray5 = {10_000, - 5_000, 7_500, 0, - 2_000};
    int [] outputArray5 = new int [1];
    for (int i : inputArray5) {
        if (i > 0) {
            outputArray5[0]++;
        }
    }
    System.out.println(Arrays.toString(outputArray5));





}
