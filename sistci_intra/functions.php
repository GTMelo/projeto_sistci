<?php

function escolhePagina($seletor) {

    switch ($seletor) {

        case "lista":
            include_once './view/navigation/lista_tci.php';
            break;
        case "tci":
            include_once './view/navigation/tci.php';
            break;
        case "login":
            include_once './view/navigation/login.php';
            break;
        case "novo":
            include_once './view/navigation/novo_tci.php';
            break;
        default:
            include_once './view/navigation/login.php';
            break;
    }
}

function escolheClasse($status){
    
    switch ($status){
        case "classificado":
            return "tci-cls";
            break;
        case "desclassificado":
            return 'tci-dcls';
            break;
        case "prazo_reduzido":
            return 'tci-prrdz';
            break;
        case "reclassificado":
            return 'tci-rcls';
            break;
        case "prorrogado":
            return 'tci-prgd';
            break;
        default :
            return "";
    }
    
}

?>
