package com.senac.TesteCacheJava;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TesteCacheService {

    @Cacheable(value = "teste", key = "#valor")
    public String getValor(String valor){
        return "Retorno é: " + valor;
    }
    @CacheEvict(value = "teste", allEntries = true)
    public void limpaCache(){

    }
}
