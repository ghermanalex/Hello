import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

    public Integer readKeyboardInteger()throws InputMismatchException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer:");
        Integer number = keyboard.nextInt();
        return number;
    }


    public Float readKeyboardFloat()throws InputMismatchException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an float number:");
        Float number = keyboard.nextFloat();
        return number;
    }


    public Double readKeyboardDouble()throws InputMismatchException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an double number:");
        Double number = keyboard.nextDouble();
        return number;
    }

    public Long readKeyboardLong()throws InputMismatchException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an long number:");
        Long number = keyboard.nextLong();
        return number;
    }


    public List<Integer> readNumbers(Integer length) throws InputMismatchException
    {
        List<Integer> numbersList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        while(length!=0){
            System.out.println("Enter an integer:");
            Integer number = keyboard.nextInt();
            numbersList.add(number);
            length--;
        }
        return numbersList;
    }

    public List<Integer> readNumbers()
    {
        List<Integer> numbersList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String readNumber = "";
        Integer number;
        while(true){
            System.out.println("Enter an integer number:");
            readNumber = keyboard.next();
            try{
                number = Integer.parseInt(readNumber);
            }
            catch (NumberFormatException e){
                break;
            }
        }
        return numbersList;
    }



    public void wait(Integer time){
        try {
            Thread.sleep(time*1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }



}
