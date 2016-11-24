<!--<div class="row">
    <p>
<?php
$tcis = getListOfTcis(0, 0)['viewTcis'];

$tci = $tcis["viewTcis"][0];

var_dump($tci);
?>
    </p>
</div>-->
<div class="row">
    <div class="col-lg-12">
        <div class="col-lg-12"><h1>Minutas</h1></div>
        <table class="table table-bordered table-striped force-width">
            <tr class="thead-inverse">
                <th class="bg-color1"></th>
                <th class="">Código de classificação</th>
                <th class="">Tipo de documento</th>
                <th class="">Data de produção</th>
                <th class="">Status</th>
                <th class="">Classificado por</th>
                <th class="">Prazo</th>
            </tr>

            <?php
            foreach ($tcis as $a => $content) {
                if ($content['status'] == 'minuta') {
                    echo "<tr>";

                    $id = $content['tciid'];
                    $cidic = $content['cidic'];
                    $tipo = $content['tipo_documento'];
                    $data_producao = date("d/m/Y", strtotime($content['data_producao']));
                    $status = $content['status'];

                    echo "<td class = 'table-active'></td>";
                    echo "<td class=''><a href='?pg=tci&id=$id'>$cidic</a></td>";
                    echo "<td class=''>$tipo</td>";
                    echo "<td class=''>$data_producao</td>";
                    echo "<td class=''>$status</td>";
                    echo "<td class=''>João da Silva</td>";
                    echo "<td class=''>21/06/2021</td>";

                    echo "</tr>";
                }
            }
            ?>
        </table>
    </div>
</div>
<br/>
<div class="row">
    <div class="col-lg-12">
        <div class="col-lg-12"><h1>Documentos</h1></div>
        <table class="table table-bordered table-striped">
            <tr class="thead-inverse">
                <th class="bg-color1"></th>
                <th class="">Código de classificação</th>
                <th class="">Tipo de documento</th>
                <th class="">Data de classificação</th>
                <th class="">Status</th>
                <th class="">Classificado por</th>
                <th class="">Prazo</th>
            </tr>

            <?php
            foreach ($tcis as $a => $content) {

                if ($content['status'] != 'minuta') {
                    echo "<tr>";

                    $id = $content['tciid'];
                    $cidic = $content['cidic'];
                    $tipo = $content['tipo_documento'];
                    $data_producao = date("d/m/Y", strtotime($content['data_producao']));
                    $status = $content['status'];

                    $classApply = escolheClasse($status);

                    echo "<td class = 'table-active " . $classApply . "'></td>";
                    echo "<td class=''><a href='?pg=tci&id=$id'>$cidic</a></td>";
                    echo "<td class=''>$tipo</td>";
                    echo "<td class=''>$data_producao</td>";
                    echo "<td class=''>$status</td>";
                    echo "<td class=''>João da Silva</td>";
                    echo "<td class=''>21/06/2021</td>";
                    
                    echo "</tr>";
                }
            }
            ?>

        </table>
    </div>

</div>