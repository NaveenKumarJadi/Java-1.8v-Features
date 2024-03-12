import java.io.*;

import javax.script.*;

public class Demo{

	public static void main(String... args) throws Exception {

		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");

		se.eval(new FileReader("one.js"));

	}
}