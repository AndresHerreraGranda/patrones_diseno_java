# 💾 Memento

El **Memento** es un patrón de diseño **comportamental** que te permite **guardar y restaurar el estado previo de un objeto** sin revelar los detalles internos de su implementación 🧠.

---

## 🧩 Componentes

El patrón se compone de **tres partes principales**:

### 1️⃣ Clase Original (`Article`)
Es la clase principal que contiene los atributos y métodos del objeto. A esta clase se le agregan dos métodos clave:

- 📝 `crearMemento()`: crea una "foto" del estado actual del objeto.
- 🔄 `restaurarMemento(memento)`: restaura el estado a partir de un memento anterior.

---

### 2️⃣ Clase Memento
Es una **representación del estado del objeto**. Puede incluir todos los atributos o solo aquellos necesarios.

🔍 Por ejemplo: no es obligatorio copiar el `id` si este es fijo; puedes copiar solo los atributos que cambian.

---

### 3️⃣ Clase Caretaker (Cuidador 👮‍♂️)
Es quien **administra los mementos**, guardando las diferentes versiones del estado.

Contiene dos métodos comunes:
- ➕ `agregarMemento(memento)`: guarda un nuevo memento en una lista.
- 📥 `obtenerMemento(index)`: recupera un memento específico por índice.

---

## ⚙️ ¿Cómo funciona?

1. Creas una instancia del objeto `Article` y del `Caretaker`.
2. En cualquier momento, puedes **guardar el estado actual** del artículo usando:
   ```java
   caretaker.agregarMemento(article.crearMemento());
   ```
3. Puedes guardar tantos mementos como necesites 📸.
4. Cuando quieras **restaurar un estado anterior**, simplemente haz:
   ```java
   article.restaurarMemento(caretaker.obtenerMemento(index));
   ```

---

## 🧠 Ventajas

- Encapsula el estado interno del objeto sin exponer su estructura.
- Permite implementar funcionalidades tipo **"deshacer"** 🔙.
- Separa la lógica de guardado/restauración del estado de la lógica principal del objeto.
