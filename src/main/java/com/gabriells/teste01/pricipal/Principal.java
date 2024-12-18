package com.gabriells.teste01.pricipal;

import com.gabriells.teste01.model.DadosApi;
import com.gabriells.teste01.service.Construtor;
import com.gabriells.teste01.service.ConverteDados;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private Construtor construtor = new Construtor();

    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO ="https://viacep.com.br/ws/";

    private final String API_KEY = "/json/";

    public void exibeEndereco(){
        System.out.println("Digite o endereco para busca: ");
        var endereco = leitura.nextLine();
        var json = construtor.ObterDados(ENDERECO + URLEncoder.encode(endereco, StandardCharsets.UTF_8)+ API_KEY);
        DadosApi dados = conversor.obterDados(json, DadosApi.class);
        System.out.println(dados);
    }
}
