import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // Crear un Frame
        Frame frame = new Frame("Ejemplo de AWT");
        frame.setSize(300, 200);
        
        // Crear un Button
        Button button = new Button("Haz clic");
        button.setBounds(100, 70, 100, 30);
        
        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame messageFrame = new Frame("Mensaje");
                messageFrame.setSize(200,100);
                messageFrame.setLayout(new BorderLayout());

                Label messageLabel = new Label("¡Hola, mundo!");
                messageLabel.setAlignment(Label.CENTER);
                messageFrame.add(messageLabel, BorderLayout.CENTER);
                messageFrame.setVisible(true);
            }
        });
        
        // Agregar el botón al Frame
        frame.add(button);
        
        // Mostrar el Frame
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
/*
 Explicación del código:
 Primero utilizamos Frame que representa una ventana en la interfaz gráfica. Usamos el método setSize para establecer su tamaño. Después al igual que en el ejemplo anterior Button, un componente de botón que permite al usuario interactuar haciendo clic en él. Usamos el método addActionListener para agregar un ActionListener que se activará cuando se haga clic en el botón. También utilizamos ActionListener una interfaz funcional que define el método actionPerformed para manejar eventos de acción. Implementamos esta interfaz y sobreescribimos el método para mostrar un cuadro de diálogo con el mensaje "¡Hola, mundo!" cuando se hace clic en el botón. Luego JOptionPane que nos muestra cuadros de diálogo con mensajes o solicitudes al usuario. Usamos el método showMessageDialog para mostrar un cuadro de diálogo con el mensaje "¡Hola, mundo!" cuando se hace clic en el botón. Y también utilizamos el método setLayout(null) para deshabilitar el administrador de diseño predeterminado y utilizar coordenadas absolutas para posicionar el botón en el Frame.
*/
