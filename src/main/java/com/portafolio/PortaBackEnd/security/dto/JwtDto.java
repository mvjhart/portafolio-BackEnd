package com.portafolio.PortaBackEnd.security.dto;


public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;

    public JwtDto(String token, String nombreUsuario) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }    
}
