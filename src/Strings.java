import java.util.ArrayList;
import java.util.List;

public class Strings {

    public void printDetails(StringBuilder stringBuilder) {
        String content = stringBuilder.toString();
        Integer length = stringBuilder.length();
        Integer capacity = stringBuilder.capacity();
        System.out.println("The content:" + content + " ,the length: " + length + " ,the capacity: " + capacity + " of the string builder");
    }

    public void compareStrings(String a,String b){
        if(a.compareTo(b)==0)
            System.out.println("Stringurile sunt egale");
        else if (a.compareTo(b)<0)
            System.out.println("Stringul "+a+" este mai mare ca stringul "+b+" d.p.d.v lexicografic" );
        else
            System.out.println("Stringul "+a+" este mai mare ca stringul "+b+" d.p.d.v lexicografic" );
    }

    public void compareStringsIgonoreCaseSesitive(String a,String b){
        if(a.compareToIgnoreCase(b)==0)
            System.out.println("Stringurile sunt egale");
        else if (a.compareTo(b)<0)
            System.out.println("Stringul "+a+" este mai mare ca stringul "+b+" d.p.d.v lexicografic" );
        else
            System.out.println("Stringul "+a+" este mai mare ca stringul "+b+" d.p.d.v lexicografic" );
    }

    //se poate  si concatenant str1 la str2 folosing: str1+=str2, si returnand str1
    public StringBuilder concateneteStrings(String str1,String str2){
        StringBuilder concat = new StringBuilder(str1);
        concat.append(str2);
        return concat;
    }


    //se poate face si cu String in loc de StringBuilder
    public Boolean containsCharSequence(StringBuilder stringBuilder, char[] seq){
        Boolean check = true;
        for(char c:seq){
            //indexOf method poate verfica doar daca un String exista in stringBuilder
            // asa ca am tranformat characterul in string
            String aux = c+"";
            if(stringBuilder.indexOf(aux)==-1)
                check = false;
        }
        return check;
    }

    public void compareStringToStringBuffer(String string, StringBuffer stringBuffer){
        if(string.compareTo(stringBuffer.toString())==0)
            System.out.println("Stringul si Stringul bufferul sunt egale");
        else if (string.compareTo(stringBuffer.toString())<0)
            System.out.println("Stringul "+string+" este mai mare ca String bufferul "+stringBuffer+" d.p.d.v lexicografic" );
        else
            System.out.println("Stringul "+string+" este mai mare ca String bufferul "+stringBuffer+" d.p.d.v lexicografic" );
    }

    public Integer subStringEnds(String string1, String string2){
        return string1.indexOf(string2) + string2.length()-1;
    }


    public List<String> divideEqualParts(String string, Integer parts){
        Integer length = string.length();
        if(parts>length || parts <=0 ) {
            System.out.println("Invalid number of parts");

        }
        List<String>  list = new ArrayList<>();
        for(int i=0;i<length-1;i+=parts){
            list.add(string.substring(i,i+parts));
        }

        return list ;
    }


    public String removeBsiAC(String string){
        String faraB=  string.substring(0,'b') + string.substring('b'+1);
       // String faraAC=  string.substring(0,"ac") + string.substring("ac"+1);
        return faraB;
    }

}
