/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmCoffee;

import GUI.ReservationUserListView;

/**
 *
 * @author rafae
 */
public class ReservationUserList extends ReservationUserListView{

    @Override
    protected void back() {
        this.setVisible(false);
    }

    @Override
    protected void modifyReservation() {
        ModifyReservation menuWindow = new ModifyReservation();
        menuWindow.setVisible(true);
    }

    @Override
    protected void cancelReservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
