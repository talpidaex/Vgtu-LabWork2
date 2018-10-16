/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class withString {

        public void FileRead() throws FileNotFoundException {
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\ousha\\OneDrive\\Belgeler\\NetBeansProjects\\2018\\ThirdTask\\Article.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\ousha\\OneDrive\\Belgeler\\NetBeansProjects\\2018\\ThirdTask\\Banners.txt"));
             ArrayList<String> bannerWords = new ArrayList<String>();
            try {
                String line1 = reader1.readLine();                // reader1 => this is our article
                String line2 = reader2.readLine();                // reader2 => list of banner words.
                boolean control,control2;
                while(line2!=null){                                //Array of BANNERWORDS.
                line2 = reader2.readLine();
                if(line2!=null){
                bannerWords.add(line2);
                }
            }
                System.out.println(bannerWords);
                int lineNum = 1;
                while(line1!=null){
                control =line1.startsWith("Ogu");                       //3 letters of my Name //
                control2 =line1.endsWith("Ogu");
                System.out.println(""+lineNum+" "+line1);
                for(int i = 0; i < bannerWords.size(); i++){                //searching on bannerwords.
                    if(bannerWords.get(i).equals(line1))                    
                        System.out.print("Text contains Forbidden Words : "+bannerWords.get(i).toUpperCase()+"\n");
                }
                line1 = reader1.readLine();
                lineNum++;
                System.out.println("Is the first of textFile contains our Name :"+control);
                System.out.println("Is the last of textFile contains our Name : "+control2);

             }
                System.out.println("Number of Words : "+(--lineNum));    //Line Number,extraction 1 'cause LineNum variable starts 1,not 0.
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        
}
