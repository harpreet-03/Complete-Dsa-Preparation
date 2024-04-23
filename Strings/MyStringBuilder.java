public class MyStringBuilder {

    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
