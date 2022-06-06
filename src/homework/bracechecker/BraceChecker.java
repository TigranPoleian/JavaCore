package homework.bracechecker;

public class BraceChecker {
    //Գրել ծրագիր որը կստուգի տրված տեքստի մեջ փակագծերի դասավորությունը։ Փակագծերի տեսակները 3ն են։ {, [, (
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void chek() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char a;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    a = (char) stack.pop();
                    if (a != '(') {
                        System.out.println("Error: " + i + " opened " + a + " but closed " + c);
                    }
                    break;
                case '}':
                    a = (char) stack.pop();
                    if (a != '{') {
                        System.out.println("Error: " + i + " opened " + a + " but closed " + c);
                    }
                    break;
                case ']':
                    a = (char) stack.pop();
                    if (a != '[') {
                        System.out.println("Error: " + i + " opened " + a + " but closed " + c);
                    }
                    break;
            }
        }
    }
}