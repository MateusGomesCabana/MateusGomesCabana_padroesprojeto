<?php

/**
 * Description of Singleton
 *
 * @author Mateus
 */
class SingletonDB {
    private static $instance;
    
       /**
     * Disable instantiation.
     */
    private function __construct(){
        // Private to disabled instantiation.
    }
    /**
     * 03/08/2019
     * Mateus Cabana
     * Retorna a instacia do metodo singleton
     * @return type
     */
    static function getInstance() {
        if (is_null(static::$instance)) {
            require_once 'DataBase.php';
            static::$instance = new Database;
            static::$instance->setHost('127.0.0.1');
            static::$instance->setUser('Mateus');
            static::$instance->setPassrord('1234');
        }

        return self::$instance;
    }
    
}
