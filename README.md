# Projeto de Autenticação com Spring Security

Este repositório contém um projeto de exemplo que demonstra a implementação de autenticação em uma aplicação Spring Boot usando o Spring Security. O projeto tem duas branches principais: `basic-auth` e `okta-oauth2`, cada uma representando uma abordagem diferente de autenticação.

## Branch `basic-auth`

A branch `basic-auth` ilustra a autenticação básica usando o Spring Security. Nesta abordagem, os usuários são autenticados com base em credenciais (geralmente nome de usuário e senha) e têm acesso a recursos protegidos após a autenticação bem-sucedida. O Spring Security configura regras de autorização para determinar quais usuários têm acesso a quais partes da aplicação.

### Como usar a branch `basic-auth`

Você pode verificar a branch `basic-auth` para explorar a implementação da autenticação básica. Use os seguintes comandos para alternar para a branch e executar a aplicação:

```bash
git checkout basic-auth
```

# Branch okta-oauth2

A branch `okta-oauth2` demonstra a autenticação usando Okta como provedor de identidade e o protocolo OAuth 2.0. Nesta abordagem, os usuários podem fazer login em suas contas do Okta para acessar os recursos da aplicação. O Spring Security é configurado para integrar com o Okta e validar tokens OAuth 2.0.

## Como usar a branch `okta-oauth2`

Para explorar a implementação da autenticação com Okta e OAuth 2.0, você pode verificar a branch `okta-oauth2` e executar a aplicação da seguinte maneira:

```bash
git checkout okta-oauth2
```

## Contribuições

Fique à vontade para contribuir para este projeto, seja adicionando recursos, corrigindo bugs ou aprimorando a segurança da autenticação, assim que feito, pode abrir um pull request que irei analisar o código para uma possível branch ser adicionada com suas alterações. Sua contribuição é bem-vinda!

Espero que esta descrição do `README.md` ajude a explicar a estrutura do projeto com as duas branches, `basic-auth` e `okta-oauth2`, que utilizam o Spring Security para autenticação.
