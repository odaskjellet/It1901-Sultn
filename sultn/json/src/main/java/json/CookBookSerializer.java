package json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import core.Cookbook;
import core.Recipe;

public class CookBookSerializer extends JsonSerializer<Cookbook> {
    
    @Override
    public void serialize(Cookbook cookBook, JsonGenerator jsonGen, SerializerProvider serializerProvider) throws IOException {
        jsonGen.writeStartObject();
        
        jsonGen.writeArrayFieldStart("recipes");
        for (Recipe r : cookBook.getRecipes()) {
            jsonGen.writeObject(r);
        }
        jsonGen.writeEndArray();

        jsonGen.writeEndObject();
    }
}