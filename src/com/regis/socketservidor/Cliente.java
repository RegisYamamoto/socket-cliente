package com.regis.socketservidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

	public void cliente() {
		
		try {
			Socket cliente = new Socket("10.31.2.137", 2003);

			PrintWriter requisicao = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			requisicao.println("00026V1178900900819890000001000");
			requisicao.flush();
			
			String resposta = input.readLine();
			System.out.println("Resposta do servidor: " + resposta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}