/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Implementor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jindou
 */
public class ImplementorDirectory {
    
    private ArrayList<Implementor> implementorList;

    public ImplementorDirectory() {
        implementorList = new ArrayList<>();
    }

    
    public List<Implementor> getImplementorList() {
        
        return implementorList;
    }
    
    public Implementor craeteImplementor(String name){
        Implementor implementor = new Implementor();
        implementor.setName(name);
        implementorList.add(implementor);
        return implementor;
    }
    
    public void deleteImplementor(Implementor implementor){
        implementorList.remove(implementor);
    }
}
