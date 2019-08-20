<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Peixe
 *
 * @author Mateus
 */
require_once 'Animal.php';
class Peixe extends Animal {

    private $nome;
    private $raca;

    function __construct() {
        $this->nome = 'Nemo';
        $this->raca = 'palhaco';
    }

    public function getNome() {
        return $this->nome;
    }

    public function getRaca() {
        return $this->raca;
    }

}
