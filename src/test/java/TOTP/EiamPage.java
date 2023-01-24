package TOTP;

import com.codeborne.selenide.SelenideElement;
import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class EiamPage {

    public EiamPage() {}

    //<!--  email>
    private SelenideElement emailInput() {return $(byId("isiwebuserid"));}
    private void setEmail(String email) {
        emailInput().should(appear).sendKeys(email);
    }

    //<!--  password>
    private SelenideElement passwordInput() {return $(byId("isiwebpasswd"));}
    private void setPassword(String password) {
        passwordInput().should(appear).sendKeys(password);
    }

    //<!--  2FA>
    //either mTan or totp can be used
    private SelenideElement totpInput() { return $(byId("code2FA"));}
    private void setTotpInput(String secret) {
        totpInput().should(appear).sendKeys(getTOTPCode(secret));
    }
    private SelenideElement mTanInput() {return $(byId("tanresponse"));}
    private void setTanResponse(String response) {
        mTanInput().should(appear).sendKeys(response);
    }

    //<!--  Navigation>
    private SelenideElement continueButton() {return $(byName("continueBtn"));}
    private SelenideElement loginButton() {return $(byId("loginBtn"));}
    private SelenideElement submitButton() {return $(byName("continueWithCaptcha"));}


    public void loginTotp(String email, String password, String totpCode) {
        setEmail(email);
        continueButton().click();
        setPassword(password);

        loginButton().click();
        setTotpInput(totpCode);

        submitButton().click();
    }


    //<!--  TOTPAlgorithm>
    public static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        return TOTP.getOTP(hexKey);
    }
}
