/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject;

import com.google.gson.Gson;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Gson g = new Gson();
    }
}
