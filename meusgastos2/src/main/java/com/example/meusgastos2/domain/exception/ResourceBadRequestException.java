package com.example.meusgastos2.domain.exception;

public class ResourceBadRequestException extends RuntimeException{
    public ResourceBadRequestException(String mensagem){
        super(mensagem);
    }
    
}
