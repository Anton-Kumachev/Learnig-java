package Learning_Massives;

//Доступ к элементу массива по индексу, сложность алгоритма O(1):

public class GetIntegerArrayElementByIndex {

    public static void main(String[] args) {

        int[] integerArray = {10, 6, 4, 23, 87, 1, 12, 1004};
        int indexOfRequiredElement = 5;

        if (indexOfRequiredElement < integerArray.length) {
            int element = integerArray[indexOfRequiredElement];
            System.out.println(element);
        }
    }
}
