<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of CriaAnimal
 *
 * @author Mateus
 */
require_once 'Cachorro.php';
require_once 'Gato.php';
require_once 'Peixe.php';
class CriaAnimal {

    //put your code here
    public function makeAnimal($type) {
        $animal = NULL;
        switch ($type) {
            case "Cachorro":
                $animal = new Cachorro;
                break;
            case "Gato":
                $animal = new Gato;
                break;
            case "Peixe":
                $animal = new Peixe;
                break;
        }
        return $animal;
    }
}
