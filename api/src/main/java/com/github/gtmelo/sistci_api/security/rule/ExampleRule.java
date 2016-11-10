package com.github.gtmelo.sistci_api.security.rule;

import com.github.gtmelo.sistci_api.security.exception.SecurityException;

/**
 * Exemplo de classe para regras de segurança
 * Created by 02364114110 on 10/11/2016.
 */
public class ExampleRule implements ISecurityRule {

    private String authtoken;
    private boolean resultado;

    /**
     * Metodo principal da classe.
     *
     * @param dados Os dados da requisição
     * @throws SecurityException Quando o token de autenticação e inválido
     */
    public void validate(String dados) throws SecurityException {

        this.handleDados(dados);

        //TODO trocar condição para um teste real
        if (authtoken.equals("123456")) {
            resultado = true;
        } else {
            resultado = false;
            throw new SecurityException(this.getClass().getSimpleName(), "Token de autenticação inválido");
        }
    }

    /**
     * Recebe os dados e extrai para um formato desejado pela classe.
     *
     * @param dados Os dados da requisição
     * @throws SecurityException Quando ocorre uma falha na leitura para obter o authtoken
     */
    public void handleDados(String dados) throws SecurityException {
        if (true) {
            this.authtoken = dados;
        } else {
            throw new SecurityException(this.getClass().getSimpleName(), "Falha na leitura dos dados");
        }

    }
}
