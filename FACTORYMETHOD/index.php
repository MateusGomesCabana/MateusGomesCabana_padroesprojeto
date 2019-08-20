<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            require_once 'CriaAnimal.php';
            require_once 'Animal.php';
            require_once 'Cachorro.php';
            echo 'START TESTING FACTORY METHOD PATTERN';
            $factoryMethodInstance = new CriaAnimal;
            $cachorro = $factoryMethodInstance->makeAnimal("Cachorro");
            echo 'O nome do cachorro é ' .$cachorro->getNome();
            
        // put your code here
        ?>
    </body>
</html>
