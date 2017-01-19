/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author Supratik Rulz
 */
import java.util.Properties;
//import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendEmail {

    private String username,password;
    
    public SendEmail(String username,String password,String toemail,String sub,String msg) {
        this.username=username;
        this.password=password;
       Properties prop=new Properties();
       prop.put("mail.smtp.ssl.trust","smtp.gmail.com");
       prop.put("mail.smtp.auth",true);
       prop.put("mail.smtp.starttls.enable",true);
       prop.put("mail.smtp.host","smtp.gmail.com");
       prop.put("mail.smtp.port","587");
       
       Session session=Session.getInstance(prop, new javax.mail.Authenticator(){
           protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
               return new javax.mail.PasswordAuthentication(username, password);
           }
       });        
       
       try{
           InternetAddress toAddress = new InternetAddress(toemail);
           Message message = new MimeMessage(session);
           message.setFrom(new InternetAddress(username));
           message.addRecipient(Message.RecipientType.TO,toAddress);
           message.setSubject(sub);
           message.setText(msg);
           Transport.send(message);
           JOptionPane.showMessageDialog(null, "Message Sent", "Successful!", JOptionPane.INFORMATION_MESSAGE);
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Message Not Sent", "Unsuccessful!", JOptionPane.INFORMATION_MESSAGE);
           System.out.println(e);
       }
    }
    
    
}
