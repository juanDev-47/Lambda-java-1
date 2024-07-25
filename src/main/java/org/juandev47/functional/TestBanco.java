package org.juandev47.functional;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Map;

/**
 * p = Monto del prestamo
 * i = Taza de interes anual
 * n = plazo del credito en mese
 * <p>
 * Cuota_mensual = (p*i) / (1 - (1 + i) ^ (-n))
 */
public class TestBanco implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> input, Context context) {
        String id = input.get("id");
        String nombre = input.get("nombre");
        String email = input.get("email");
        String cedula = input.get("cedula");
        String rol = input.get("rol");

        if (nombre.equals("randal"))
            return "Probando la lambda";

        // Guardar nuevo empleado
        sendEmployee.putEmployee(id, nombre, email, cedula, rol);

        // Recuperar y mostrar el empleado
        Map<String, AttributeValue> retrievedItem = sendEmployee.getEmployee(id);
        return "Retrieved Employee: " + retrievedItem.toString();

    }

}