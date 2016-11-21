<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$allowed_email = "teste@teste.com";
$allowed_pass = "123456";

$login_email = filter_var($_POST['login_email']);
$login_senha = filter_var($_POST['login_senha']);

$testeUser = $login_email == $allowed_email;
$testePass = $login_senha == $allowed_pass;

if($testeUser && $testePass){
    session_start();
    $_SESSION['user'] = $login_email;
    $_SESSION['logged'] = true;
    
    header("Location:/?pg=lista", true);
} else {
    header("Location:/?login=fail", true);
}