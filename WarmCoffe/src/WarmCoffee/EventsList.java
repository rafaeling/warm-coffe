/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.EventsListView;

/**
 *
 * @author rafaeling
 */
public class EventsList extends EventsListView{
    
    String username;
    
    public EventsList(String name) {
        super();
        this.username = name;
    }
    
    @Override
    protected void back() {
        
        MainMenu menuWindow = new MainMenu(username);
        menuWindow.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }
    
}
