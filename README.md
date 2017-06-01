# dac-javase-postgres-docker

## Executando a aplicação: 

1. Gerar a imagem do postgresql -> Entrar na pasta dac-exemplo-2-database/ e executar: 'docker build -t miolivc/postgresql . '
2. Gerar a imagem da aplicação -> Entrar na pasta dac-exemplo-2/ e executar: 'docker build -t miolivc/application . '
3. Executar a imagem do banco de dados: ' docker -p 5432:5432 -d --name database miolivc/postgresql '
4. Executar a imagem da aplicação: ' docker--name application --link database:host-database miolivc/postgresql '
