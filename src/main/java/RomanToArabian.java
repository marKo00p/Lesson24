import java.util.HashMap;

public class RomanToArabian {

    public static void main(String[] args) {

        System.out.println(convertRomanToArabian("lxxxviii"));
    }

    public static int convertRomanToArabian(String roman) {

        HashMap<Character, Integer> romanToArabian = new HashMap<>();
        romanToArabian.put('I',1);
        romanToArabian.put('V',5);
        romanToArabian.put('X',10);
        romanToArabian.put('L',50);
        romanToArabian.put('C',100);
        romanToArabian.put('D',500);
        romanToArabian.put('M',1000);

            int arabian = 0;
            int previous = 0;

            for (int i = roman.length() - 1; i >= 0; i--)
            {
                int temp = romanToArabian.get(roman.toUpperCase().charAt(i));
                if(temp < previous) {
                    arabian -= temp;
                }
                else
                    arabian += temp;
                previous = temp;
            }
            if(roman.toUpperCase().contains("IIV"))
            {
                arabian -= 2;
            }
        if(roman.toUpperCase().contains("IIX"))
        {
            arabian -= 2;
        }
            return arabian;
    }

}
