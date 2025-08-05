# API de Clima - Projeto de Estudos

![Java](https://img.shields.io/badge/Java-21-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen.svg)
![Gradle](https://img.shields.io/badge/Gradle-8.x-yellow.svg)
![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)

> Status do Projeto: Em Desenvolvimento :construction:

## 📖 Sobre o Projeto

Esta é uma API REST desenvolvida como parte de um estudo de **Java com Spring Boot**. A aplicação atua como um *wrapper* para a API de clima [OpenWeather](https.openweathermap.org/api), simplificando a consulta de dados climáticos para uma cidade específica.

O objetivo principal deste projeto é aplicar e consolidar conhecimentos em:
- Criação de APIs REST com Spring Web (MVC).
- Consumo de APIs de terceiros de forma elegante com Spring Cloud OpenFeign.
- Estruturação de um projeto Spring Boot em camadas (Controller, Service, Client).
- Gerenciamento de dependências e build com Gradle (Kotlin DSL).
- Boas práticas de desenvolvimento, como o uso de DTOs e gerenciamento de configurações.

## 🛠️ Tecnologias Utilizadas

- **[Java 21](https://www.oracle.com/java/)**: Versão LTS da linguagem.
- **[Spring Boot 3.5.4](https://spring.io/projects/spring-boot)**: Framework principal para a criação da aplicação.
- **[Spring Web](https://docs.spring.io/spring-framework/reference/web/webmvc.html)**: Para a construção dos endpoints REST.
- **[Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)**: Para a criação de clientes HTTP declarativos.
- **[Lombok](https://projectlombok.org/)**: Para reduzir código boilerplate em classes Java.
- **[Gradle (Kotlin DSL)](https://gradle.org/)**: Ferramenta de automação de build.

## 📁 Estrutura de Diretórios

O projeto segue uma estrutura de pacotes baseada em camadas para garantir a separação de responsabilidades e a organização do código.

```
src/main
├── java
│   └── org
│       └── duarte
│           ├── WeatherApiApplication.java   // Classe principal da aplicação
│           ├── client                     // Clientes OpenFeign para APIs externas
│           ├── config                     // Classes de configuração (Ex: Beans)
│           ├── controller                 // Camada de API (Endpoints REST)
│           ├── dto                        // Objetos de Transferência de Dados
│           └── service                    // Camada de regras de negócio
│
└── resources
    └── application.properties           // Arquivo de configuração
```

## 🚀 Começando

Siga as instruções abaixo para executar o projeto em sua máquina local.

### Pré-requisitos

- **Java Development Kit (JDK)** - Versão 21 ou superior.
- **Gradle** - O projeto utiliza o Gradle Wrapper, então uma instalação manual não é estritamente necessária.

### Instalação e Configuração

1.  **Clone o repositório:**
    ```sh
    git clone [https://github.com/](https://github.com/)[SEU-USUARIO]/[NOME-DO-SEU-REPOSITORIO].git
    cd [NOME-DO-SEU-REPOSITORIO]
    ```

2.  **Configure a Chave da API:**
    A aplicação precisa de uma chave da API da OpenWeather para funcionar.
    - Vá até a pasta `src/main/resources/`.
    - Renomeie o arquivo `application.properties.example` para `application.properties`.
    - Abra o arquivo `application.properties` e insira sua chave:

    ```properties
    # OpenWeather API Configuration
    openweather.api.url=[https://api.openweathermap.org/data/2.5](https://api.openweathermap.org/data/2.5)
    openweather.api.key=SUA_CHAVE_API_VAI_AQUI
    ```
    > Você pode obter uma chave gratuita no [site da OpenWeather](https://openweathermap.org).

3.  **Execute a aplicação:**
    Use o Gradle Wrapper para iniciar o servidor.
    ```sh
    # No Windows
    ./gradlew.bat bootRun

    # No Linux ou macOS
    ./gradlew bootRun
    ```
    O servidor será iniciado na porta `8080`.

## 🕹️ Uso da API

A API expõe um endpoint principal para consulta do clima.

### Buscar Clima por Cidade

Retorna os dados climáticos atuais para a cidade especificada.

- **URL:** `/weather/{city}`
- **Método:** `GET`
- **Parâmetro da URL:** `city=[string]` (obrigatório) - O nome da cidade.

#### Exemplo de Requisição (usando cURL):

```sh
curl http://localhost:8080/weather/saocarlos
```

#### Exemplo de Resposta de Sucesso (Status 200 OK):

```json
{
  "coordinates": {
    "lon": -47.8908,
    "lat": -22.0175
  },
  "weather": [
    {
      "id": 804,
      "main": "Clouds",
      "description": "overcast clouds",
      "icon": "04n"
    }
  ],
  "main": {
    "temp": 21.14,
    "feelsLike": 20.28,
    "tempMin": 21.14,
    "tempMax": 21.14,
    "pressure": 1018,
    "humidity": 37
  },
  "wind": {
    "speed": 2.3,
    "deg": 198,
    "gust": 2.66
  },
  "name": "São Carlos",
  "id": 3449319
}
```

## 📜 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por **Rafael Duarte**.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rafael-mendonca-duarte/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rduarte12)