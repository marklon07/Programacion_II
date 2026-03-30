package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        TelegramAPI telegramAPI = new TelegramAPI();
        ServicioMensajeria servicio = new TelegramAdapter(telegramAPI);
        servicio.enviarMensaje("1234", "Mensaje de Telegram");

    }
}