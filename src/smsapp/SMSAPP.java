package smsapp;

import com.teknikindustries.bulksms.SMS;

/**
 *
 * @author collo
 */
public class SMSAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //http://developer.bulksms.com/eapi/code-samples/
        SMS smsTut = new SMS();
        smsTut.SendSMS("username", "Password", "Message body", "Recipient Number", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
    }
    
}
