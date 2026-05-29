☕ **Café Aroma & Sabor** — *Sistema de Gestão de Almoxarifado*
=================================================================

<div align="center">

[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)]()
[![Apache Maven](https://img.shields.io/badge/Maven-4.0-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)]()
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)]()
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)]()
[![Hibernate](https://img.shields.io/badge/Hibernate-JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)]()
[![Lombok](https://img.shields.io/badge/Lombok-✅-BC4520?style=for-the-badge)]()
[![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)]()
[![Feito com ❤️](https://img.shields.io/badge/Feito_com-❤️-red?style=for-the-badge)]()

<br />

<img src="https://img.icons8.com/fluency/96/coffee-to-go.png" alt="Coffee icon" width="96" />

### *"Transformando a gestão de estoque em uma experiência tão prazerosa quanto tomar um bom café."*

<p align="center">
  <a href="#-sobre-o-projeto">Sobre</a> •
  <a href="#-funcionalidades">Funcionalidades</a> •
  <a href="#-tecnologias">Tecnologias</a> •
  <a href="#-arquitetura">Arquitetura</a> •
  <a href="#-modelo-de-dados">Modelo de Dados</a> •
  <a href="#-como-executar">Como Executar</a> •
  <a href="#-galeria">Galeria</a> •
  <a href="#-autores">Autores</a>
</p>

</div>

---

## ☕ Sobre o Projeto

> Projeto desenvolvido no **SENAI** como sistema de gestão de almoxarifado para a empresa **Café Aroma & Sabor**.

O **Café Aroma & Sabor** é um sistema web completo para gerenciamento de estoque, desenvolvido com **Spring Boot 4.0.2** e **Java 21**. Ele permite o cadastro de produtos, controle de lotes com datas de validade, movimentações de entrada e saída, e um dashboard inteligente que monitora a saúde do estoque em tempo real.

Nossa missão? **Garantir que nenhum grão especial ou café gourmet passe do prazo de validade** — porque café fresco é café de verdade! ☕✨

---

## ✨ Funcionalidades

<div align="center">

### 📊 Dashboard Inteligente
| Indicador | Descrição |
|:--|:--|
| 📦 **Total em Estoque** | Quantidade total de produtos armazenados |
| ⏰ **Vencem em 7 Dias** | Alerta de produtos próximos ao vencimento |
| 🚨 **Estoque Crítico** | Itens abaixo do nível mínimo configurado |
| 💰 **Valor Total** | Valor financeiro total do inventário |
</div>

### 📦 Gestão Completa de Produtos

| Funcionalidade | Detalhes |
|:--|:--|
| ➕ **Cadastro** | Registrar produtos com nome, descrição, categoria, fornecedor, lote |
| 🌍 **Origem** | Rastreabilidade completa (país de origem, fornecedor) |
| 🏷️ **Lotes** | Controle por número de lote com datas de fabricação e validade |
| 📐 **Unidades** | Suporte a kg, g, unidade, caixa e outras medidas |
| ⚠️ **Estoque Mínimo** | Alerta automático quando o estoque atinge o nível crítico |
| 📍 **Localização** | Controle de posição física no almoxarifado |

### 🔄 Movimentação de Estoque

```
ENTRADA ➕  → Adiciona quantidade ao estoque
SAÍDA   ➖  → Remove quantidade do estoque (mínimo 0)
```

- ✅ Registro completo com data, responsável e observações
- ✅ Atualização automática da quantidade em estoque
- ✅ Histórico completo de movimentações por produto

### 🚨 Sistema de Alertas Inteligente

| Status | Cor | Significado |
|:--:|:--:|:--|
| 🔴 **VENCIDO** | Vermelho | Produto expirado — descarte necessário |
| 🟠 **CRÍTICO** | Laranja | Vence em até 7 dias |
| 🟡 **URGENTE** | Amarelo | Vence em até 15 dias |
| 🔵 **ATENÇÃO** | Azul | Vence em até 30 dias |
| 🟢 **OK** | Verde | Produto dentro do prazo |

### 🔍 Busca e Filtros

- 🔎 Busca por nome do produto
- 🏷️ Status visual com badges e cores
- 📋 Tabela com linhas coloridas por status
- 📱 Layout responsivo (funciona no celular!)

---

## 🛠️ Tecnologias

<div align="center">

### Backend
![Java](https://img.shields.io/badge/Java_21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_4.0.2-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Spring Validation](https://img.shields.io/badge/Spring_Validation-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Spring MVC](https://img.shields.io/badge/Spring_MVC-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat-square&logo=hibernate&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-BC4520?style=flat-square&logo=lombok&logoColor=white)

### Frontend
![Thymeleaf](https://img.shields.io/badge/Thymeleaf_3.1-005F0F?style=flat-square&logo=thymeleaf&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black)
![Google Fonts](https://img.shields.io/badge/Google_Fonts-4285F4?style=flat-square&logo=googlefonts&logoColor=white)

### Banco de Dados
![MySQL](https://img.shields.io/badge/MySQL_8.0-4479A1?style=flat-square&logo=mysql&logoColor=white)

### Ferramentas
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)

</div>

---

## 🏗️ Arquitetura

```
                        ┌─────────────────────────────────────┐
                        │        Café Aroma & Sabor           │
                        │   (Spring Boot 4.0.2 / Port 80)     │
                        └──────────────┬──────────────────────┘
                                       │
              ┌────────────────────────┼────────────────────────┐
              │                        │                        │
              ▼                        ▼                        ▼
   ┌──────────────────┐   ┌────────────────────┐   ┌──────────────────┐
   │  HomeController   │   │  ProdutoController │   │MovimentacaoCtrl  │
   │   GET /home       │   │  CRUD /produto/*   │   │  /movimentacao/* │
   └────────┬─────────┘   └─────────┬──────────┘   └────────┬─────────┘
            │                       │                       │
            ▼                       ▼                       ▼
   ┌──────────────────────────────────────────────────────────────┐
   │                      Service Layer                            │
   │               (Regras de negócio + validações)                 │
   └──────────────────────────────────────────────────────────────┘
                                    │
                                    ▼
   ┌──────────────────────────────────────────────────────────────┐
   │                   Repository Layer (JPA)                     │
   │      ProdutoRepository      │     MovimentacaoRepository     │
   └──────────────────────────────┴──────────────────────────────┘
                                    │
                                    ▼
   ┌──────────────────────────────────────────────────────────────┐
   │                    MySQL Database                             │
   │                 cafearomaesabor                               │
   │        ┌──────────────┐    ┌────────────────────┐           │
   │        │   produto     │    │  movimentacao      │           │
   │        │   (tabela)    │◄───│  (tabela)          │           │
   │        └──────────────┘    └────────────────────┘           │
   └──────────────────────────────────────────────────────────────┘
```

### 📁 Estrutura do Projeto

```
CafeAromaESabor/
│
├── 📜 pom.xml                                    # Maven build
├── 📜 README.md                                  # Você está aqui ❤️
│
└── 📂 src/
    ├── 📂 main/
    │   ├── 📂 java/sp/senai/br/cafearomaesabor/
    │   │   ├── 📄 CafeAromaESaborApplication.java  # Main 🚀
    │   │   ├── 📂 controller/                       # MVC Controllers
    │   │   │   ├── 📄 HomeController.java
    │   │   │   ├── 📄 LoginController.java
    │   │   │   ├── 📄 MovimentacaoController.java
    │   │   │   └── 📄 ProdutoController.java
    │   │   ├── 📂 model/                            # JPA Entities
    │   │   │   ├── 📄 Movimentacao.java
    │   │   │   └── 📄 Produto.java
    │   │   └── 📂 repository/                       # Data Access
    │   │       ├── 📄 MovimentacaoRepository.java
    │   │       └── 📄 ProdutoRepository.java
    │   │
    │   └── 📂 resources/
    │       ├── 📄 application.properties            # Config ⚙️
    │       ├── 📂 static/css/
    │       │   └── 🎨 style.css                     # 1199 linhas de puro estilo ✨
    │       └── 📂 templates/
    │           ├── 📄 home.html                     # Dashboard
    │           ├── 📄 login.html                    # Tela de login
    │           ├── 📂 fragments/                    # Componentes reutilizáveis
    │           │   ├── 📄 head.html
    │           │   ├── 📄 navbar.html
    │           │   ├── 📄 sidebar.html
    │           │   ├── 📄 footer.html
    │           │   └── 📄 scripts-footer.html
    │           ├── 📂 produto/
    │           │   ├── 📄 listagem.html             # Tabela de produtos
    │           │   ├── 📄 form-inserir.html         # Cadastro
    │           │   └── 📄 form-alterar.html         # Edição
    │           └── 📂 movimentacao/
    │               └── 📄 listagem.html             # Movimentações
    │
    └── 📂 test/                                     # 🧪 Em breve...
```

---

## 🗄️ Modelo de Dados

### 🏷️ Produto

```sql
TABLE produto
├── id                   BIGINT (PK) 🔑
├── nome                 VARCHAR(255)   [NOT NULL]
├── descricao            TEXT
├── categoria            VARCHAR(255)
├── origem_pais          VARCHAR(255)
├── fornecedor           VARCHAR(255)
├── numero_lote          VARCHAR(255)   [NOT NULL]
├── data_fabricacao      DATE
├── data_validade        DATE           [NOT NULL]
├── quantidade           INT
├── unidade_medida       VARCHAR(255)
├── custo_unitario       DECIMAL
├── estoque_minimo       INT            [NOT NULL]
├── localizacao_almoxarifado VARCHAR(255)
└── observacoes          TEXT
```

### 📦 Movimentação

```sql
TABLE movimentacao
├── id                   BIGINT (PK) 🔑
├── produto_id           BIGINT (FK) 🔗 → produto(id)
├── tipo                 VARCHAR(255)   [NOT NULL] (ENTRADA / SAÍDA)
├── quantidade           INT            [NOT NULL]
├── data_movimentacao    DATE           [NOT NULL]
├── responsavel          VARCHAR(255)
└── observacoes          TEXT
```

### 🔗 Relacionamentos

```
┌──────────────┐          ┌──────────────────┐
│    Produto   │◄─────────│  Movimentacao    │
│              │    1:N   │                  │
│ id (PK)      │─────────►│ produto_id (FK)  │
│ nome         │          │ tipo             │
│ quantidade   │          │ quantidade       │
│ estoque_minimo│         │ data_movimentacao│
│ data_validade│          │ responsavel      │
└──────────────┘          └──────────────────┘
```

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ **Java 21+** instalado
- 🐬 **MySQL 8.0** rodando localmente
- 📦 **Maven 4.0+** (ou use o Maven Wrapper)
- 💻 **IntelliJ IDEA** (recomendado)

### Passo a Passo

#### 1️⃣ Configure o Banco de Dados

```sql
CREATE DATABASE cafearomaesabor;
```

Ou simplesmente deixe que o Spring Boot crie automaticamente (já configurado! ✅)

#### 2️⃣ Configure o Acesso

Edite `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cafearomaesabor?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=Senai@403
```

#### 3️⃣ Execute com Maven

```bash
mvn spring-boot:run
```

#### 4️⃣ Acesse

Abra seu navegador e vá para:

```
🌐 http://localhost
```

> Sim, na porta **80**! 🚀

### 🖥️ Tela de Login

```
Usuário: admin
Senha:   admin
```

> *Nota: A tela de login está implementada visualmente. A autenticação real pode ser integrada futuramente com Spring Security.* 🔐

---

## 🎨 Galeria

### 🖼️ Tela de Login
> *Duas colunas: identidade visual da marca (esquerda) + formulário de acesso (direita)*

```
┌─────────────────────────────────────┬──────────────┐
│                                     │              │
│   ☕ CAFÉ AROMA & SABOR              │   👤 Usuário │
│                                     │   🔒 Senha   │
│   "Qualidade que aquece a alma"     │              │
│                                     │  [Entrar]    │
│   ✅ Controle de Estoque            │              │
│   ✅ Gestão de Validade             │              │
│   ✅ Rastreabilidade                │              │
│   ✅ Dashboard Inteligente          │              │
│                                     │              │
└─────────────────────────────────────┴──────────────┘
```

### 📊 Dashboard
```
┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐
│ 📦 1.234 │ │ ⏰   12  │ │ 🚨    3  │ │ 💰R$ 45K │
│ Total    │ │ Vencem  │ │ Crítico │ │ Valor   │
│ Estoque  │ │ 7 dias  │ │         │ │ Total   │
└─────────┘ └─────────┘ └─────────┘ └─────────┘

┌─────────────────────────────────────────────────┐
│ 🚨 Alerta: Café Arábica vence em 5 dias!        │
│ 🚨 Alerta: Grão Importado em estoque crítico!    │
└─────────────────────────────────────────────────┘

┌───────────────────────┐ ┌───────────────────────┐
│ Últimas Movimentações │ │ Estoque Crítico       │
│ 📥 Entrada - Café  50 │ │ ████████░░ Café  30%  │
│ 📤 Saída  - Chá   20  │ │ ████░░░░░░ Chá   40%  │
│ 📥 Entrada - Açúcar 10│ │ ██████████░ Chocolate │
└───────────────────────┘ └───────────────────────┘
```

### 📋 Listagem de Produtos

| Nome | Validade | Status | Estoque |
|:--|:--:|:--:|:--:|
| Café Arábica | 15/12/2025 | 🟠 URGENTE | 10 un |
| Café Robusta | 20/06/2026 | 🟢 OK | 50 un |
| Chá Verde | 10/05/2024 | 🔴 VENCIDO | 0 un |
| Chocolate Gourmet | 05/01/2026 | 🟡 ATENÇÃO | 25 un |

---

## 🧪 Testes

> 🚧 *Em desenvolvimento...*

Os testes automatizados estão sendo preparados com **JUnit 5** e **Mockito**. Fique ligado para as próximas atualizações!

---

## 🤝 Contribuindo

Contribuições são **bem-vindas**! Siga os passos:

1. 🍴 Faça um **fork** do projeto
2. 🌿 Crie uma branch: `git checkout -b feature/nova-funcionalidade`
3. 💻 Faça suas alterações
4. ✅ **Teste** exaustivamente
5. 📝 Commit: `git commit -m 'feat: adiciona nova funcionalidade'`
6. 🚀 Push: `git push origin feature/nova-funcionalidade`
7. 🔃 Abra um **Pull Request**

---

## 👨‍🎓 Autores

<div align="center">

| [<img src="https://github.com/Maysalr.png" width="100" style="border-radius:50%"><br><sub>**Maysa Louzada**</sub>](https://github.com/Maysalr) |
|:--:|
| 🎓 *SENAI - Desenvolvimento de Sistemas* |

</div>

---

## 📜 Licença

Distribuído sob a licença **MIT**. Veja `LICENSE` para mais informações.

---

<div align="center">

### *"Um sistema feito com dedicação, café e muito código."* 💻☕❤️

---

⭐️ **Deixe uma estrela** no projeto se ele te ajudou ou inspirou!

---

**Café Aroma & Sabor** — *SENAI 2025*

</div>
