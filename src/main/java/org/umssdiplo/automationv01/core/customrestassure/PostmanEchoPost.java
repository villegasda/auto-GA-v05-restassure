package org.umssdiplo.automationv01.core.customrestassure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

/**
 * Manage PostMan Echo
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0
 */
public class PostmanEchoPost implements IEndPoint {

    private static PostmanEchoPost instance = new PostmanEchoPost();
    private RequestSpecification requestSpecification;

    private PostmanEchoPost() {
        initializeRequestSpecification();
    }

    public static PostmanEchoPost getInstance() {
        return instance;
    }

    @Override
    public void initializeRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(PropertyAccessor.getInstance().getBaseUri())
                .setBody("diplomado testing")
                .build();
    }

    @Override
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}
