<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//{ modelo de json para montar para criar e editar
//  "id": 0,
//  "data_producao": "2016-11-21T02:13:42.859Z",
//  "tipo_documento": "string",
//  "razao_classificacao": "string",
//  "nup": "string",
//  "cidic": "string",
//  "orgao": 0,
//  "categoria": 0,
//  "prazo": 0,
//  "fundamentoLegal": 0,
//  "grauSigilo": 0,
//  "status": 0
//}

if(isset($_POST)){
    var_dump($_POST);
    
    if($_POST['form_action'] == 'novo'){
        postTci();
    }
    if($_POST['form_action'] == 'edit'){
        putTci();
    }
    
}

function postTci(){
    
}

function putTci(){
    
}

function getListOfTcis($offset, $limit){
    
    $url = "http://192.168.0.98:8080/sistci_api/services/v1/tci?offset=" .$offset. "&limit=" . $limit;
    
    $ch = curl_init();
    
    curl_setopt_array($ch, array(
        CURLOPT_RETURNTRANSFER => 1,
        CURLOPT_URL => $url
    ));
    
    $data = curl_exec($ch);
    
    curl_close($ch);
    
    $return = json_decode($data, true);
    
    return $return;
    
}

function getTci($id){
    $url = "http://192.168.0.98:8080/sistci_api/services/v1/tci/$id";
    
    $ch = curl_init();
    
    curl_setopt_array($ch, array(
        CURLOPT_RETURNTRANSFER => 1,
        CURLOPT_URL => $url
    ));
    
    $data = curl_exec($ch);
    
    curl_close($ch);
    
    $return = json_decode($data, true);
    
    return $return;
}

function getPhony(){
    $phony = '{
	"tciid": "",
	"data_producao": "",
	"tipo_documento": "",
	"razao_classificacao": "",
	"nup": "",
	"cidic": "",
	"orgao_sigla": "",
	"orgao_nome": "",
	"categoria_codigo": "",
	"categoria_descricao": "",
	"prazo_data": "",
	"prazo_evento": "",
	"fundamento_legal_descricao": "",
	"sigilo_descricao": "",
	"status": ""
}';
    
    $phony = json_decode($phony, true);
    
    return $phony;
}
