package com.prata.agendador_tarefas.infrastructure.exceptions;

public class ResourceNotFoundExeception extends RuntimeException {
    public ResourceNotFoundExeception(String message) {
        super(message);
    }

    public ResourceNotFoundExeception(String mensagem, Throwable throwable){
      super(mensagem, throwable);
    }
}
