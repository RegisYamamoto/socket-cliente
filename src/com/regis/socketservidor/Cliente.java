package com.regis.socketservidor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

	public void cliente() {
		
		try {
			Socket cliente = new Socket("10.31.2.137", 4321);

			PrintWriter socketOut = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			socketOut.println("00026V1178900900819890000001000");
			socketOut.flush();
			
			String resposta = input.readLine();
			System.out.println("Resposta do servidor: " + resposta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}