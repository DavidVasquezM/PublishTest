package com.edesarrollos.PublishTest.db;

import android.content.Context;
import android.util.Base64;
import com.edesarrollos.PublishTest.provider.Manager;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.json.JSONObject;

import java.sql.SQLException;

/**
 * Created by edesarrollos on 28/07/2015.
 */
@DatabaseTable
public class User {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String PASS = "pass";
    public static final String EMAIL = "email";
    public static final String STATUS = "status";
    public static final String ROL = "rol";
    public static final String USER = "user";
    public static final String ACCESS_TOKEN = "accessToken";
    public static final String DEVICE_TOKEN = "deviceToken";


    @DatabaseField(columnName = ID)
    private Integer id = 0;
    @DatabaseField(columnName = NAME)
    private String nombre = "";
    @DatabaseField(columnName = PASS)
    private String pass;
    @DatabaseField(columnName = EMAIL)
    private String correo;
    @DatabaseField(columnName = STATUS)
    private Integer estatus;
    @DatabaseField(columnName = ROL)
    private Integer rol;
    @DatabaseField(columnName = USER)
    private String usuario = "";
    @DatabaseField(columnName = ACCESS_TOKEN)
    private String accessToken = "";
    @DatabaseField(columnName = DEVICE_TOKEN)
    private boolean deviceToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public boolean isDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(boolean deviceToken) {
        this.deviceToken = deviceToken;
    }

    public void setJSON(JSONObject v,Context context) {
        this.id = v.optInt(ID);
        this.nombre = v.optString(NAME);
        this.usuario = v.optString(USER);
        this.correo = v.optString(EMAIL);
        this.rol = v.optInt(ROL);
        this.accessToken = v.optString(ACCESS_TOKEN);
        this.estatus = v.optInt(STATUS);
    }


    /*public static User get(Context context) {
        try {
            if (Manager.get(context).getUser().queryForAll().size() > 0)
                return Manager.get(context).getUser().queryForAll().get(0);
        } catch (SQLException e) {
            return null;
        }
        return null;
    }

    public static void add(Context context, User usuario) {

        try {
            Manager.get(context).getUser().create(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

}
