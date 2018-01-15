Criando um sistema web com google doc viewer autenticado com Oauth 2.
===

Introdução
---
Vamos criar um projeto que com autenticação. Que o token seja expirado e renovado a cada 1 minuto.
Teremos no banco H2, uma tabela de usuários e uma de arquivos de usuário.
Os arquivos deverão ser acessados apenas pelo usuário logado atravéz de um token.

Criando o projeto
---
O projeto foi criado atravéz do [spring boot initializer]:https://start.spring.io/.
Utilizamos as seguintes dependências:
* web, jpa, h2, security e Cloud Oauth 2.

***Ferramentas.*** Vamos utilizar o [Intellij CE]:https://www.jetbrains.com/idea/download/index.html#section=linux e o [Maven]:http://maven.apache.org/index.html. No frontend, [Angular 5]:https://angular.io/ com Typescript e [VSCode]:https://code.visualstudio.com/Download


