package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

/**
 * Interfaz Observer
 */
// metodo que se ejecutará cuando el objeto observado cambie
public interface Observer {
    // metodo que se ejecutará cuando el objeto observado cambie
    void update(Coche arg, Model model);
}
