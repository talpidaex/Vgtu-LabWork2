

package thirdtask;

import javax.swing.JOptionPane;

public class Methods {
    
        public Object createObject(Item i){                         //Create new Object 
            
            String title = JOptionPane.showInputDialog("Name of Company");
            i.setTitle(title);
            
            String producer = JOptionPane.showInputDialog("Name of Producer");
            i.setProducer(producer);
            
            String country = JOptionPane.showInputDialog("Name of Country");
            i.setCountryOfOrigin(country);
            
            double price = Double.valueOf(JOptionPane.showInputDialog("Price €"));
            i.setPrice(price);
            
            int year = Integer.parseInt(JOptionPane.showInputDialog("Year"));
            i.setProductionYear(year);

            return i;
        }                                                   
        public void printObject(Item i){
            System.out.println(i.getTitle());
            System.out.println(i.getProducer());
            System.out.println(i.getCountryOfOrigin());
            System.out.println(i.getPrice());
            System.out.println(i.getProductionYear());
         }
        public void excangeMoney(Item i){                //This is mandatory method! Excange money and additional tax
                                                         //  1 € = 3.4528 Litas and % 18 TAX
            double Litas = (i.getPrice()*3.4528)*1.18;   //1.18 added the Tax for (%18 assume tax for percentage of price)
            System.out.println(i.getPrice()+" € equals "+Litas+" LT");
        }
}
