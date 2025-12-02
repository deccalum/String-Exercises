public class StringExercises {
    public static void main(String[] args) {

    String ex1 = ("Java");
    System.out.println(ex1);
    int ex1Length = ex1.length();
    System.out.println("Length: " + ex1Length);

    System.out.println();

    String ex2 = ("Long example sentence");
    char ex2Char = ex2.charAt(6);
    System.out.println("Character at index 6: " + ex2Char);

    System.out.println();

    String ex3 = ("Even longer example sentence");
    int ex3Char = ex3.indexOf("o");
    System.out.println("Index of first 'o': " + ex3Char);

    System.out.println();

    String ex4 = ("Ok this is not as long!");
    String ex41 =("Ok this is ");
    ex41 = ex41.concat("not as long");
    System.out.println(ex41);

    System.out.println();

    String ex5 = ("CAPS EQUALS SCREAMING");
    ex5 = ex5.toLowerCase();
    System.out.println(ex5);
    String ex51 = ex5.toUpperCase();
    System.out.println(ex51);

    System.out.println();

    String ex6 = ("Java is the worst programming language");
        ex6 = ex6.replace("worst", "best");
        System.out.println(ex6);

    System.out.println();

    String ex7 = ("\tJ\ta\tv\ta\t");
    String ex71 = ex7.trim(); 
    System.out.println("Trimmed: " + ex71);

    System.out.println();

    String ex8 = ("20");
    int ex81 = (20);
    String ex82 = ex8 + ex81;
    System.out.println("String + int concatenation v1: " + ex82);

    String ex83 = (20 + "20");
    System.out.println("Int + String concatenation v2: " + ex83);

    System.out.println();

    String ex9 = ("Oil and Water");
    String[] ex9Parts = ex9.split(" and ");
    System.out.println("First part: " + ex9Parts[0]);
    System.out.println("Second part: " + ex9Parts[1]);

    System.out.println();

    String ex10 = ("Carl,Susie,Fredrick,Bob,Erik");
    String[] ex10Parts = ex10.split(",");
    for (String i : ex10Parts) {
        System.out.println("Name: " + i);
    }

    System.out.println();

    String ex11 = ("ThisShouldBeConverted");
    char[] ex11Chars = ex11.toCharArray();
    for (char c : ex11Chars) {
        System.out.print(c);
    }

    System.out.println();

    char[] ex12 = {'J', 'a', 'v', 'a'};
        for (char c : ex12) {
        System.out.print(c);
        }
}
}