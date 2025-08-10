# 📚 Anotações - Fundamentos Spring Boot

## 🔸 Annotations (@)

Annotations (@) são recursos do Java utilizados para fornecer informações adicionais ao código. No Spring Boot, as annotations são amplamente usadas para configurar, definir comportamentos e facilitar a integração entre componentes do framework.

### Principais características

- Permitem marcar classes como controladores REST (`@RestController`)
- Definem métodos que respondem a requisições HTTP (`@GetMapping`, `@PostMapping`)
- Injetam dependências automaticamente (`@Autowired`)
- Configuram beans (`@Bean`)

> 💡 **Vantagem:** O uso de annotations torna o código mais limpo, reduz a necessidade de configurações externas e facilita o desenvolvimento de aplicações Spring Boot.

---

![alt text](image.png)

---

## 🎯 Controllers

### **O que é um Controller e para que serve?**

Um *controller* (ou controlador) é uma classe responsável por receber e processar as requisições feitas à aplicação, geralmente vindas de um navegador ou de outro sistema. No contexto do Spring Boot, os controllers são usados para definir os pontos de entrada da aplicação, ou seja, os caminhos (endpoints) que podem ser acessados via HTTP.

#### 🔄 Como funciona

1. **Recebe requisições** do cliente (usuário ou sistema)
2. **Interpreta os dados** recebidos
3. **Chama os serviços** necessários para processar a informação
4. **Retorna uma resposta** adequada ao cliente

#### 📋 Exemplo prático

Ao acessar um endereço como `/usuarios`, o controller pode buscar uma lista de usuários no banco de dados e devolver essa lista em formato JSON.

> ⚙️ **Importante:** No Spring Boot, os controllers geralmente são marcados com a annotation `@RestController`, indicando que aquela classe irá tratar requisições REST e retornar dados diretamente no corpo da resposta.

---

## 🌐 Parâmetros de URL

### **O que são Path Param e Query Param? Qual a diferença?**

#### 🛤️ **Path Param** (Parâmetro de caminho)

- **Definição:** Valor inserido diretamente na URL para identificar um recurso específico
- **Exemplo:** Em `/usuarios/123`, o `123` é um path param que geralmente representa o ID de um usuário
- **Spring Boot:** Acesse usando `@PathVariable`

#### ❓ **Query Param** (Parâmetro de consulta)

- **Definição:** Valor passado após o símbolo `?` na URL, usado para filtrar ou modificar a resposta
- **Exemplo:** Em `/usuarios?idade=25`, `idade=25` é um query param
- **Spring Boot:** Acesse usando `@RequestParam`

#### 📊 **Resumo da diferença**

| Tipo | Propósito | Localização na URL | Uso típico |
|------|-----------|-------------------|------------|
| **Path Param** | Identificar recursos únicos | Parte do caminho | IDs, identificadores específicos |
| **Query Param** | Informações adicionais | Após o `?` | Filtros, opções de busca |
