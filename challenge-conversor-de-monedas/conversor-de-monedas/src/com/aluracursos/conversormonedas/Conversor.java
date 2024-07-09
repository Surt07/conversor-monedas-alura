package com.aluracursos.conversormonedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Divisa convertirDivisa(int seleccionBase, int seleccionPara, double cantidad){

        String divisaEnSiglasBase = obtenerDivisaEnSiglas(seleccionBase);
        String divisaEnSiglasPara = obtenerDivisaEnSiglas(seleccionPara);

        //La API tiene una opcion para convertir de 1 a 1 la moneda, solo hay que indicarle de cual a cual.
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/27e8bbd908ce3c68704c3679/pair/" + divisaEnSiglasBase + "/" + divisaEnSiglasPara+ "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Divisa divisa = new Gson().fromJson(response.body(), Divisa.class);

            return divisa;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se encontró esa divisa actualmente.");
        }
    }

    public static String obtenerDivisaEnSiglas(int divisa){
        //Aquí se asigna la divisa dependiendo la opcion seleccionada
        switch (divisa) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "MXN";
            case 4:
                return "ARS";
            case 5:
                return "BRL";
            case 6:
                return "QTG";
            case 7:
                return "PYG";
            case 8:
                return "PEN";
            case 9:
                return "CLP";
            default:
                throw new IllegalArgumentException("Seleccionado no válida: " + divisa);
        }
    }
}