<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <?php
        include_once './functions.php';
        include_once './jquery.php';
        include_once './control/requisicao.php'
        ?>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css" integrity="sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi" crossorigin="anonymous">
        <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js" integrity="sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK" crossorigin="anonymous"></script>-->

        
        <link rel="stylesheet" type="text/css" href="view/style/css.css"/>
        <title>
            SisTci Intranet
        </title>

    </head>
    <body >
        <?php include "view/include/header.inc";
        ?>
        <div class="container" id="content_container">
            <?php
            if (empty($_GET['pg'])) {
                escolhePagina("login");
            } else {
                escolhePagina(filter_var($_GET['pg']));
            }
            ?>
        </div>

            <?php
             include "view/include/footer.inc"; ?>