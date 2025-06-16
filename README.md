# 💼 Tech4All - Administração Financeira (Back-end)

Este repositório contém o **serviço back-end** da aplicação **Tech4All - Administração Financeira**, responsável por prover uma **API RESTful** para:

- Gerenciamento de **parceiros** e **funcionários**
- Geração de **relatórios financeiros** e **gráficos**
- Integração com o front-end do dashboard
- Documentação interativa via **Swagger**

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Swagger / OpenAPI
- Maven Wrapper (`mvnw`)

---

## 🚀 Como rodar localmente

### Pré-requisitos

- Java (JDK 17 ou superior)
- Maven (ou utilize o Maven Wrapper do projeto)

### Passos

```bash
# Clone o repositório
git clone https://github.com/ymandy1/tech4all-admin.git

# Instale as dependências
./mvnw clean install

# Inicie a aplicação
./mvnw spring-boot:run
