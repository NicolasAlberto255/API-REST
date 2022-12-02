package com.rest.api.services;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.rest.api.models.Correo;
import com.rest.api.models.CorreoAttachment;

@Service
public class CorreoService {
    
    @Autowired
    JavaMailSender mail;

    public void sendEmail(Correo correo)
    {
        SimpleMailMessage textMessage = new SimpleMailMessage();

        textMessage.setFrom("rent.spt.2022@gmail.com");
        textMessage.setTo(correo.getToEmail());
        textMessage.setSubject(correo.getSubject());
        textMessage.setText(correo.getBody());

        mail.send(textMessage);
    }

    public void sendEmailWithAttachment(CorreoAttachment correoAttachment) throws MessagingException
    {
        MimeMessage attachmentMessage = mail.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(attachmentMessage, true);

        helper.setFrom("rent.spt.2022@gmail.com");
        helper.setTo(correoAttachment.getToEmail());
        helper.setSubject(correoAttachment.getSubject());
        helper.setText(correoAttachment.getBody());

        FileSystemResource file = new FileSystemResource(correoAttachment.getAttachment());
        helper.addAttachment(file.getFilename(), file);

        mail.send(attachmentMessage);
    }

}
