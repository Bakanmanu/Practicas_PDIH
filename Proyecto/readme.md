# Apuntes Librería Tk #

## Ventanas ##

- **Tk()**: Es la clase que crea las ventanas para añadir los widgets.
- **pack()**: Coloca los widgets en una posición de la ventana, que podremos cambiar a través de los correspondientes atributos.
- **mainloop()**: Inicia el bucle de mensajes, con esta función se monitorea la interacción del usuario a través del ratón o teclado con la aplicación, cuando se produzcaun evento recibiremos la notificacion correspondiente y podremos responder a dicho evento.

## Posicionamiento ##

### Place ###

Permite ubicar elementos indicando su posición (x,y).  

- Para valores **Absolutos**: `self.button.place(x=60, y=40, width=100, height=30)`
- Para valores **Relativos al padre (contenedor)**: `button.place(relx=0.1, rely=0.1, relwidth=0.5, relheight=0.5)`  
*Los argumentos aceptan valores entre 0 y 1*
