# 👕 API Loja de Roupas

Esta é uma API REST moderna desenvolvida para o gerenciamento de inventário de uma loja de roupas, focada em **integridade de dados** e **regras de negócio robustas**. O projeto utiliza as melhores práticas do ecossistema **Java 21** e **Spring Boot**.

## 🛠 Tecnologias Utilizadas

* **Linguagem:** Java 21 (Long Term Support)
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA
* **Produtividade:** Lombok
* **Banco de Dados:** PostgreSQL / H2

## 🚀 Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/produtos` | Cadastra novo produto com validação de nome e preço. |
| **GET** | `/produtos` | Retorna todos os produtos **ordenados por ID**. |
| **PUT** | `/produtos/{id}` | Atualiza dados com **Proteção de Identidade** (ID imutável). |
| **DELETE** | `/produtos/{id}` | Remove um produto do catálogo pelo seu ID. |

## 🛡 Regras de Negócio Implementadas

1.  **Validação de Preço**: Bloqueio de valores negativos ou zerados.
2.  **Unicidade de Nome**: Impede duplicidade de nomes no inventário.
3.  **Proteção de ID no Update**: O ID da URL sempre prevalece sobre o ID do corpo da requisição.
4.  **Ordenação Nativa**: Listagem otimizada direto pelo banco de dados.

## 🚀 Futuras Implementações (Roadmap)

- [ ] **Spring Security**: Implementar autenticação e autorização via JWT.
- [ ] **Perfis de Acesso**: Diferenciar permissões entre utilizadores comuns e administradores.
- [ ] **Swagger UI**: Adicionar documentação interativa para os endpoints.