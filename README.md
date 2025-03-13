# CoroutinesCronometer

## Descripción
CoroutinesApp es una aplicación de Android que implementa el uso de corrutinas en Kotlin para manejar dos contadores de manera síncrona. El segundo contador comienza su ejecución una vez que el primero ha finalizado. Además, se proporciona una opción para cancelar ambos contadores en cualquier momento.

## Características
- Implementación de corrutinas en `ViewModel`.
- Dos contadores sincronizados.
- Botón para iniciar los contadores.
- Botón para cancelar la ejecución en cualquier instante.
- Uso de `LiveData` y `MutableState` para la actualización de la UI en Jetpack Compose.

## Requisitos
- Android Studio Arctic Fox o superior.
- Kotlin 1.5 o superior.
- Gradle 7.0 o superior.

## Instalación
1. Clona el repositorio en tu máquina local:
   ```sh
   git clone https://github.com/joabvb/Ejercicio-4.git
   ```
2. Abre el proyecto en Android Studio.
3. Sincroniza los archivos de Gradle.
4. Ejecuta la aplicación en un emulador o dispositivo físico.

## Estructura del Proyecto
```
CoroutinesApp/
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/coroutinesapp/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── viewmodel/MainViewModel.kt
│   │   │   ├── res/
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── dimens.xml
```

## Uso
1. Presiona el botón **Iniciar Contadores** para comenzar la cuenta.
2. Observa cómo el primer contador se ejecuta antes que el segundo.
3. En cualquier momento, presiona **Cancelar** para detener ambos contadores.

## Tecnologías Utilizadas
- Kotlin
- Jetpack Compose
- Corrutinas de Kotlin
- Android ViewModel
