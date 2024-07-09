![Conversor de Monedas(1)](https://github.com/Surt07/conversor-monedas-alura/assets/157921060/3c39c321-77a4-400b-a9d8-95b73b6664e0)


# Conversor de Monedas 💵
Challenge de POO de Alura, un conversor de monedas que funciona con ExchangeRateAPI

## Introducción 🚩
Este es uno de los retos de programación del programa ONE en la plataforma Alura Latam, se trata de un conversor de monedas programado en java que funciona mediante una api.
Los pasos para completar este desafío se son:
```
Configuración del Ambiente Java;
Creación del Proyecto;
Consumo de la API;
Análisis de la Respuesta JSON;
Filtro de Monedas;
Exibición de Resultados a los usuarios;
```
## API Exchange Rate 🔗
[ExchangeRateAPI](https://www.exchangerate-api.com/) brinda en tiempo real el valor actual de cada moneda, la misma puede mostrar la conversion ya hecha de 1 a 1, 
En mi caso usaré 7 divisas de latam junto al USD y el EUR:
```
US - Dolar estadounidense - USD
UE - Euro - EUR
México - Peso Mexicano - MXN
Argentina - Peso Argentino - ARS
Brasil - Real Brasileño - BRL
Guatemala - Quetzal - GTQ
Paraguay - Guaraní Paraguayo - PYG
Peru - Sol Peruano - PEN
Chile - Peso Chileno - CLP
```

## Requisitos 📝
El programa está hecho en java y tambien requiere conexión a internet para conectarse con la api y usar la librería Gson.

## Como usar 📠

Una vez ejecutada la clase principal del programa, seleccionamos la moneda base, despues la moneda a la que se convertira.
![Screenshot 2024-07-08 185600](https://github.com/Surt07/conversor-monedas-alura/assets/157921060/07f670c2-432b-4e1f-a22a-2591d63d9239)

Después introducimos la cantidad de la moneda base y el programa nos devolverá el resultado. Si desamos hacer otra conversión simplemente escribimos S
(el programa distingue entre si es mayuscula o minuscula), el programa terminará si escribimos cualquier otra cosa.
![Screenshot 2024-07-08 185635](https://github.com/Surt07/conversor-monedas-alura/assets/157921060/61b39db6-ad3c-41a9-8c82-98828b039452)


## Autor (｡･∀･)ﾉﾞ
 Diego González Chávez, alumno Back End G6 de alura
