package printing_pattern;


//  *
//  **
//  ***
//  *****
//  ******

public class right_triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
