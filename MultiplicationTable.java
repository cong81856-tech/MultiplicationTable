public class MultiplicationTable {
    public static void main(String[] args) {
        String studentId = "G411312117";
        System.out.println("學號:" + studentId);
        System.out.println("=====================================================================================================================================");
        for (int a = 1; a<= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf(" %d x %d = %-2d ", a, b, a * b);
            }
            System.out.println();
        }
    }
    
}

