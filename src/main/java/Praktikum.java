public class Praktikum {
    public static void main(String[] args) {
        String fullName = "VolodyaKotlyarov ";
        Account account = new Account(fullName);
        boolean nameIsCorrect = account.checkNameToEmboss();
        if (nameIsCorrect) {
            System.out.println("Full name is correct");
        } else {
            System.out.println("Full name isn`t correct");
        }
    }
}
