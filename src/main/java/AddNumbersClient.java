import mypackage.*;

/**
 * Created by antondahlin on 2016-02-07.
 */



public class AddNumbersClient {
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            mypackage.AddNumbers port = (new AddNumbersService()).getAddNumbersPort();
            System.out.println("SUM "+port.addition(a,b));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

