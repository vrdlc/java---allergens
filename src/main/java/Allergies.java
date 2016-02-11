import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
  public static void main(String[] args) {


  }

public static String giveAllergens(Integer userInput) {
  HashMap<String, Integer> mapOfAllergens = new HashMap<String, Integer>();
  mapOfAllergens.put('eggs', 1);
  mapOfAllergens.put('peanuts', 2);
  mapOfAllergens.put('shellfish', 4);
  mapOfAllergens.put('strawberries', 8);
  mapOfAllergens.put('tomatoes', 16);
  mapOfAllergens.put('chocolate', 32);
  mapOfAllergens.put('pollen', 64);
  mapOfAllergens.put('cats', 128);
}
}
    // staticFileLocation("/public");
//Home page
    // get("/", (request, response) -> {
    //   HashMap model = new HashMap();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());


    //Change Given Page
  // get("/results", (request, response) -> {
  //   HashMap model = new HashMap();
  //   String change = request.queryParams("change"); //FORM INPUT
  //   Integer integerChange = Integer.parseInt(change); //CHANGING FORM INPUT TO INTEGER
  //   String results = giveChange(integerChange); //RUN INTEGER THROUGH giveChange LOOP
  //   model.put("integerChange", integerChange);
  //   model.put("results", results);
  //   model.put("template", "templates/results.vtl");
  //   return new ModelAndView(model, "templates/layout.vtl");
  // }, new VelocityTemplateEngine());
