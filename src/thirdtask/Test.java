/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;
/**
 *
 * @author  Oguzhan BAYRAK
 *             20180423       
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
   
        ArrayList<Item> list = new ArrayList<Item>();
        Item item_03 = new Item();
        Methods m = new Methods();
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose your question Number : ");
        System.out.println("If you want to work 3 question,please you can press to the selection 1 ");
        System.out.println("If you want to work 4 question,please you can press to the selection 2 ");
        System.out.println("If you want to work 5 question,please you can press to the selection 3 ");
        System.out.println("If you want to work 2 question,please you can press to the selection 4 ");
        
        int selection = scn.nextInt();
            switch(selection){
                case 1: 
                        Item item_01 = new Item();
                        Item item_02 = new Item("MobilePhone","Apple","USA",1000,2017);
                        
                   //Default Value
                    System.out.println(" "+item_01.getTitle()+"/t "+item_01.getProducer()+"/t "+item_01.getCountryOfOrigin()+"/t"+item_01.getPrice()+"/t "+item_01.getProductionYear());
                   //Other Constructor
                    System.out.println(" "+item_02.getTitle()+" "+item_02.getProducer()+" "+item_02.getCountryOfOrigin()+" "+item_02.getPrice()+" "+item_02.getProductionYear());
                          break;
                case 2:
                        m.createObject(item_03);
                        m.printObject(item_03);
                        m.excangeMoney(item_03);
                        System.out.println("New Item information added");
                        System.out.println(" "+item_03.getTitle()+" "+item_03.getProducer()+" "+item_03.getCountryOfOrigin()+" "+item_03.getPrice()+" "+item_03.getProductionYear());
                        
                        break;
                case 3:
                        System.out.println("Press 1 For ADD      => ");
                        System.out.println("Press 2 For DELETE   => ");
                        System.out.println("Press 3 For SORT     => ");
                        System.out.println("Press 4 For SAVE     => ");
                        System.out.println("Press 5 For QUİT     => ");
                        int x = scn.nextInt();
                    while(x<5){
                        switch(x){
                            case 1 : 
                               //Item item_04 = new Item();   => We should change location this object because we want to use other inside of case. We're doing GLOBAL!
                                for(int i = 4 ; i < 5; i++){       //Dinamic max 10 Item.
                                Item item_i = new Item();
                                m.createObject(item_i);     
                                list.add(item_i);
                                }   
                                System.out.println(list);

                            break;
                            case 2 : 
                                list.remove(list.get(list.size()-1));
                                System.out.println(list);
                             break;
                            case 3 :
                                Collections.sort(list);
                                System.out.println("SORT :>>"+list);    
                            break;
                            case 4 :
                               BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\ousha\\OneDrive\\Belgeler\\NetBeansProjects\\2018\\ThirdTask\\Output.txt"));
                               out.newLine();
                               out.write(list.toString());
                               out.flush();
                               out.close();
                            break;
                            case 5 : 
                               
                            default: break;
                                 
                        } 
                         System.out.println("Press 1 For ADD         => ");
                         System.out.println("Press 2 For DELETE      => ");
                         System.out.println("Press 3 For SORT(Years) => ");
                         System.out.println("Press 4 For SAVE        => ");
                         System.out.println("Press 5 For QUIT        => ");
                         x = scn.nextInt();
                    }
                    break;
                case 4:
                             // 2. question
                        withString wS = new withString();
                        wS.FileRead();
                    break;
            
            }   
 
       }  
    }
