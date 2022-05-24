package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        //Պետք է ստեղծել նոր՝ char[] result մասիվ,
        // որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
        // Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝
        // կունենանք cat b i b (մեջտեղի սինվոլները մնալու են)
        char[] resultCar = new char[0];
        char space = ' ';
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != space) {
                for (int j = spaceArray.length - 1; j > i; j--) {
                    if (spaceArray[j] != space) {
                        resultCar = new char[j - i + 1];
                        int index = 0;
                        for ( ;i<=j;i++) {
                            resultCar[index]=spaceArray[i];
                            index++;
                        }
                    }
                }
            }
        }
        for (char c :resultCar){
            System.out.print(c);
        }
    }
}
