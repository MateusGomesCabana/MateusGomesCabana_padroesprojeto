<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Gato
 *
 * @author Mateus
 */
require_once 'Animal.php';
class Gato extends Animal {

    private $nome;
    private $raca;

    function __construct() {
        $this->nome = 'Galfield';
        $this->raca = 'sem raça';
    }

    //put your code here
    public function getNome() {
        return $this->nome;
    }

    public function getRaca() {
        return $this->raca;
    }

}
