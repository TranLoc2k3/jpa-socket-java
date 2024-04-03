package client;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

import entity.Student;

public class Client {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		try (Socket socket = new Socket("H31M44", 7878);

				Scanner sc = new Scanner(System.in);) {

			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

			String message;

			while (true) {
				
				System.out.println("Enter your choice: \n" + "1. List students enrolled in courses by title\n"
						+ "2. List students enrolled in year\n");
				message = sc.nextLine();
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
