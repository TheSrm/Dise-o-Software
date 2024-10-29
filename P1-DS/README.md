
## Estudiantes - Students  

Nombre 1: [Daniel Ruibal Balboa](https://github.com/DanielRuibal)

Nombre 2: Sergio Regueiro Martínez

# Enunciado

# Primer ejericio


---

## Ejercicio 1: Implementación de Utilidades para Procesamiento de Cadenas de Texto en Java

## Objetivos

1. **Validación de caracteres en cadenas**: Comprobar si una cadena de texto cumple con una longitud mínima y contiene únicamente caracteres permitidos.
2. **Ordenación de caracteres**: Ordenar los caracteres de una cadena colocando las letras minúsculas antes que las mayúsculas.
3. **Análisis estadístico de palabras en texto**: Determinar si la longitud promedio de las palabras en una cadena se encuentra dentro de un rango específico.

Cada uno de estos puntos corresponde a un método que debe ser implementado en la clase `StringUtilities` en Java.

## Descripción de la Clase `StringUtilities`

La clase `StringUtilities` contiene tres métodos estáticos que permiten realizar distintas operaciones sobre cadenas de texto. Estos métodos son:

1. **`isValidString(String s, String allowed, int len)`**
2. **`lowercaseFirst(String desordenada)`**
3. **`checkTextStats(String string, int min, int max)`**

A continuación, se describen en detalle los requisitos y funcionamiento de cada método.

### Método `isValidString(String s, String allowed, int len)`

Este método verifica si una cadena de texto cumple con los siguientes requisitos:
- La cadena tiene una longitud mínima indicada por el parámetro `len`.
- La cadena contiene únicamente caracteres que pertenecen a la cadena `allowed` o son numéricos (del 0 al 9), independientemente de que estos últimos estén o no en `allowed`.

#### Parámetros

- `s` (String): Cadena de entrada que se desea validar.
- `allowed` (String): Cadena de caracteres permitidos.
- `len` (int): Longitud mínima requerida para que la cadena sea válida.

#### Retorno
- El método devuelve `true` si la cadena cumple con las restricciones de longitud y caracteres permitidos, y `false` en caso contrario.

#### Ejemplo de Uso
```java
isValidString("abc123", "abc", 5); // Debe devolver true
```

### Método `lowercaseFirst(String desordenada)`

Este método toma una cadena de caracteres y realiza la ordenación de sus caracteres alfabéticamente. La salida debe disponer los caracteres en minúscula antes que los caracteres en mayúscula.

#### Parámetros

- `desordenada` (String): Cadena de entrada desordenada que se desea ordenar.

#### Retorno
- Devuelve una cadena con los caracteres ordenados alfabéticamente, colocando primero las letras minúsculas y luego las mayúsculas.

#### Ejemplo de Uso
```java
lowercaseFirst("BcA"); // Debe devolver "cAB"
```

### Método `checkTextStats(String string, int min, int max)`

Este método realiza un análisis sobre la cadena de entrada para calcular la longitud media de sus palabras. Se considera que las palabras están separadas por espacios. El método valida si la longitud promedio de las palabras se encuentra dentro de un rango específico (`min`, `max`) y, además, comprueba que ninguna palabra tenga una longitud mayor al doble de la longitud media.

#### Parámetros

- `string` (String): Cadena de texto a analizar.
- `min` (int): Longitud mínima permitida para la media de las palabras.
- `max` (int): Longitud máxima permitida para la media de las palabras.

#### Retorno
- Devuelve `true` si la longitud promedio de las palabras está dentro del rango especificado y ninguna palabra es demasiado larga; de lo contrario, devuelve `false`.

#### Ejemplo de Uso
```java
checkTextStats("Había una vez", 4, 5); // Debe devolver true
```

## Ejecución del Programa

En el método `main` de la clase `StringUtilities`, se presentan ejemplos de uso de cada método implementado. Los ejemplos proporcionados están diseñados para facilitar las pruebas y observar los resultados esperados de cada función:

```java
public static void main(String[] args) {
    System.out.println(isValidString("12345", "abcd", 5));   // Ejemplo de uso de isValidString
    System.out.println(lowercaseFirst("ABC"));               // Ejemplo de uso de lowercaseFirst
    System.out.println(checkTextStats("Habia una vez", 4, 5)); // Ejemplo de uso de checkTextStats
}
```

### Salida Esperada

Al ejecutar el programa, la salida en la consola debería ser similar a la siguiente:

```plaintext
true
cAB
true
```

## Consideraciones Adicionales

1. **Manejo de Excepciones**: El método `checkTextStats` debe arrojar una `IllegalArgumentException` en los siguientes casos:
   - Cuando los parámetros `min` o `max` son menores que 1.
   - Cuando la cadena de entrada es `null` o está vacía.

2. **Pruebas y Validación**: Se recomienda realizar pruebas exhaustivas sobre cada método, teniendo en cuenta casos límite como:
   - Cadenas vacías o nulas.
   - Palabras que exceden la longitud media permitida en más del doble.
   - Cadenas que contienen caracteres fuera de los permitidos.

3. **Extensibilidad**: La implementación debe permitir modificaciones futuras, como el cambio de delimitadores de palabras o la inclusión de caracteres especiales. Para facilitar esto, se deben utilizar buenas prácticas en la organización del código y el nombrado de variables.

---


