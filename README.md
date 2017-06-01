# dac-javase-postgres-docker

## Executando a aplicação: 

1. Gerar a imagem do postgresql! Entrar na pasta dac-exemplo-2-database/ e executar:<br><strong>docker build -t miolivc/postgresql . </strong><br>
2. Gerar a imagem da aplicação! Entrar na pasta dac-exemplo-2/ e executar:<br><strong>docker build -t miolivc/application .</strong><br>
3. Executar a imagem do banco de dados: <br><strong>docker run -p 5432:5432 -d --name database miolivc/postgresql </strong><br>
4. Executar a imagem da aplicação: <br><strong>docker run --name application --link database:host-database miolivc/postgresql </strong><br>
