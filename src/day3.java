void main() {
    int[] arr = {50, 32, 44, 89, 32};
    System.out.println("pass mark: ");
    for (int i = 0; i <= 4; i++) {
        int val = arr[i];
        if (val > 50) {
            System.out.print(val+" ");
        }

    }
    System.out.print("\n fail mark: ");
    for (int i = 0; i <= 4; i++) {
        int val = arr[i];


        if (val < 50) {
            System.out.print(val+" ");
        }
    }
}