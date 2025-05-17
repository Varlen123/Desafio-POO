
## 🧠 Conceitos Praticados

- **Abstração:** `Conteudo` como classe base para cursos e mentorias.  
- **Herança:** `Curso` e `Mentoria` estendem `Conteudo`.  
- **Polimorfismo:** Cada conteúdo implementa XP de forma diferente.  
- **Encapsulamento:** Uso de getters/setters e coleções privadas.  

---

## 🏗️ Estrutura do Projeto

```bash
Desafio-POO/
└── src/
    ├── Main.java          # Classe principal para simular o sistema
    ├── Bootcamp.java      # Armazena conteúdos e desenvolvedores inscritos
    ├── Dev.java           # Representa um desenvolvedor
    ├── Conteudo.java      # Classe abstrata base para todos os conteúdos
    ├── Curso.java         # Implementação específica para cursos
    └── Mentoria.java      # Implementação específica para mentorias
````

---

## 🚀 Funcionalidades

* Criar cursos e mentorias.
* Criar um bootcamp e adicionar conteúdos.
* Inscrever desenvolvedores no bootcamp.
* Progredir nos conteúdos (simulação).
* Calcular XP acumulado com base no progresso.

---

## 📌 Exemplo de Uso

```java
Dev devVarlen = new Dev();
devVarlen.setNome("Varlen");
devVarlen.inscreverBootcamp(bootcamp);
devVarlen.progredir();
System.out.println(devVarlen.calcularTotalXp());
```

---

## 📈 XP - Fórmulas

* `Curso`: `XP = XP_PADRAO * cargaHoraria`
* `Mentoria`: `XP = XP_PADRAO + 20`

> O valor de `XP_PADRAO` é `10.0`.

