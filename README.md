# ⚽ API Mundial de Clubes

## 🧾 Descripción

Este proyecto es una API REST construida con **Spring Boot** y **PostgreSQL** que permite registrar y consultar videojuegos. Está diseñado como ejercicio práctico para aprender a desarrollar APIs REST, trabajar con bases de datos relacionales, y aplicar buenas prácticas con JPA.

---

## ✅ Requisitos

- Java 17+
- Spring Boot 3+
- PostgreSQL
- Git

---

## 🛠️ Comandos y scripts necesarios

Todos los comandos, scripts o pasos necesarios para ejecutar, compilar o desplegar el proyecto deben estar claramente documentados en este repositorio.

Esto incluye, pero no se limita a:

- Comandos para crear o configurar la base de datos.
- Scripts para inicializar datos.
- Comandos para construir y ejecutar la aplicación.
- Cualquier otro paso especial necesario para que el proyecto funcione correctamente.

La falta de documentación clara puede afectar la evaluación del proyecto.

## 📌 Funcionalidades

La API debe incluir los siguientes **3 endpoints**, cada uno desarrollado por un integrante diferente del equipo:

1. `POST /api/clubs` – Registrar un nuevo club  
2. `GET /api/clubs/search?name={nombre}` – Buscar clubes por nombre (puede incluir espacios)  
3. `GET /api/clubs/country/{country}` – Obtener clubes filtrados por país

---

## 🔁 Endpoints

### 1️⃣ Registrar un club

- **Método:** `POST`  
- **Ruta:** `/api/clubs`  
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
{
  "name": "Real Madrid",
  "country": "España",
  "coach": "Carlo Ancelotti",
  "titles": 4
}
```

### 2️⃣ Obtener todos los videojuegos
- **Método:** `GET`  
- **Ruta:** `/api/clubs/search`
- **Parámetro:** name (query param)
- **Ejemplo de URL:** /api/clubs/search?name=Real Madrid
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
[
  {
    "id": 1,
    "name": "Real Madrid",
    "country": "España",
    "coach": "Carlo Ancelotti",
    "titles": 4
  }
]

```

### 3️⃣  Obtener clubes por país

- **Método:** `GET`  
- **Ruta:** `/api/clubs/country/{country}`
- **Ejemplo de URL:** /api/clubs/country/España
- **Content-Type:** `application/json`  
- **Body de ejemplo:**

```json
[
  {
    "id": 1,
    "name": "Real Madrid",
    "country": "España",
    "coach": "Carlo Ancelotti",
    "titles": 4
  },
  {
    "id": 5,
    "name": "FC Barcelona",
    "country": "España",
    "coach": "Xavi Hernández",
    "titles": 3
  }
]

```
## 📤 Forma de entrega

### ✅ Pasos para entregar correctamente:

1. **Un solo integrante del equipo debe hacer un _fork_** de este repositorio en GitHub.
2. Luego todo el equipo debe trabajar sobre ese _fork_, haciendo `clone`, `pull` y `push` según sea necesario.
3. Todo el trabajo debe estar en el `main` o `master` branch del fork.
4. **No se aceptarán forks vacíos, sin commits, ni con evidencias de trabajo individual insuficiente.**
5. **Cada integrante debe asegurarse de aparecer en los commits** con su usuario de GitHub.
6. Es totalmente obligatorio que se apeguen al formato de respuesta solicitado en cada endpoint.
7. Al finalizar, **deben agregar un archivo `EQUIPO.md`** en la raíz del proyecto con el siguiente formato:

```markdown
# Integrantes del equipo

- **Nombre:** Juan Pérez  
  **Carnet:** 20200001  
  **Endpoint trabajado:** POST /api/videogames

- **Nombre:** María Gómez  
  **Carnet:** 20200002  
  **Endpoint trabajado:** GET /api/videogames

- **Nombre:** Luis Torres  
  **Carnet:** 20200003  
  **Endpoint trabajado:** GET /api/videogames/{id}

## ⏰ Hora límite de entrega

La entrega se considera **cerrada a las 9:00 a.m.**.

- Solo se tomarán en cuenta los **commits que estén subidos al repositorio antes de las 9:00 a.m.**
- Commits realizados o subidos después de esa hora **no serán considerados**.
- Se recomienda comenzar a subir los cambios cuanto antes para evitar inconvenientes de último momento.
