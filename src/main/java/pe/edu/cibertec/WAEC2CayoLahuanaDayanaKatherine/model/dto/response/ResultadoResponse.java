package pe.edu.cibertec.WAEC2CayoLahuanaDayanaKatherine.model.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
