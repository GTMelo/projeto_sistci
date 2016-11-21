<div class="row">

    <div class="row">
        <h1 id='titulo_pagina'>Criar novo TCI</h1>
        <hr>
    </div>

    <div class="row bg-color1 padded-md border-radius">
        <form class="form tci-form" method="post" action="../../control/requisicao.php">
            <input type="hidden" id="form_action" name="form_action" value="novo">
            <div class="col-md-6" id="tci_content-col1">         
                <div class="form-group">
                    <label for="tipo_documento">Tipo de Documento</label>
                    <input type="text" class="form-control" name="tipo_documento" placeholder="Ex: Relatório de Viagem da reunião do dia 23/08 em Brasília">
                    <small id="tipo_documento_help" class="form-text text-muted">O tipo de documento deve ser uma descrição da espécie, número, ano e órgão de origem do documento.</small>
                </div>

                <div class="form-group">
                    <label for="nup">NUP (Número Único de Protocolo)</label>
                    <input type="text" class="form-control" name="nup" placeholder="Ex: 12120.00001.2016.000.000">
                    <small id="nup_help" class="form-text text-muted">Numero de protocolo do documento gerado pelo Comprot</small>
                </div>
                <div class="form-group">
                    <label for="categoria_codigo">Categoria</label>
                    <select class="form-control" name="categoria_codigo">
                        <option value="6">06 - Economia e Finanças</option>
                        <option value="12">12 - Meio Ambiente</option>
                    </select>
                    <small id="nup_help" class="form-text text-muted">Numero de protocolo do documento gerado pelo Comprot</small>
                </div>
                <fieldset id='prazo' class="">
                    <legend>Prazo de restrição de acesso</legend>
                    <div class="form-group">
                        <label for="prazo_data">Prazo - Data</label>
                        <input type="date" class="form-control datepicker" name="prazo_data" placeholder="placeholder">
                        <small id="prazo_data_help" class="form-text text-muted">Prazo de restrição de acesso. Após esta data, o documento será desclassificado.</small>
                    </div>
                    <div class="form-group">
                        <label for="prazo_evento">Prazo - Evento</label>
                        <textarea class="form-control" name="prazo_evento" rows="3" placeholder="Fim das negociações do Acordo ..."></textarea>
                        <small id="prazo_evento_help" class="form-text text-muted">Evento que determina a necessidade de classificação do documento. O TCI será classificado enquanto este evento perdurar (Ex: término do mandato de uma autoridade), ou o prazo máximo determinado pelo grau de sigilo, o que vier primeiro.</small>
                    </div>
                </fieldset>

            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="grau_sigilo">Grau de Sigilo</label>
                    <select class="form-control" name="grau_sigilo">
                        <option value="1">Reservado</option>
                        <option value="2">Secreto</option>
                        <option value="3">Ultrassecreto</option>
                    </select>
                    <small id='descricao_fundamento_legal'>Grau X: prazo máximo de restrição: X anos, não necessita de autoridade ratificadora</small>
                    <small id="fundamento_legal" class="form-text text-muted">Grau de sigilo do TCI.</small>
                </div>
                <div class="form-group">
                    <label for="fundamento_legal_descricao">Fundamento Legal para Classificação</label>
                    <select class="form-control" name="categoria_codigo">
                        <option value="1">Lei nº 12.527/2011, Artigo 23, Inciso I</option>
                        <option value="2">Lei nº 12.527/2011, Artigo 23, Inciso II</option>
                        <option value="3">Lei nº 12.527/2011, Artigo 23, Inciso III</option>
                        <option value="4">Lei nº 12.527/2011, Artigo 23, Inciso IV</option>
                        <option value="5">Lei nº 12.527/2011, Artigo 23, Inciso V</option>
                        <option value="6">Lei nº 12.527/2011, Artigo 23, Inciso VI</option>
                        <option value="7">Lei nº 12.527/2011, Artigo 23, Inciso VII</option>
                        <option value="8">Lei nº 12.527/2011, Artigo 23, Inciso VIII</option>
                    </select>
                    <small id="fundamento_legal" class="form-text text-muted">Fundamento legal que justifica a decisão de classificar.</small>
                </div>
                <div class="form-group">
                    <label for="data_producao">Data de Produção do Documento</label>
                    <input type="date" class="form-control datepicker" name="data_producao" placeholder="01/01/2016">
                    <small id="data_producao_help" class="form-text text-muted">Data na qual o documento que está sendo classificado foi criado. Não confundir com a data de classificação, ou a data de emissão deste TCI.</small>
                </div>
                <div class="form-group">
                    <label for="razao_classificacao">Razão para Classificação</label>
                    <textarea class="form-control" name="razao_classificacao" rows="3" placeholder="Ex: Pode afetar as negociações ..."></textarea>
                    <small id="razao_classificacao_help" class="form-text text-muted">Breve explicação sobre o que pode ser afetado negativamente pela divulgação antecipada do documento</small>
                </div>
                <div class="form-group">
                    <label for="cidic">CIDIC</label>
                    <input type="hidden" class="form-control" name="cidic" value="none">
                    <p id="cidic" class="form-control-static text-primary"></p>
                    <small id="cidic_help" class="form-text text-muted">O CIDIC do documento é gerado automaticamente.</small>
                </div>


            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <center>
                            <button type='submit' class="btn btn-primary">Cadastrar nova minuta de TCI</button>
                        </center>
                    </div>
                </div>

            </div>
        </form>
    </div>
</div>

<script type="text/javascript">

    Date.prototype.toDateInputValue = (function () {
        var local = new Date(this);
        local.setMinutes(this.getMinutes() - this.getTimezoneOffset());
        return local.toJSON().slice(0, 10);
    });

    $(document).ready(function () {
        $.noConflict();

        $(".datepicker").val(new Date().toDateInputValue());
        
        $("#tci-form").show();

        $('.form-control').change(function () {
            var nup = $("input[name='nup']").val();
            var cat_cod = $("select[name='categoria_codigo'").val();
            var prazod = $("input[name='prazo_data']").val();
            var cidic = nup + "." + cat_cod + "." + prazod.toString() + "...";
            $("input[name='cidic']").val(cidic);
            $("#cidic").fadeTo(1,0);
            $("#cidic").delay(10).html(cidic);
            $("#cidic").delay(50).fadeTo(100,1);
        });

    });



</script>