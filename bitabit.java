public class bitabit {
    public static void main(String[] args) {
        int a = 5; // em binário: 0000 0101
        int b = 3; // em binário: 0000 011

        int resultAnd = a & b; // 0000 0001 (1 em decimal)
        int resultOr = a | b; // 0000 0111 (7 em decimal)
        int resultXor = a ^ b; // 0000 01100 (6 em decimal)
        int resultNotA = ~a; // 1111 1010 (-6 em decimal)
    }
}
