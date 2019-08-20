<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of DataBase
 *
 * @author Mateus
 */
class DataBase {

    var $host;
    var $user;
    var $passrord;

    function setHost($host) {
        $this->host = $host;
    }

    function setUser($user) {
        $this->user = $user;
    }

    function setPassrord($passrord) {
        $this->passrord = $passrord;
    }
    function getHost() {
        return $this->host;
    }

    function getUser() {
        print_r($this->user);
        return $this->user;
    }

    function getPassrord() {
        return $this->passrord;
    }


}
