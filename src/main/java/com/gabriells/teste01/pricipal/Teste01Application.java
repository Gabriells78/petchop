package com.gabriells.teste01.pricipal;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.gabriells.teste01.service.Construtor;
import com.gabriells.teste01.service.ConverteDados;
import com.gabriells.teste01.model.DadosApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Teste01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Teste01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("OLA E MEU PRIMEIRO PROJETO SEM SUPERVISAO");
//		Principal principal = new Principal();
//		principal.exibeEndereco();

		List<Integer> numero = Arrays.asList(1,2,3,4,5,6);
		numero.stream()
				.filter(n -> n%2 ==0)
				.forEach(System.out::println);

		List<String> palavra= Arrays.asList("java","stream","lambda");
		palavra.stream()
				.map(p-> p.toUpperCase())
				.forEach(System.out::println);

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		numeros.stream()
				.filter(n -> n%2 !=0)
				.map(m -> m*2)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		List<String> palavras = Arrays.asList("apple","banana","apple","orange","banana");
		palavras.stream()
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);

        List<List<Integer>> listaDeNumeros = Arrays.asList(
				Arrays.asList(1,2,3,4),
				Arrays.asList(5,6,7,8),
				Arrays.asList(9,10,11,12)
		);
		listaDeNumeros.stream()
				.flatMap(n -> n.stream().filter(m-> m%2 !=0 && m!=2))
				.collect(Collectors.toList())
				.forEach(System.out::println);


	}
}
