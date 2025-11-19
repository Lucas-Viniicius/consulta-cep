# Consulta CEP

Aplicação Java que consome a API ViaCEP para buscar informações de endereços a partir de um CEP informado pelo usuário. Os dados retornados pela API são convertidos de JSON para um objeto Java utilizando a biblioteca Gson e ao final de tudo, são gravados em um arquivo txt.

---

## 🛠 Tecnologias utilizadas
- Java 21  
- Biblioteca Gson  
- API ViaCEP  
- Maven  

---

## 📝 Sobre o projeto
Este projeto foi desenvolvido com o objetivo de concluir meu curso de consumo de APIs e manipulação de arquivos, além de treinar meus conhecimentos em Java, POO e integração com serviços externos.

## 🚀 Funcionalidades
- Validação de CEP (somente 8 dígitos numéricos)  
- Consumo da API ViaCEP usando **HttpClient**
- Conversão automática da resposta JSON em objeto Java (**Gson**)  
- Exibição formatada do endereço completo  
- Loop de interação permitindo várias consultas  
- Tratamento de erros básicos  
- Salvamento dos dados em arquivo **.txt**

---

