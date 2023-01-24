package TOTP;

import com.codeborne.selenide.Configuration;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import de.taimos.totp.TOTP;
import org.junit.jupiter.api.Test;

public class TOTPExample {

    //Documentation: https://oril.co/blog/two-factor-authentication-with-java-and-google-authenticator/
    private final String secret = "GRLFYOVANNQFNT7JHBG7AV4KTG2L5IVL";

    public static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        return TOTP.getOTP(hexKey);
    }

    @Test
    public void testTotp() {
        System.out.println(getTOTPCode(secret));
    }


    @Test
    public void totpLoginExample() {
        Configuration.holdBrowserOpen = true;
        var eportalPage = new EportalPage();
        eportalPage.gotTo();

        var eiamPage = eportalPage.startLogin();
        eiamPage.loginTotp(Credentials.EMAIL.getValue(), Credentials.PASSWORD.getValue(), Credentials.SECRET.getValue());
    }


}
