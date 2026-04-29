public class bai1nguyenam {
    public static void main(String[] args) {
        String s = "Cybersoft";
        int len = s.length();
        System.out.println("Chuỗi: " + s);

        String result = "";

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {

                result = result + c; // Thì mới cộng vào kết quả
            }
        }

        System.out.println("Chuỗi sau khi xóa nguyên âm: " + result);
    }
}