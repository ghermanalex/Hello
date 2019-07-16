import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {

            return first;

        } else {

            return second;

        }
    }

    public String checkString(String text) {
        if (text.equals("FastTrackIT"))
            return "Learning text comparison";
        else
            return "Got to try some more";
    }

    public String checkString2(String text, int nr) {
        if (text.equals("FastTrackIT") && nr <= 3)
            return text + nr;
        else
            return nr + text;
    }

    public String checkSnow(int number) {
        if (number > 8 || number == 6)
            return "The amoumt of snow this winter (cm):" + number;
        else
            return "The forecast  snow is (cm):" + number;
    }

    public String checkNumber(int number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else return "The number is lower than 3";
    }

    public void checkSwitch(int number) {
        boolean t = true;
        switch (number) {
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");

        }
    }

    public Boolean isNumberEven(int number) {
        if (number % 2 == 0)
            return true;
        else return false;
    }

    public Boolean isEligibleToVote(int number) {
        if (number >= 18)
            return true;
        else return false;
    }

    public int celMaiMare(int a, int b, int c) {
        int rez = a;
        if (b > rez)
            rez = b;
        if (c > rez)
            rez = c;
        return rez;
    }


    public void panaLa100(int number) {
        if (number > 100) {
            System.out.println("Numarul este deja mai mare ca si 100");
            return;
        }
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void panaLaMinus100(int number) {
        if (number < -100) {
            System.out.println("Numarul este deja mai mare ca si -100");
            return;
        }

        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void numeratoare(int x, int y) {
        int aux;
        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for (int i = x; i < y; i++)
            System.out.println(i);

    }


    public void afisarePare() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void afisareImPare() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public int adunarePanaLa100(int number) {
        if (number > 100) {
            System.out.println("Numarul este deja mai mare ca si 100");
            return 0;
        }
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }


    public double mediPanaLa100(int number) {
        if (number > 100) {
            System.out.println("Numarul este deja mai mare ca si 100");
            return 0;
        }
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum / ((100 - number + 1) * 1.0);
    }


    public void tipar() {
        for (int i = 1; i <= 7; i++) {
            String str = "";
            for (int j = i; j <= 7; j++)
                str += "*";
            System.out.println(str);
            System.out.println();
        }
    }

    public void panaLa100While(int number) {

        while (number <= 100) {
            System.out.println(number);
            number++;
        }

    }

    public void panaLaMinus100While(int number) {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }


    public void numaratoareWhile(int x, int y) {
        int aux;
        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    public void afisarePareWhile() {
        int i = 1;
        while (i < 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }


    public void afisareImPareWhile() {
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }

    public void adunaNumere() {
        int i = 111;
        int sum = 0, count = 0;
        while (i <= 8899) {
            sum += i;
            count++;
            i++;
        }
        System.out.println("Suma numerelor de la 111 la 8899 este:" + sum);
        System.out.println("Media numerelor de la 111 la 8899 este:" + sum / count);
    }

    public void numereDivizibileInterval(int a, int b) {
        int sum = 0, count = 0;
        while (a < b) {
            if (a % 7 == 0) {
                sum += a;
                count++;
            }
            a++;
        }
        System.out.println(sum / (count * 1.0));
    }

    public void sirFibonacci() {
        int a = 0, b = 1, c = 1, count = 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        while (count <= 17) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
            count++;
        }
    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i < 110) {
            String str = "";

            int j = 1;
            while (j <= 11) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
                    str += "CozaLozaWoza ";
                else if (i % 5 == 0 && i % 7 == 0)
                    str += "WozaLoza ";
                else if (i % 3 == 0 && i % 7 == 0)
                    str += "CozaWoza ";
                else if (i % 3 == 0 && i % 5 == 0)
                    str += "CozaLoza ";
                else if (i % 7 == 0)
                    str += "Woza ";
                else if (i % 5 == 0)
                    str += "Loza ";
                else if (i % 3 == 0)
                    str += "Coza ";
                else
                    str += i + " ";
                j++;
                i++;
            }
            System.out.println(str + " ");

        }
    }

    public void scrieArray(int myArray[]) {
        for (int i = 1; i <= 100; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
    }

    public int[] returnArray(int myArray[]) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[j] = i;
                j++;
            }
            //System.out.println(myArray[i]);
        }
        return myArray;
    }


    public double calculMedieArray(int myArray[]) {
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = i + 1;

        int sum = 0;
        for (int i = 0; i < myArray.length; i++)
            sum += myArray[i];

        return sum / (myArray.length * 1.0);

    }

    public Boolean matchString(String myAraay[], String str) {
        for (String s : myAraay) {
            if (s.equals(str))
                return true;
        }
        return true;

    }

    public Integer findNumber(Integer myAraay[], Integer nr) {

        for (int i = 0; i <= myAraay.length; i++) {
            if (nr == myAraay[i])
                return i;
        }
        return -1;

    }


    public Integer[] removeElement(Integer myArray[], Integer elem) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == elem) {
                // shifting elements
                for (int j = i; j < myArray.length - 1; j++) {
                    myArray[j] = myArray[j + 1];
                }
                break;
            }
        }
        return myArray;
    }


    public Integer alDoileaCelMaiMicNR(Integer myArray[]) {
        int min = myArray[0], alDoileaMin = 999999999;

        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            if (alDoileaMin > myArray[i] && myArray[i] != min) {
                alDoileaMin = myArray[i];
            }
        }

        return alDoileaMin;

    }

    public void copiaza(Integer myArray1[], Integer myArray2[]) {

        for (int i = 0; i < myArray1.length; i++) {
            myArray2[i] = myArray1[i];
        }

    }


    public void afisareLista(List<Integer> list) {
        list.stream().forEach(x -> System.out.println(x));
    }

    public void adaugareFinal(List<Integer> list, Integer e) {
        list.add(e);
    }

    public void afisarePornindNumar(List<Integer> list, Integer e) {
        for (int i = e; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void afisareReverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void adaugareListaPoz(List<String> list, String str, Integer poz) {
        list.add(poz, str);
    }

    public void adaugarePrimaPoz(List<String> list, String str) {
        list.add(0, str);
    }

    public void afisareValoriiPoz(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Pe pozitia " + i + " este valoarea " + list.get(i));
        }
    }

    public Integer maxLista(List<Integer> list) {
        Integer max = list.get(0);
        for (Integer a : list) {
            if (max < a)
                max = a;
        }
        return max;
    }


    public void adaugareFinalHashSet(Map<Integer, String> map, Integer key, String value) {
        map.put(key, value);
    }

    public void afisareELementHasSet(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }

    public Integer numarElementHashSet(Map<Integer, String> map) {
        return map.size();
    }

    public void golireHashSet(Map<Integer, String> map) {
        map.clear();
    }

    public Boolean verificareEmptyHashSet(Map<Integer, String> map) {
        return map.isEmpty();
    }

    public Map<Integer, String> clonareHashSet(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        newMap.putAll(map);
        return newMap;
    }

    public Boolean equalsHashSets(Map<Integer, String> map1, Map<Integer, String> map2) {
        Boolean bool = true;
        for (Integer key : map1.keySet()) {
            if (!map2.containsKey(key))
                bool = false;

        }
        return bool;

    }

    public void stergereToateElement(Map<Integer, String> map) {
        map.clear();
    }




}




