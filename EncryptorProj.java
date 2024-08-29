class Encryptor {
    private final String inputString;
    private final int keyValue;
    public Encryptor(String inputString, int keyValue) {
        this.inputString = inputString;
        this.keyValue = keyValue;
    }
    public String encryptString() {
        StringBuilder encryptedString = new StringBuilder();
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                int base = Character.isLowerCase(ch) ? 'a' : 'A';
                int newCharValue = (Character.toLowerCase(ch) - 'a' + keyValue) % 26;
                char encryptedChar = (char) (base + newCharValue);
                if (Character.isLowerCase(ch)) {
                    encryptedChar = Character.toUpperCase(encryptedChar);
                } else {
                    encryptedChar = Character.toLowerCase(encryptedChar);
                }
                encryptedString.append(encryptedChar);
            } else {
                encryptedString.append(ch);
            }
        }
        return encryptedString.toString();
    }
}
public class EncryptorProj {
    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor("Wipro Tech", 20);
        System.out.println(encryptor.encryptString());
    }
}
