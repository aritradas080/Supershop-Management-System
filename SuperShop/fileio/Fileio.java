package fileio;

import java.io.*;
import interfaces.*;

public class Fileio implements Io {
   
	public File file;				
	public FileWriter fwr;		
	public FileReader frd;		
	public BufferedReader bfrd;		
		
	
	
	public void writeInFile(String s)
	{
		try
		{
			file = new File("C:/Users/USER/Downloads/SuperShop/SuperShop/fileio");	
			file.createNewFile();					
			fwr= new FileWriter(file, true);	
			fwr.write(s+"\r"+"\n");											
			fwr.flush();
			fwr.close();							
		}
		catch(IOException e1)
		{
			e1.getMessage();
		}
	}
	
	public void readFromFile()
	{
		
		try{
		frd = new FileReader(file);         
		bfrd = new BufferedReader(frd);      
		String text="", temp;                   
		
		while((temp=bfrd.readLine())!=null)  {   
			text=text+temp+"\n"+"\r";          
		}
		
		System.out.print(text);                 
		frd.close();                        
	}
	catch(IOException e1)
	{
		e1.getMessage();
	}
}

}
     
        
            
               
            
        
    
   

  
       

    
  
    






