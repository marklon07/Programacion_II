package co.edu.uniquindio.poo;

public class TelegramAdapter implements ServicioMensajeria{
    private TelegramAPI telegramAPI;

    public TelegramAdapter(TelegramAPI telegramAPI){
        this.telegramAPI = telegramAPI;
    }

    @Override
    public void enviarMensaje(String destinatario,String texto){
        Long chatId = Long.parseLong(destinatario);
        telegramAPI.sendTelegramMessage(chatId, texto, false);
    }
}
