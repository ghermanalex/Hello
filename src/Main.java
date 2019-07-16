import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Assigment1");
        assigment1();


        System.out.println();
        printName();
        printSuma();
        printImpartire();
        printCalcule();
        System.out.println();
        System.out.println();


        System.out.println("Assigment2");
        //2)
        System.out.println("2)");
        System.out.println("Rezultatul adunarii este: " + adunare(2, 3));
        System.out.println("Rezultatul scaderii este: " + scadere(2, 3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2, 3));
        System.out.println("Rezultatul impartirii este: " + imparire(2, 3));
        //3)
        System.out.println("3)");
        model1();
        //4)
        System.out.println("4)");
        System.out.println("Media este:" + average(1, 2, 2));
        //5)
        System.out.println("5)");
        model2();
        //6)
        System.out.println("6)");
        System.out.println("Restul impartirii este:" + restImpartire(2, 3));
        //7)
        System.out.println("7)");
        System.out.println("Transormare din farenhit in celsius:" + fahrenheitToCelsius(100));
        //8)
        System.out.println("8)");
        System.out.println("Transormare din inch in metri:" + inchesToMeters(10));
        //9)
        System.out.println("9)");
        calculViteaza(100000, 1, 0, 0);
        System.out.println();
        System.out.println();


        System.out.println("Assigment3 IF ELSE");

        //1) 2)
        System.out.println("1)");
        Calculator calc = new Calculator();
        System.out.println("Rezultatul adunarii este: " + calc.adunare(2, 3));
        System.out.println("Rezultatul scaderii este: " + calc.scadere(2, 3));
        System.out.println("Rezultatul inmultirii este: " + calc.inmultire(2, 3));
        System.out.println("Rezultatul impartirii este: " + calc.imparire(2, 3));

        //2) 3)
        System.out.println("3)");
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(2, 3);
        System.out.println("The bigger number is: " + biggest);

        //4)
        System.out.println("4)");
        System.out.println(op.checkString("FastTrackIT"));
        System.out.println(op.checkString("FastTrack"));


        //5)
        System.out.println("5)");
        System.out.println(op.checkString2("FastTrackIT", 2));
        System.out.println(op.checkString2("FastTrackIT", 5));

        //6)
        System.out.println("6)");
        System.out.println(op.checkSnow(6));
        System.out.println(op.checkSnow(2));

        //7)
        System.out.println("7)");
        System.out.println(op.checkNumber(2));
        System.out.println(op.checkNumber(4));
        System.out.println(op.checkNumber(10));

        //8)
        System.out.println("8)");
        op.checkSwitch(10);
        op.checkSwitch(11);

        //9)
        System.out.println("9)");
        int x = 2;
        System.out.println("Este numberul " + x + " par:" + op.isNumberEven(x));

        //10)
        System.out.println("10)");
        System.out.println(op.isEligibleToVote(18));
        System.out.println(op.isEligibleToVote(17));

        //11)
        System.out.println("11)");
        System.out.println("Cel mai mare numar este:" + op.celMaiMare(3, 2, 1));
        System.out.println();
        System.out.println();


        System.out.println("Assigment4 FOR LOOPS");
        //1)
        System.out.println("1)");
        op.panaLa100(98);
        op.panaLa100(100);
        op.panaLa100(101);

        //2)
        System.out.println("2)");
        op.panaLaMinus100(-98);
        op.panaLaMinus100(-100);
        op.panaLaMinus100(-101);

        //3) 4)
        System.out.println("3) 4)");
        op.numeratoare(10, 7);

        //5) 6) is create, ar nu le mai apelez

        //7)
        System.out.println("7)");
        System.out.println(op.adunarePanaLa100(98));

        //8)
        System.out.println("8)");
        System.out.println(op.mediPanaLa100(97));

        System.out.println("Assigment4 FOR LOOPS");

        op.tipar();
        System.out.println();
        System.out.println();


        System.out.println("Assigment4 WHILE LOOP");
        //1)
        System.out.println("1)");
        op.panaLa100While(98);

        //2)
        System.out.println("2)");
        op.panaLaMinus100While(-97);

        //3) 4)
        System.out.println("3)");
        op.numaratoareWhile(17, 15);

        //5) 6) is create, ar nu le mai apelez

        //7)
        System.out.println("7)");
        op.adunaNumere();

        //8
        System.out.println("8)");
        op.numereDivizibileInterval(6, 15);

        //9
        System.out.println("9)");
        op.sirFibonacci();

        //10
        System.out.println("10)");
        op.CozaLozaWoza();
        System.out.println();
        System.out.println();


        System.out.println("Assigment5 ARRAYS");
        //1
        System.out.println("1)");
        Calculator calcu = new Calculator();


        System.out.println("Rezultatul adunarii este: " + calcu.adunare(2, 3));
        System.out.println("Rezultatul adunarii este: " + calcu.adunare(1, 3.1));

        System.out.println("Rezultatul scaderii este: " + calcu.scadere(2, 3));
        System.out.println("Rezultatul scaderii este: " + calcu.scadere(2.1, 3.1));

        System.out.println("Rezultatul inmultirii este: " + calcu.inmultire(2, 3));
        System.out.println("Rezultatul inmultirii este: " + calcu.inmultire(2.1, 3.1));

        System.out.println("Rezultatul impartirii este: " + calcu.imparire(2, 3));
        System.out.println("Rezultatul impartirii este: " + calcu.imparire(2.1, 3.1));

        //2
        System.out.println("2)");
        int[] myArray = new int[101];
        //op.scrieArray(myArray);

        //3
        System.out.println("3)");
        int[] myArray2 = new int[50];
        for (int i = 0; i < op.returnArray(myArray2).length; i++) {
            System.out.println(myArray2[i]);
        }

        //4)
        System.out.println("4)");
        int[] myArray3 = new int[10];
        System.out.println(op.calculMedieArray(myArray3));


        //5)
        System.out.println("5)");
        String[] myArray4 = {"alex", "da", "nu"};
        String s = "da";
        System.out.println(op.matchString(myArray4, s));

        //6)
        System.out.println("6)");
        Integer[] myArray5 = {1, 2, 5, 6};
        System.out.println(op.findNumber(myArray5, 2));

        //7)
        System.out.println("7)");

        //8)
        System.out.println("8)");
        Integer[] myArray6 = {1, 2, 3, 5};
        for (Integer a : op.removeElement(myArray6, 1))
            System.out.println(a);

        //9)
        System.out.println("9)");
        Integer[] myArray7 = {3, 4, 3, 5, 2, 10, 1};
        System.out.println(op.alDoileaCelMaiMicNR(myArray7));

        //10)
        System.out.println("10)");
        Integer[] myArray8 = {3, 4, 3, 5, 2, 10, 1};
        Integer[] myArray9 = new Integer[7];
        op.copiaza(myArray8, myArray9);
        for (Integer a : myArray9)
            System.out.println(a);
        System.out.println();
        System.out.println();


        System.out.println("Assigment6 LISTS");
        //1)
        System.out.println("1)");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        op.afisareLista(list);

        //2)
        System.out.println("2)");
        op.adaugareFinal(list, 10);
        System.out.println(list);

        //3)
        System.out.println("3)");
        op.afisarePornindNumar(list, 2);

        //4)
        System.out.println("4)");
        op.afisareReverse(list);

        //5)
        System.out.println("5)");
        List<String> strings = new ArrayList<String>();
        strings.add("str1");
        strings.add("str2");
        strings.add("str3");
        op.adaugareListaPoz(strings, "ceva", 1);
        System.out.println(strings);

        //6)
        System.out.println("6)");
        op.adaugarePrimaPoz(strings, "ceva");
        System.out.println(strings);

        //7)
        System.out.println("7)");
        op.afisareValoriiPoz(strings);

        //8)
        System.out.println("8)");
        System.out.println(op.maxLista(list));
        System.out.println();
        System.out.println();


        System.out.println("Assigment7 HASH MAP");
        //1)
        System.out.println("1)");
        Map<Integer, String> mymap = new HashMap<Integer, String>() {
            {
                put(1, "one");
                put(2, "two");
                put(4, "four");
            }
        };
        op.adaugareFinalHashSet(mymap, 3, "three");


        //2)
        System.out.println("2)");
        op.afisareELementHasSet(mymap);

        //3)
        System.out.println("3)");
        System.out.println(op.numarElementHashSet(mymap));

        //4)
        System.out.println("4)");
        //op.golireHashSet(mymap);
        //System.out.println(op.numarElementHashSet(mymap));

        //5)
        System.out.println("5)");
        System.out.println("Hashsetul este gol:" + op.verificareEmptyHashSet(mymap));


        //6)
        System.out.println("6)");
        Map<Integer, String> newMap = new HashMap<Integer, String>();
        newMap = op.clonareHashSet(mymap);
        System.out.println(op.clonareHashSet(newMap));

        //7
        System.out.println("7)");
        System.out.println("Sunt hasheturile egale:" + op.equalsHashSets(newMap, mymap));
        newMap.put(10, "ten");
        System.out.println("Sunt hasheturile egale:" + op.equalsHashSets(newMap, mymap));


        //8)
        System.out.println("8)");
        op.stergereToateElement(mymap);
        System.out.println(op.numarElementHashSet(mymap));
        System.out.println();
        System.out.println();




        System.out.println("Assigment8 STREAMS(TUDOR)");
        //1)
        System.out.println("1)");
        List<String> list111 = Arrays.asList("cevaaaa", "ce", "helllooo", "22");
        list111.stream().filter(x1 -> x1.length() > 5).forEach(m -> System.out.println("Lenght >5 :" + m));


        //2
        System.out.println("2)");
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 1, 3, 2);
        Set<Integer> result = list.stream().filter(x1 -> x1 % 2 != 0).map(y1 -> y1 * 2).
                collect(Collectors.toSet());
        System.out.println(result);


        //3
        System.out.println("3)");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer result1 = numbers.stream().filter(x2 -> checkPrime(x2) == true).
                reduce(1, (prod, element) -> prod * element);
        System.out.println(result1);


        //4)
        System.out.println("4)");
        List<String> names = Arrays.asList("Irinuca", "ion", "Aaa", "i");

        Stream<String> ss = names.stream().filter(name -> name.startsWith("i"));
        System.out.println(ss.collect(Collectors.toList()));
        System.out.println();
        System.out.println();





        System.out.println("Assigment9 STRINGS");
        //1) 2) 3) 4) 5) 6)
        Strings strClass = new Strings();
        System.out.println("1) 2) 3) 4) 5) 6)");
        StringBuffer stringBuff = new StringBuffer(20);
        stringBuff.append("blessings");
        stringBuff.insert(0, "Good ");
        stringBuff.deleteCharAt(1);
        stringBuff.append(" be with you");
        System.out.println(stringBuff);
        stringBuff.setLength(3);
        System.out.println(stringBuff);


        //7)
        System.out.println("7)");
        StringBuilder strBuilder = new StringBuilder(20 );
        strBuilder.append("Alibaba");
        strClass.printDetails(strBuilder);

        //8)
        System.out.println("8)");
        Integer poz = 2;
        System.out.println(strBuilder.charAt(poz));



        //9)
        System.out.println("9)");
        String a = "abcd";
        String b = "Abcd";
        strClass.compareStrings(a,b);


        //10)
        System.out.println("10)");
        strClass.compareStringsIgonoreCaseSesitive(a,b);


        //11)
        System.out.println("11)");
        String str1="Fast ";
        String str2="car";
        StringBuilder build = strClass.concateneteStrings(str1,str2);
        System.out.println(build);


        //12)
        System.out.println("12)");
        StringBuilder stringBuilder = new StringBuilder("Ana are tarte" );
        char chars[] = {'a','r','t'};
        System.out.println(strClass.containsCharSequence(stringBuilder,chars));


        //13)
        System.out.println("13)");
        String string = "String";
        StringBuffer stringBuffer = new StringBuffer("String");
        strClass.compareStringToStringBuffer(string, stringBuffer);


        //14)
        System.out.println("14)");
        String unu = "StringABCandABC";
        String doi = "ABC";
        System.out.println(strClass.subStringEnds(unu,doi));


        //15)
        System.out.println("15)");


        //16)
        System.out.println("16)");
        System.out.println(doi.toLowerCase());

        //17)
        System.out.println("17)");
        System.out.println(unu.toUpperCase());

        //18)
        System.out.println("18)");
        String textWithSpace= "       Text  with  space            ";
        System.out.println(textWithSpace.trim());

        //19)
        System.out.println("19)");
        String str = "alexALEX";
        System.out.println(strClass.divideEqualParts(str,4));

        //20)
        System.out.println("20)");
        String bac = "Vine Bacu ac";

        //20 si 21 le fac maine




        System.out.println("Assigment10 TRY-CATCH");
        //1) 2)
        System.out.println("1) 2)");
        Read read = new Read();
        try {
            Integer integerNumber = read.readKeyboardInteger();
            Float floatNumber = read.readKeyboardFloat();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid number entered, exception:"+ e);
        }

        //3)
        System.out.println("3)");

        List<Integer> numbersList = new ArrayList<>();
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduceti lungimea sirului:");
            Integer length = keyboard.nextInt();
            numbersList = read.readNumbers(length);
            System.out.println(numbersList);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid number entered, exception:"+ e);
        }

        //4) 5) 6) pe maine


    }


    public static Boolean checkPrime(Integer nr) {
        for (int i = 2; i <= nr / 2; i++)
            if (nr % i == 0)
                return false;
        return true;
    }

    public static void assigment1() {

        //1)
        System.out.println("1)Hello world");
        System.out.println("Alex!");


        //2)
        System.out.println("2)");
        int a = 10, b = 3, c;
        c = a + b;
        System.out.println(c);

        //3)
        System.out.println("3)");
        int x = 10;
        float y = 3;
        System.out.println(+x / y);


        //4)
        System.out.println("4)");
        System.out.println(5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        float a1 = 20, b1 = -3, c1 = 5, d1 = 8, e1, f1;
        System.out.println(a1 + b1 * c1 / d1);
        a1 = 5;
        b1 = 15;
        c1 = 3;
        d1 = 2;
        e1 = -8;
        f1 = 3;
        System.out.println(a1 + b1 / c1 * d1 - e1 % f1);


    }

    public static void printName() {
        System.out.println("1)Hello World!");
        System.out.println("Alex!");

    }

    public static void printSuma() {
        int a = 10, b = 3, c, d;
        System.out.println("2)");
        c = a + b;
        System.out.println(c);
    }

    public static void printImpartire() {
        System.out.println("3)");
        int x = 10;
        float y = 3;
        System.out.println(x / y);
    }

    public static void printCalcule() {
        System.out.println("4)");
        System.out.println(5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        float a1 = 20, b1 = -3, c1 = 5, d1 = 8, e1, f1;
        System.out.println(a1 + b1 * c1 / d1);
        a1 = 5;
        b1 = 15;
        c1 = 3;
        d1 = 2;
        e1 = -8;
        f1 = 3;
        System.out.println(a1 + b1 / c1 * d1 - e1 % f1);
    }


    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;
    }

    public static long inmultire(int primulNumar, int alDoileaNumar) {
        long rezultat = primulNumar * alDoileaNumar;

        return rezultat;
    }

    public static double imparire(int primulNumar, int alDoileaNumar) {
        double rezultat = (primulNumar * 1.0) / (alDoileaNumar * 1.0);

        return rezultat;
    }


    public static void model1() {
        System.out.println("   J   a  v     v  a    \n" +
                "   J  a a  v   v  a a   \n" +
                "J  J aaaaa  V V  aaaaa  \n" +
                " JJ a     a  V  a     a");
    }

    public static double average(int primulNumar, int alDoileaNumar, int alTreileaNumar) {
        double rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / 3.0;
        return rezultat;

    }

    public static void model2() {
        System.out.println("  +\"\"\"\"\"+\n" +
                "[ | o o | ]\n" +
                "  |  ^  |\n" +
                "  | '-' |\n" +
                "  +-----+");
    }

    public static int restImpartire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar % alDoileaNumar;
        return rezultat;
    }

    public static double fahrenheitToCelsius(double farenhit) {
        double a = 5, b = 9, c = 32;
        double rezultat = a / b * (farenhit - 32);
        return rezultat;
    }

    public static double inchesToMeters(double inch) {
        double rezultat = inch / 39.380;
        return rezultat;
    }

    public static void calculViteaza(double distanta, int ore, int minute, int secunde) {
        double toateSecundele = ore * 3600 + minute * 60 + secunde;
        double ora = ore + minute / 60.0 + secunde / 3600.0;
        double km = distanta / 1000.0;
        double mile = km * 0.62137;

        double viteazaMetripeSecunda = distanta / (toateSecundele * 1.0);
        System.out.println("Viteza in metri pe secunda:" + viteazaMetripeSecunda);
        double viteazaKmPeOra = km / ora;
        System.out.println("Viteza in km pe ora:" + viteazaKmPeOra);
        double viteazaMilePeOra = mile / ora;
        System.out.println("Viteza in km pe ora:" + viteazaMilePeOra);


    }

}
