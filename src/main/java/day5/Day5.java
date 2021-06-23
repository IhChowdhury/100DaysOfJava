package day5;

/**
 * Created by Ibrahim Chowdhury on 23 Jun, 2021
 *
 * Today we will see how to create custom exception
 */
public class Day5 {
    public static void main(String[] args) {

        try{
            boolean value = checkData();
        }catch (ExceptionCorruptedData corruptedData){
            System.out.println(corruptedData.getMessage());
        }

    }

    public static boolean checkData(){
        String desiredData = "A & B";
        String checkingData = "C & D";

        if(!desiredData.equals(checkingData)){
            throw new ExceptionCorruptedData("desiredData and checkingData is not same.");
        }else {
            System.out.println("desiredData and checkingData is same.");
        }
        return true;
    }

    public static class ExceptionCorruptedData extends RuntimeException{
        public ExceptionCorruptedData(String exceptionMessage){
            super(exceptionMessage);
        }
    }
}
