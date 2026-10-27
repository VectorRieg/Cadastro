/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacidepatinete;

/**
 *
 * @author vector
 */
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class viaCEP {

    public static class Endereco {
        public String rua, bairro, cidade, uf;
    }

    public static Endereco buscar(String cepFormatado) throws Exception {
        String cep = cepFormatado.replaceAll("\\D", "");
        if (cep.length() != 8) return null;

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5)).build();
        HttpRequest req = HttpRequest.newBuilder(
                URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .timeout(Duration.ofSeconds(5)).GET().build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());

        if (resp.statusCode() != 200) return null;
        String json = resp.body();
        if (json.contains("\"erro\"")) return null;

        Endereco e = new Endereco();
        e.rua = campo(json, "logradouro");
        e.bairro = campo(json, "bairro");
        e.cidade = campo(json, "localidade");
        e.uf = campo(json, "uf");
        return e;
    }

    private static String campo(String json, String nome) {
        Matcher m = Pattern.compile("\"" + nome + "\"\\s*:\\s*\"([^\"]*)\"").matcher(json);
        return m.find() ? desescapar(m.group(1)) : "";
    }

    private static String desescapar(String s) {
        Matcher m = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(s);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            char c = (char) Integer.parseInt(m.group(1), 16);
            m.appendReplacement(sb, Matcher.quoteReplacement(String.valueOf(c)));
        }
        m.appendTail(sb);
        return sb.toString();
    }
}