import tkinter as tk

class ExampleApp(tk.Tk):
    
    def __init__(self):
        tk.Tk.__init__(self)
        self.title('Ejemplo de Tkinter con diseño responsive')
        
        # Crear un contenedor principal
        container = tk.Frame(self)
        container.pack(side='top', fill='both', expand=True)
        container.grid_rowconfigure(0, weight=1)
        container.grid_columnconfigure(0, weight=1)
        
        self.frames = {}
        
        # Crear una lista de clases de páginas
        pages = [HomePage, Page1, Page2]
        
        for page in pages:
            frame = page(container, self)
            self.frames[page] = frame
            frame.grid(row=0, column=0, sticky='nsew')
        
        self.show_frame(HomePage)
    
    def show_frame(self, page):
        frame = self.frames[page]
        frame.tkraise()


class HomePage(tk.Frame):
    
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        
        # Crear un botón en la página de inicio
        button1 = tk.Button(self, text='Ir a la página 1', command=lambda: controller.show_frame(Page1))
        button1.pack(pady=10)
        
        # Crear un botón en la página de inicio
        button2 = tk.Button(self, text='Ir a la página 2', command=lambda: controller.show_frame(Page2))
        button2.pack(pady=10)


class Page1(tk.Frame):
    
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        
        # Crear un botón en la página 1
        button = tk.Button(self, text='Volver a la página de inicio', command=lambda: controller.show_frame(HomePage))
        button.pack(pady=10)


class Page2(tk.Frame):
    
    def __init__(self, parent, controller):
        tk.Frame.__init__(self, parent)
        
        # Crear un botón en la página 2
        button = tk.Button(self, text='Volver a la página de inicio', command=lambda: controller.show_frame(HomePage))
        button.pack(pady=10)


if __name__ == '__main__':
    app = ExampleApp()
    app.mainloop()
