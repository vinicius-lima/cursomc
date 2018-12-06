package com.lima.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.lima.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
