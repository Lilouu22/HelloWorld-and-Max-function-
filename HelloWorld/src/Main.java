public class Main {
    public static void main(String[] args) {
        int[] arguments = {1, 2, 3, 4, 5};
        System.out.print("Hello, World !");
        System.out.println("Hello, World !"); // see the difference between println and print

        // Function to find the maximum value of a arguments list
        int max = -1;

        for(int i = 0;i<arguments.length;i++) {
            max = Math.max(max, arguments[i] );
        }
        System.out.println("Maximum = " + max);
    }
}

