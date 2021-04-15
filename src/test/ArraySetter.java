package test;

public class ArraySetter {
    public int[] setOnes(int[] testArray){
        for(int i=0; i < testArray.length; i++){
            if(testArray[i] == 0){
                testArray[i] = 1;
            }
        }

        return testArray;
    }
    public int[] setZeroesToOnes(int[] testArray){
        int[] newArray;
        for(int i=0; i < testArray.length; i++){
            if(testArray[i] == 0){
                testArray[i] = 1;
            }
        }
        if(testArray.length > 10){
            newArray = new int[10];
            for(int i=0; i<10;i++){
                newArray[i] = testArray[i];
            }
        }else {
            newArray = testArray;
            for(int i=0; i< newArray.length; i++){
                if(newArray[i] == 0){
                    newArray[i] = 1;
                }
            }
        }
        return newArray;
    }
}
