package com.literalura.config.iConfig;

public interface IConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);
}
