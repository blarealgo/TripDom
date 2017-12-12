package edu.itla.tripdom.dao;

import edu.itla.tripdom.entity.Publicacion;

/**
 * Created by blare on 26/11/2017.
 */

public class SqlHelperSchema {
    public static final String USUARIO_TABLE = "CREATE TABLE `usuario` (" +
            "`id`INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
            "`nombre`TEXT NOT NULL," +
            "`email`TEXT NOT NULL," +
            "`telefono`TEXT," +
            "`tipo_usuario`TEXT NOT NULL)";
    public static final String PUBLICACION="CREATE TABLE `publicacion` (" +
            "`id`INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
            "`fecha`TEXT NOT NULL," +
            "`usuario_id`INTEGER NOT NULL," +
            "`desripcion`TEXT NOT NULL," +
            "`costo`REAL NOT NULL," +
            "`estado`TEXT NOT NULL," +
            "`cupo`INTEGER NOT NULL," +
            "`usuario`TEXT NOT NULL," +
            "`origen`TEXT NOT NULL" +
            ");";
    // Crear las restantes entidades.....




}
