package homework.arrayutil;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        return (long) minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        return (int) years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return (int) number + 1;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;

        }
        return false;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        }
        return false;
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        if (value == false) {
            return true;
        }
        return false;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;

    }

}

