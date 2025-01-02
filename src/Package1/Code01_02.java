package Package1;

import java.util.Base64;

public class Code01_02 {

    private static final String SECRET_KEY = "my-secret-key";

    public static void main(String[] args) {
        String key = createKey("user123");
        System.out.println("Generated Key: " + key);
    }

    public static String createKey(String username) {
        String header = Base64.getUrlEncoder().withoutPadding().encodeToString("{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes());

        String payload = Base64.getUrlEncoder().withoutPadding().encodeToString(("{\"sub\":\"" + username + "\"}").getBytes());

        return header + "." + payload;
    }

}
