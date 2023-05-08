import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QAction, QPushButton, QWidget, QGridLayout, QComboBox


class Example(QMainWindow):
    
    def __init__(self):
        super().__init__()
        
        # Crear un menú
        menu = self.menuBar().addMenu('Archivo')
        
        # Crear una acción para el menú
        exit_action = QAction('Salir', self)
        exit_action.triggered.connect(self.close)
        menu.addAction(exit_action)
        
        # Crear un widget central y una cuadrícula
        central_widget = QWidget(self)
        self.setCentralWidget(central_widget)
        grid_layout = QGridLayout(central_widget)
        
        # Crear botones
        button1 = QPushButton('Botón 1', self)
        button2 = QPushButton('Botón 2', self)
        button3 = QPushButton('Botón 3', self)
        
        # Agregar botones a la cuadrícula
        grid_layout.addWidget(button1, 0, 0)
        grid_layout.addWidget(button2, 0, 1)
        grid_layout.addWidget(button3, 1, 0, 1, 2)
        
        # Crear un menú desplegable
        combo_box = QComboBox(self)
        combo_box.addItem('Opción 1')
        combo_box.addItem('Opción 2')
        combo_box.addItem('Opción 3')
        
        # Agregar el menú desplegable a la cuadrícula
        grid_layout.addWidget(combo_box, 2, 0, 1, 2)
        
        self.setWindowTitle('Ejemplo de PyQt5 con menú desplegable')
        self.show()


if __name__ == '__main__':
    app = QApplication(sys.argv)
    ex = Example()
    sys.exit(app.exec_())
