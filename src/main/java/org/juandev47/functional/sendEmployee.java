package org.juandev47.functional;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.HashMap;
import java.util.Map;

public class sendEmployee {
    private static final String TABLE_NAME = "Employee";
    private static final Region REGION = Region.of("us-east-1");
    private static DynamoDbClient client = DynamoDbClient.builder()
            .region(REGION)
            .build();

    public static void putEmployee(String id, String nombre, String email, String cedula, String rol) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("id", AttributeValue.builder().s(id).build());
        item.put("nombre", AttributeValue.builder().s(nombre).build());
        item.put("email", AttributeValue.builder().s(email).build());
        item.put("cedula", AttributeValue.builder().s(cedula).build());
        item.put("rol", AttributeValue.builder().s(rol).build());

        PutItemRequest request = PutItemRequest.builder()
                .tableName(TABLE_NAME)
                .item(item)
                .build();

        client.putItem(request);
    }

    public static Map<String, AttributeValue> getEmployee(String key) {
        Map<String, AttributeValue> keyToGet = new HashMap<>();
        keyToGet.put("id", AttributeValue.builder().s(key).build());

        GetItemRequest request = GetItemRequest.builder()
                .tableName(TABLE_NAME)
                .key(keyToGet)
                .build();

        return client.getItem(request).item();
    }

}
