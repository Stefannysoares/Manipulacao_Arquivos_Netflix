package controller;
import br.edu.fateczl.filaobj.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import model.serie;

public class NetflixController implements iNetflixController {

	
	private void createFila(String path, String nome) throws IOException {
		
		File arq = new File (path,nome);
		if (arq.exists()&& arq.isFile()) {
			
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			Fila f = new Fila();
			
			linha = buffer.readLine();
			
			while(linha!= null) {
				String [] separa = linha.split(",");
							
				int year = Integer.parseInt(separa[4]);
				int imdb = Integer.parseInt(separa[11]);
				serie obj = new serie (separa [0], separa[1], separa [2], year, separa[6], separa [10], imdb);
				f.insert(obj);
				linha = buffer.readLine();	
				
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
			
			
		}else {
			throw new IOException ("Diretório Inválido.");
		}
	}
	

	
	

	
	private void createFile(String path, Fila f) throws IOException {
		
		File dir = new File (path);
		File arq = new File (path);
		if (dir.exists() && dir.isDirectory()) {
			boolean existe = false;
			
			if (arq.exists()) {
				existe = true;
			}
		try {
			serie aux = (serie)(f.remove());
			String conteudo = aux.toString();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}
	}
	
	
	
	@Override
	public int classificar() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
