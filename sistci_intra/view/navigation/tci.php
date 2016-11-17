<div class="row">

    <h1>${Tipo de documento}</h1>
    <hr>
    <div class="row">
        <form class="form">
            <div class="col-md-6 h-border">
                <fieldset><h3>Órgão/Entidade:</h3>
                    <p>${orgao_nome} - ${organizacao_nome}</p></fieldset>


                <fieldset>
                    <h3>Código de Indexação:</h3>
                    <p>${cidic}</p>
                </fieldset>

                <fieldset>
                    <h3>Grau de Sigilo:</h3>
                    <select class="custom-select">
                        <option selected>Selecione o grau de sigilo</option>
                        <option value="1">Reservado</option>
                        <option value="2">Secreto</option>
                        <option value="3">Ultrassecreto</option>
                    </select>
                </fieldset>

                <fieldset>
                    <h3>Categoria</h3>
                    <select class="custom-select">
                        <option selected>Selecione a categoria</option>
                        <option value="1">06 - Economia e Finanças</option>
                        <option value="2">07 - Educação</option>
                    </select>
                </fieldset>

                <fieldset>
                    <h3>Data de produção</h3>
                    <label for="data_producao">${data_producao}</label>
                    <input class="form-control" type="date"id="data_producao">
                </fieldset>

                <fieldset>
                    <h3>Fundamento legal para classificação</h3>
                    <label for="fundamento_legal">${fundamento_legal}</label><br>
                    <select class="custom-select">
                        <option selected>Selecione o fundamento</option>
                        <option value="1">Inciso I do art. 23 da Lei 12.527/2011</option>
                        <option value="2">Inciso II do art. 23 da Lei 12.527/2011</option>
                        <option value="3">Inciso III do art. 23 da Lei 12.527/2011</option>
                        <option value="4">Inciso IV do art. 23 da Lei 12.527/2011</option>
                        <option value="5">Inciso IV do art. 23 da Lei 12.527/2011</option>
                        <option value="6">Inciso VI do art. 23 da Lei 12.527/2011</option>
                    </select>
                </fieldset>

                <fieldset>
                    <h3>Razões para classificação</h3>
                    <label for="exampleTextarea">${razoes_classificacao}</label>
                    <textarea class="form-control" id="razoes_classificacao" rows="4"></textarea>
                </fieldset>

                <fieldset>
                    <h3>Prazo da Restrição de Acesso</h3>
                    <p>${prazo_data} - ${prazo_evento}</p>
                    <input class="form-control" type="date" id="prazo_data">
                </fieldset>
                <br>
                <fieldset>
                    <center>
                        <button class="btn btn-primary" type="submit">Enviar</button>

                    </center>
                </fieldset>
            </div>

        </form>
        <div class="col-md-6 h-border" id="dados_documento">
            <div class="card text-xs-center">
                <div class="card-block">
                    <h3 class="card-title">
                        Estado atual: MINUTA
                    </h3>
                    <button class="btn btn-danger" type="submit">Apagar</button>
                    <button class="btn btn-warning" type="submit">Editar</button>
                    <button class="btn btn-primary" type="submit">Classificar</button>
                    <button class="btn btn-primary" type="submit">Desclassificar</button>
                    <button class="btn btn-primary" type="submit">Prorrogar</button>
                    <button class="btn btn-primary" type="submit">Reduzir prazo</button>
                    <button class="btn btn-primary" type="submit">Reclassificar</button>
                </div>
            </div>
            <div class="card" id="classificacao_card">
                <div class="card-block">
                    <h4 class="card-title">Classificação</h4>
                    <h6 class="card-subtitle text-muted">Data da classificação: ${data_classificacao}</h6>
                    <p class="card-text">
                    <dt class="col-md-5">Classificado por:</dt>
                    <dd class="col-md-7">${autoridade_classificadora}</dd>
                    </p>
                    <p class="card-text">
                    <dt class="col-md-5">Ratificado por:</dt>
                    <dd class="col-md-7">${autoridade_ratificadora}</dd>
                    </p>
                    <p class="card-text">
                    <dt class="col-md-5">Prazo restrição de acesso:</dt>
                    <dd class="col-md-7">${prazo_data} / ${prazo_evento}</dd>
                    </p>
                    <center>
                        <a href="#" class="card-link btn btn-primary">TCI</a>
                    </center>
                </div>
            </div>
            <div class="card" id="desclassificacao_card">
                <div class="card-block">
                    <h4 class="card-title">Desclassificação</h4>
                    <h6 class="card-subtitle text-muted">Data da desclassificação: ${data_desclassificacao}</h6>
                    <p class="card-text">
                    <dt class="col-md-5">Assinado por:</dt>
                    <dd class="col-md-7">${autoridade_classificadora}</dd>
                    </p>
                    <center>
                        <a href="#" class="card-link btn btn-primary">TCI</a>
                        <a href="#" class="card-link btn btn-success">Documento desclassificado</a>
                    </center>
                </div>
            </div>

        </div>
    </div>
</div>