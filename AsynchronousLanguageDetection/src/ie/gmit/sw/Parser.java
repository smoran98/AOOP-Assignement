package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Parser implements Runnable {

	private Database db = null;
	private String file;
	private int k;
	
	public Parser(String file, int k) {
		// TODO Auto-generated method stub
		this.file = file;
		this.k = k;
	}
	
	public void setDb(Database db) {
		// TODO Auto-generated method stub
		this.db = db;
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = null;
			
			while((line = br.readLine()) != null) {
				String[] record = line.trim().split("@");
				if (record.length != 2) continue;
				parse(record[0], record[1]);
			}
			br.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void parse(String text, String lang, int... ks) {
		// TODO Auto-generated method stub
		Language language = Language.valueOf(lang);
		
		for (int i=0; i<=text.length() - k ; i++) {
			CharSequence kmer = text.substring(i, i + k);
			db.add(kmer, language);
			
		}
	}
	
	public static void main(String[]args) throws Throwable {
		Parser p = new Parser("wili-2018-Small-11750-Edited.txt", 1);
		
		Database db = new Database();
		p.setDb(db);
		Thread t = new Thread(p);
		t.start();
		t.join();
		
		db.resize(300);
		
		String s = "Táim fiche a haon bliaina d'aois";
		//String s = Мне двадцать один год
		//String s = I am twenty one years old
		//String s = J'ai vingt et un ans
		
		p.analyseQuery(s);
		
		System.out.println(db);
	}

	private void analyseQuery(String s) {
		// TODO Auto-generated method stub
		
	}

}
