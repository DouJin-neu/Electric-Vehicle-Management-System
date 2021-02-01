/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Investor;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
/**
 *
 * @author adam
 */
public class SendEmailToInvestor
{
    
 public static void sendEmail (String to){
 
  String host="smtp.gmail.com";  
  
   //Get the session object  
   Properties props = new Properties();
   props.put("mail.smtp.starttls.enable","true");  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");  
   props.put("mail.smtp.port","587");
   final String user="chargingpointboston@gmail.com";//change accordingly  
   final String password="Chargingpoint123";//change accordingly  
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("Congratulations! We have approved your request");  
     message.setText("Dear Investor,\n\nCongratulations!\nYour request has been approved!\nWe are very thankful to your support.Our goal is consistently to "
              + "improve the user experience of charging electric cars.\n \n Thanks, \nChargingPoint Team");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}
 
 }
}  

