package cursojavaTxtExcel;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Jose da Silva");
		usuario1.setCpf("123456");
		usuario1.setLogin("jose");
		usuario1.setSenha("1234");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Maria dos Santos");
		usuario2.setCpf("0976433");
		usuario2.setLogin("Maria");
		usuario2.setSenha("123456");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();/*organiza a formatação do Json*/
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\klebe\\git\\primeroProgramaJava\\primeiro-programa-java\\src\\cursojavaTxtExcel\\filjson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//******************************* LENDO O ARQUIVO JSON************************
		
		FileReader fileReader = new FileReader("C:\\Users\\klebe\\git\\primeroProgramaJava\\primeiro-programa-java\\src\\cursojavaTxtExcel\\filjson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listaUsuarios.add(usuario);
		}
		
		System.out.println("leitura do arquivo JSON: " + listaUsuarios);
	}

}
