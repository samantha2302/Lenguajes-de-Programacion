# Lenguajes de Programación
- Ashley Samantha Acuña Montero - 2021055077

## Explicacion

2)	Implementar una versión muy simplificada de un sistema para una biblioteca. En el sisitema aparecen socios, que se registran en la biblioteca y a partir de ese 
momento pueden tomar prestados libros de la misma. 
Un socio está caracterizado por un número de socio, un nombre y una dirección; además, en cada momento se puede saber el número de libros que un socio tiene prestados.
 Por su parte, de cada libro se conoce su código, título, autor y si está o no disponible; además se puede saber en cualquier momento la localización del libro en la 
 biblioteca (si está disponible o si lo tiene algún socio). 
Los libros se prestan a los socios, y como consecuencia aparece la noción de préstamo; un préstamo estará caracterizado, además de por el código del libro prestado y 
el número de socio, por la fecha del mismo. Por otra parte, el sistema también permite llevar control de los socios que tengan prestados más de 3 libros (usar filter 
para esta acción).
Demuestre el funcionamiento de su código a partir de escenarios puntuales con valores ficticios pero que permitan ejecutar las acciones principales de las clases. 
Agregue datos, cree socios, haga que reserven libros, muestre estados de libros, muestre socios que tengan prestados más de 3 libros, etc.	

### Lo que imprime en consola 

Socio{id=1, nombre='Kevelyn', direccion='Santa Clara', libros=[Libro {Codigo = 1, titulo = Cronica de una muerte anunciada', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 2, titulo = Romancero gitano', autor = Federico García Lorca', disponibilidad = false}, Libro {Codigo = 3, titulo = Cien años de soledad', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 4, titulo = El amor en los tiempos del cólera', autor = Gabriel García Márquez', disponibilidad = false}]}
Socio{id=2, nombre='Kristel', direccion='Santa Clara', libros=[]}
Socio{id=3, nombre='Katherine', direccion='Santa Clara', libros=[]}
Socio{id=4, nombre='Britani', direccion='Santa Clara', libros=[]}

Biblioteca{nombre='Sam's', socios=[Socio{id=1, nombre='Kevelyn', direccion='Santa Clara', libros=[Libro {Codigo = 1, titulo = Cronica de una muerte anunciada', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 2, titulo = Romancero gitano', autor = Federico García Lorca', disponibilidad = false}, Libro {Codigo = 3, titulo = Cien años de soledad', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 4, titulo = El amor en los tiempos del cólera', autor = Gabriel García Márquez', disponibilidad = false}]}, Socio{id=2, nombre='Kristel', direccion='Santa Clara', libros=[]}, Socio{id=3, nombre='Katherine', direccion='Santa Clara', libros=[]}, Socio{id=4, nombre='Britani', direccion='Santa Clara', libros=[]}], libros=[Libro {Codigo = 1, titulo = Cronica de una muerte anunciada', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 2, titulo = Romancero gitano', autor = Federico García Lorca', disponibilidad = false}, Libro {Codigo = 3, titulo = Cien años de soledad', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 4, titulo = El amor en los tiempos del cólera', autor = Gabriel García Márquez', disponibilidad = false}, Libro {Codigo = 5, titulo = Grandes Esperanzas', autor = Charles Dickens', disponibilidad = true}], prestamos=[Prestamo {Id prestamo = 1, Id socio = 1, Codigo libro = 1, Fecha = 07/05/2002'}, Prestamo {Id prestamo = 1, Id socio = 1, Codigo libro = 2, Fecha = 07/05/2002'}, Prestamo {Id prestamo = 1, Id socio = 1, Codigo libro = 3, Fecha = 07/05/2002'}, Prestamo {Id prestamo = 1, Id socio = 1, Codigo libro = 4, Fecha = 07/05/2002'}]}
