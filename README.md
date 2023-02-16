# Teste Aplicação Spring Boot em Jetty Server

Para executar a aplicação, basta seguir os seguintes passos:

- Na raiz do projeto, executar o comando `gradle clean build` para gerar o arquivo `.war`.
- Ainda na raiz, executar o build do container com o comando `docker build -t spring-boot-metrics-war .`
- Em seguida, executar o container com o comando `docker run -p 8080:8080 spring-boot-metrics-war`
- Para testar a aplicação em si e as métricas:
  - `curl localhost:8080/hello` para bater no endpoint de teste da aplicação
  - `curl localhost:8080/actuator/prometheus` para visualizar as métricas do Prometheus. Nessa segunda chamada, será possível visualizar as métricas da requisição anterior.

```shell
# HELP http_server_requests_seconds  
# TYPE http_server_requests_seconds summary
http_server_requests_seconds_count{error="none",exception="none",method="GET",outcome="SUCCESS",status="200",uri="/hello",} 1.0
http_server_requests_seconds_sum{error="none",exception="none",method="GET",outcome="SUCCESS",status="200",uri="/hello",} 0.037517303
# HELP http_server_requests_seconds_max  
# TYPE http_server_requests_seconds_max gauge
http_server_requests_seconds_max{error="none",exception="none",method="GET",outcome="SUCCESS",status="200",uri="/hello",} 0.037517303
```