package com.zty;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot11TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Test
    void contextLoads() {

        //一个简单的邮件发送
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("邮件任务测试！");
        simpleMailMessage.setText("zty!!!!!!!");
        simpleMailMessage.setTo("2559247260@qq.com");
        simpleMailMessage.setFrom("2559247260@qq.com");
        javaMailSender.send(simpleMailMessage);
    }
    @Test
    void contextLoads2() throws MessagingException {

        //一个复杂的邮件发送
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
         //组装~
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setSubject("复杂邮件测试！");
        helper.setText("<p style='color:red'>zty!!!!!!</p>",true);
        //附件
        helper.addAttachment("1.jpg",new File("C:\\Users\\86134\\Pictures\\Camera Roll\\2.jpg"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\86134\\Pictures\\Camera Roll\\2.jpg"));

        helper.setTo("2559247260@qq.com");
        helper.setFrom("2559247260@qq.com");
        javaMailSender.send(mimeMessage);
    }
    /** @Author zty
     * @Description //TODO 
     * @Date 20:11 2021/8/6
     * @Param [html, subject, text]
     * @return void
     **/
    public void sendMail(boolean html,String subject,String text) throws MessagingException {

        //一个复杂的邮件发送
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
         //组装~
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,html);
        helper.setSubject(subject);
        helper.setText(text,true);
        //附件
        helper.addAttachment("1.jpg",new File("C:\\Users\\86134\\Pictures\\Camera Roll\\2.jpg"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\86134\\Pictures\\Camera Roll\\2.jpg"));

        helper.setTo("2559247260@qq.com");
        helper.setFrom("2559247260@qq.com");
        javaMailSender.send(mimeMessage);
    }

}
