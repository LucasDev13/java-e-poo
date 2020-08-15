package br.com.poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.poo.entities.Comment;
import br.com.poo.entities.Post;

public class MainPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Date moment = new Date();
		
		Comment comment1 = new Comment("Hive a nice trip!");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post(sdf.parse("31/07/2020 13:00:00"), "Travaling NewZealand", "I'm going visit this wonderful country", 12);//passando os dados por parametro para o contrutor da classe Post
		
		post1.addPost(comment1);
		post1.addPost(comment2);
		
		
//		System.out.println("Informe o numero de comentarios: ");
//		int n = sc.nextInt();
		
				
		System.out.println(post1);

	}

}
