import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // Crear una ventana JFrame
        JFrame frame = new JFrame("Ejemplo de Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Crear un botón JButton
        JButton button = new JButton("Haz clic");
        button.setBounds(100, 70, 100, 30);
        
        // Agregar un ActionListener al botón
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "¡Hola, mundo!");
        });
        
        // Agregar el botón a la ventana
        frame.add(button);
        
        // Mostrar la ventana
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
/*
 Explicación del código:
 Utilizamos JFrame que representa una ventana en la interfaz gráfica.
 Usamos métodos como setDefaultCloseOperation para especificar la acción al cerrar la ventana y setSize para establecer su tamaño.
 Luego JButton que es un componente de botón que permite al usuario interactuar haciendo clic en él.
 Usamos el método addActionListener para agregar un ActionListener que se activará cuando se haga clic en el botón.
 Despues JOptionPane que nos muestra cuadros de diálogo con mensajes o solicitudes al usuario.
 Usamos el método showMessageDialog para mostrar un cuadro de diálogo con el mensaje "¡Hola, mundo!" cuando se hace clic en el botón.
 Y por ultimo utilizamos métodos como setLayout(null) para deshabilitar el administrador de diseño predeterminado y utilizar coordenadas absolutas para posicionar el botón en la ventana.
*/
