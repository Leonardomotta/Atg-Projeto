package gp.gp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
	

	String line = "";
	String splitby = ",";
	
	
	public ArrayList<ArrayList<String>>read(String path) {
		
		ArrayList<ArrayList<String>> result =  new ArrayList<ArrayList<String>>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] atores = line.split(splitby);
                 
                ArrayList<String> x = new ArrayList<String>();
                x.add(atores[0]);
                x.add(atores[1]);
                result.add(x);
                
                
                }
          
         
            

        } catch (IOException e) {
            e.printStackTrace();
        }

		return result;
		
	}

}
