package com.github.gtmelo.sistci_api;

import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.Serializable;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class SwaggerDocumentSetup extends HttpServlet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);

        BeanConfig beanConfig = new BeanConfig();

        beanConfig.setVersion("1.0.0");
        beanConfig.setTitle("SISTCI, API geral");
        beanConfig.setDescription("API geral de gateway para acesso ao banco de dados de termos de classificação da informação");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080/sistci_api");
        beanConfig.setBasePath("/services");
        beanConfig.setResourcePackage("com.github.gtmelo.sistci_api.services");
        beanConfig.setScan(true);


    }


}
