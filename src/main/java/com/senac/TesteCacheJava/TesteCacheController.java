package com.senac.TesteCacheJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteCacheController {
    TesteCacheService testeCacheService;
    @Autowired
    public TesteCacheController(TesteCacheService testeCacheService){
        this.testeCacheService = testeCacheService;
    }

    @GetMapping("/getCacheValor")
        public String getCacheValor(@RequestParam String valor){
            return testeCacheService.getValor(valor);
        }

    @PostMapping("/limparCache")
        public void clearCache(){
        }
    }

