import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionMonedaAPI {

    Moneda  conversionDeMoneda (String firstCurrencyCode, String secondCurrencyCode, double valorIngresado){
        if (!firstCurrencyCode.isEmpty()) {
            try {
                String direccion = "https://v6.exchangerate-api.com/v6/f36f7b336f950078c624bdaf/pair/"+firstCurrencyCode+"/"+secondCurrencyCode+"/"+valorIngresado;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moneda.class);
            } catch (IOException | InterruptedException e) {
                System.err.println("Error al enviar la solicitud, obtener la respuesta o procesar el JSON: " + e.getMessage());
            }


        }else {
            System.out.println(" Datos no proporcionados");
        }

        return null;
    }

}
