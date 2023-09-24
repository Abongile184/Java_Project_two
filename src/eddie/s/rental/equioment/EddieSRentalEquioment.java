/*This is a visual basic Program 
 * 
 *The Price schedule for Eddie's Equipment Rental. Full-Day rentals cost one and
 *a half times half-day rentals. write a program that display in a list box when 
 *an appropriate button is clicked and displays a bill in another list box based
 *on the item number and time period chosen by a customer.
 *The bill should include a $30.00 deposite. 
 *
 *Piece of Equipment:      Half-day          Full-day
 1.Rug cleaner             $16.00            $24.00
 2.Lawn mower              $12.00            $18.00
 3.Paint sprayer           $20.00            $30.00
 *
 */
package eddie.s.rental.equioment;

/**
 *
 * @author Abongile Mavela
 */
public class EddieSRentalEquioment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     FrmRentalEquipment FrmRentalEquipment = new FrmRentalEquipment();
     FrmRentalEquipment.show();
    }
    
}
