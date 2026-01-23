package Java_Programs._39_JSON.JsonValueFinding;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckingValues {

    public static void main(String[] args) throws Exception {

        // Read the complete JSON file as a String (input source for parsing)
        String jsonData = new String(
                Files.readAllBytes(Paths.get(
                        "src/Java_Programs/_39_JSON/JsonValueFinding/SuperHeroSquad.json"
                ))
        );

        // Convert JSON String into JSONObject (root of JSON)
        JSONObject jsonObject = new JSONObject(jsonData);

        // Get the "members" array from JSON
        JSONArray members = jsonObject.getJSONArray("members");

        // Get first person's age → members[0].age
        int firstPersonAge = members.getJSONObject(0).getInt("age");
        System.out.println(firstPersonAge); // Output: 29

        // Get second person's first power → members[1].powers[0]
        String secondPersonFirstPower =
                members.getJSONObject(1)
                       .getJSONArray("powers")
                       .getString(0);

        System.out.println(secondPersonFirstPower); // Output: Million tonne punch
    }
}
