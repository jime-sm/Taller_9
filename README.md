
| Carpeta | Principio SOLID | Cambios realizados |
|---|---|---|
| `00-inicio` | Código inicial | Se presenta el código original del parqueadero, en el que se evidencian problemas relacionados con los cinco principios SOLID. |
| `01-responsabilidad-unica` | SRP - Responsabilidad única | Se separaron las responsabilidades de exportar archivos CSV y enviar notificaciones SMS, creando las clases `ExportadorCSV` y `NotificadorSMS`. |
| `02-abierto-cerrado` | OCP - Abierto/cerrado | Se modificó la clase `Vehiculo` para convertirla en abstracta y se crearon subclases como `Carro`, `Moto`, `Bicicleta` y `VehiculoPorDia`, evitando utilizar estructuras `switch` para calcular los cobros. |
| `03-sustitucion-liskov` | LSP - Sustitución de Liskov | Se creó la interfaz `Fidelizable` para que solamente los vehículos que pueden acumular puntos implementen esta funcionalidad, evitando obligar a `Bicicleta` a realizar operaciones que no soporta. |
| `04-segregacion-interfaces` | ISP - Segregación de interfaces | Se dividió la interfaz general en interfaces más pequeñas, como `ConMinutos`, `ConSeguro`, `ConLavado` y `GuardaCasco`, permitiendo que cada clase implemente únicamente las funcionalidades que necesita. |
| `05-inversion-dependencias` | DIP - Inversión de dependencias | Se creó la interfaz `RepositorioCobros` y la implementación `RepositorioEnMemoria`. Además, `GestorParqueadero` recibe el repositorio mediante su constructor, en lugar de crear directamente una instancia de `RepositorioMySQL`. |
