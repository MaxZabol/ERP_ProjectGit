package src.ruslan.week04;

    public class T1_FrequencyOfCharacters {

        public static void main(String[] args) {

            System.out.println(FrequencyOfChars("AAABBCDD"));
// Test example
        }

        public static String FrequencyOfChars(String str) {

            String result = "";

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                int counter = 0;

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(j) == ch) {
                        counter++;
                    }
                }
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch + "" + counter;
            }

            return result;

        }
    }
/*
1. Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

