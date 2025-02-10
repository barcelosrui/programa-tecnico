package pt.barcelos.karate.programa_tecnico.business.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class Response<T>
{
    private final HttpStatus statusCode;
    private final T response;

    public Response(HttpStatus statusCode, T response) {
        this.statusCode = statusCode;
        this.response = response;
    }

    public Response(HttpStatus statusCode) {
        this.statusCode = statusCode;
        this.response = null;
    }
}
