    package InterviewQuestions;

    import java.util.Scanner;

    public class CountVowelsConsonants {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String");
            String s = sc.nextLine();
            countVoCon(s);
        }
        public static void countVoCon(String s) {
            int vo = 0, con = 0;
            s = s.toLowerCase(); // handle case-insensitivity

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vo++;
                    } else {
                        con++;
                    }
                }
            }

            System.out.println("Vowels in given string: " + vo);
            System.out.println("Consonants in given string: " + con);
        }
    }
