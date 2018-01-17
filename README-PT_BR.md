# Criando um sistema web com google doc viewer autenticado com Oauth 2

## Introdução

Vamos criar um projeto que com autenticação. Que o token seja expirado e renovado a cada 1 minuto.

Teremos no banco H2, uma tabela de usuários e uma de arquivos de usuário.

Os arquivos deverão ser acessados apenas pelo usuário logado atravéz de um token.

### Ferramentas

Vamos utilizar:
1. O [Intellij CE](#F1);
2. O [Maven](#F2);
3. No frontend, [Angular 5](#F3) com Typescript;
4. O [VSCode](#F4);
5. O [Google Api Console](#F5) para obter uma nova credencial para a app.

## Criando o projeto

O projeto foi criado atravéz do [SpringBoot Initializer](#R1).

Utilizamos as seguintes dependências:

*   web, jpa, h2, security e Cloud Oauth 2.

## O Google Api Console

Vamos criar um novo projeto para oauth no console e pegar as credenciais para usarmos na aplicação.
Você tem que acessar a página do [Google Api Console](#F5) para criar as credenciais.
Eu utilizei as do Google+.
Siga os passos descritos na [página](#R3) e conseguirá baixar um json com os dados das credenciais. Veja em [Google Api Credentials](#F6).
Deve-se ainda informar um domínio para o retorno do Oauth2.


## Referências

1. <span id="R1">Spring Boot and OAuth2</span> - https://spring.io/guides/tutorials/spring-boot-oauth2
2. <span id="R2">Using OAuth 2.0 to Access Google APIs</span> - https://developers.google.com/identity/protocols/OAuth2
2. <span id="R3">OpenID Connect</span> - https://developers.google.com/identity/protocols/OpenIDConnect

## Ferramentas

1. <span id="F1">Intellij CE</span> - https://www.jetbrains.com/idea/download/index.html#section=linux
2. <span id="F2">Maven</span> - http://maven.apache.org/index.html
3. <span id="F3">Angular 5</span> - https://angular.io/
4. <span id="F4">VSCode</span> - https://code.visualstudio.com/Download
5. <span id="F5">Google Api Console</span> - https://console.developers.google.com
6. <span id="F6">Google Api Credentials</span> - https://console.developers.google.com/apis/credential