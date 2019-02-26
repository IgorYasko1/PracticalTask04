package study.forthpracticaltask.vowel;

public class VowelChecker {

    private static final int[] VOWELSEQUENCE = {'A', 'E', 'I', 'O', 'U'};

    public static boolean checkCharacter(final char a){
        char characterToUpperCase = Character.toUpperCase(a);
        boolean flag = false;
        for (int i = 0; i < VOWELSEQUENCE.length; i++){
            if (VOWELSEQUENCE[i] == characterToUpperCase){
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        return flag;
    }

}
