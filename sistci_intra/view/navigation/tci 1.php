<?php
if (!isset($_GET['id']) || !$_GET['pg'] == NAN) {
    $tci = getPhony();
} else {
    $tci = getTci($_GET['id']);
}

$tciState = $tci['status'];

if(isset($_GET['action'])){
    $action = filter_var($_GET['action']);
} else {
    $action = 'none';
}

?>

<script type="text/javascript">

    var tciState = "<?php echo ".estado_$tciState"; ?>";

    $(document).ready(function () {
        $(tciState).fadeIn(400);
        $("#btn_editar").click(function () {
            $(".tci_form").fadeToggle(400);
            $(".tci_view").fadeToggle(400);

            if ($('#form_action').val() == 'none')
            {
                $("#form_action").val('edit');
//                $("#teste").html($('#form_action').val());
            } else if ($('#form_action').val() == 'edit')
            {
                $("#form_action").val('none');
//                $("#teste").html($('#form_action').val());
            }
        });
    });


</script>

<p id="teste"></p>

<div class="row">

    <form class="form">
        <h1><?php echo $tci['tipo_documento'] ?> <input class="form-control tci_form" type="text" placeholder="Digite o tipo e número do documento" id="tipo_documento"></h1>
        <hr>
        <div class="row">
            <div id="form_edit" class="col-md-6 h-border">

                <input type="hidden" id="form_action" name="form_action" value="none">

                <h3>Órgão/Entidade:</h3>
                <fieldset>
                    <p><?php echo $tci['orgao_nome'] ?></p>
                </fieldset>
                <fieldset>
                    <h3>Código de Indexação:</h3>
                    <p><?php echo $tci['cidic'] ?></p>
                </fieldset>
                <fieldset>
                    <h3>Grau de Sigilo:</h3>
                    <p class="tci_view"><?php echo strtoupper($tci['sigilo_descricao']) ?></p>
                    <select class="custom-select tci_form">
                        <option selected>Selecione o grau de sigilo</option>
                        <option value="1">Reservado</option>
                        <option value="2">Secreto</option>
                        <option value="3">Ultrassecreto</option>
                    </select>
                </fieldset>

                <fieldset>
                    <h3>Categoria</h3>
                    <p class="tci_view"><?php echo $tci['categoria_codigo'] . " - " . $tci['categoria_descricao'] ?></p>
                    <select class="custom-select tci_form">
                        <option selected>Selecione a categoria</option>
                        <option value="1">06 - Economia e Finanças</option>
                        <option value="2">07 - Educação</option>
                    </select>
                </fieldset>

                <fieldset>
                    <h3>Data de produção</h3>
                    <p class="tci_view"><?php echo date("d/m/Y", strtotime($tci['data_producao'])) ?></p>
                    <input class="form-control tci_form" type="date"id="data_producao">
                </fieldset>

                <fieldset>
                    <h3>Fundamento legal para classificação</h3>
                    <p class="tci_view"><?php echo $tci['fundamento_legal_descricao'] ?><br></p>
                    <select class="custom-select tci_form">
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
                    <p class="tci_view"><?php echo $tci['razao_classificacao'] ?></p>
                    <textarea class="form-control tci_form" id="razoes_classificacao" rows="4"></textarea>
                </fieldset>

                <fieldset>
                    <h3>Prazo da Restrição de Acesso</h3>
                    <p class="tci_view">
                        <?php echo $tci['prazo_data'] . ", ou " . $tci['prazo_evento'] ?>
                    </p>
                    <input class="form-control tci_form" type="date" id="prazo_data">
                </fieldset>
                <br>
                <fieldset>
                    <center>
                        <button class="btn btn-primary tci_form" type="submit">Enviar</button>

                    </center>
                </fieldset>
            </div>

    </form>
    <div class="col-md-6 h-border tci_state" id="dados_documento">
        <div class="card text-xs-center">
            <div class="card-block">
                <h3 class="card-title">
                    Estado atual: <?php echo strtoupper($tci['status']) ?>
                </h3>
                <fieldset class="estado_minuta">
                    <button class="btn btn-primary" id="btn_classificar" type="submit">Classificar</button>
                    <a href="#" class="btn btn-warning" id="btn_editar">Editar</a>
                    <button class="btn btn-danger" id="btn_exluir" type="submit">Apagar</button>
                </fieldset>
                <fieldset class="estado_classificado padded-top-sml">
                    <button class="btn btn-secondary" type="submit">Prorrogar</button>
                    <button class="btn btn-secondary" type="submit">Reduzir prazo</button>
                    <button class="btn btn-secondary" type="submit">Reclassificar</button>
                    <button class="btn btn-danger" type="submit">Desclassificar</button>
                </fieldset>
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
                <dd class="col-md-7">asdf asdf</dd>
                </p>
            </div>
            <div class="card-block">
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
