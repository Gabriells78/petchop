package com.gabriells.teste01.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
