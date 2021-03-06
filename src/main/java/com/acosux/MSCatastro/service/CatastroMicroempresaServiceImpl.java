/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCatastro.service;

import com.acosux.MSCatastro.dao.CatastroMicroempresaDao;
import com.acosux.MSCatastro.util.AnxCatastroMicroempresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Trabajo
 */
@Service
public class CatastroMicroempresaServiceImpl implements CatastroMicroempresaService {

    @Autowired
    private CatastroMicroempresaDao catastroMicroempresaDao;

    @Override
    public boolean existeCatastroMicroEmpresa(String identificacion) throws Exception {
        return catastroMicroempresaDao.existeCatastroMicroEmpresa(identificacion);
    }

    @Override
    public String insertarListadoCatastroMicroempresa(List<AnxCatastroMicroempresa> listado, boolean permitirBorrar) throws Exception {
        String retorno = "";
        if (catastroMicroempresaDao.insertarListadoCatastroMicroempresa(listado, permitirBorrar)) {
            retorno = "Listado Ingresado Correctamente";
        } else {
            retorno = "Error al guardar los registros, Intente de nuevo";
        }
        return retorno;
    }

}
