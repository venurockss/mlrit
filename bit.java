public class BitManipulationDemo {
    public static void main(String[] args) {
        int number = 29;  // example number in binary: 11101
        int i = 3;        // example bit position
        
        // 1. Check if the number is even or odd
        System.out.println("Is even: " + isEven(number));
        
        // 2. Get the i-th bit
        System.out.println("The " + i + "-th bit is: " + getIthBit(number, i));
        
        // 3. Set the i-th bit
        System.out.println("Setting the " + i + "-th bit: " + setIthBit(number, i));
        
        // 4. Clear the i-th bit
        System.out.println("Clearing the " + i + "-th bit: " + clearIthBit(number, i));
        
        // 5. Toggle the i-th bit
        System.out.println("Toggling the " + i + "-th bit: " + toggleIthBit(number, i));
        
        // 6. Count the number of 1's (Hamming Weight)
        System.out.println("Number of 1's (Hamming Weight): " + countOnes(number));
        
        // 7. Check if the number is a power of 2
        System.out.println("Is power of 2: " + isPowerOfTwo(number));
    }

    static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    static int getIthBit(int number, int i) {
        return (number >> i) & 1;
    }

    static int setIthBit(int number, int i) {
        return number | (1 << i);
    }

    static int clearIthBit(int number, int i) {
        return number & ~(1 << i);
    }

    static int toggleIthBit(int number, int i) {
        return number ^ (1 << i);
    }

    static int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    static boolean isPowerOfTwo(int number) {
        return (number > 0) && (number & (number - 1)) == 0;
    }
}
