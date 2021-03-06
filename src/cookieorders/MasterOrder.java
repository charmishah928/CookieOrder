
package cookieorders;
/**
 * @author Charmi
 */
import java.util.ArrayList;
public class MasterOrder 
{
     /** The list of all cookie orders */
    private ArrayList<CookieOrder> orders;

    /** Constructs a new MasterOrder object. */
    public MasterOrder()
    { 
        orders = new ArrayList<CookieOrder>();
    }

    /** Adds theOrder to the master order.
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    { 
        orders.add(theOrder); 
    }

    /** @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes()
    { /* to be implemented in part (a) */ 
      int count = 0;
      for(int i = 0; i < orders.size(); i++)
      {
          CookieOrder x = orders.get(i);
          count += x.getNumBoxes();
      }
      return count;
    }

    /** Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed.
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders removed
     */

    public int removeVariety(String cookieVar)
    { /* to be implemented in part (b) */ 
        int boxesRemoved = 0;
       for(int i = orders.size() -1; i >= 0; i--)
       {
           if(cookieVar.equals(orders.get(i).getVariety()))
           {
               boxesRemoved += orders.get(i).getNumBoxes();
               orders.remove(i);
           }
       }
       return boxesRemoved;
    }

    // There may be instance variables, constructors, and methods that are not shown.
    public void showOrders()
    { /* to be implemented */
        System.out.println("The master order has the following orders: ");
        for(int i = 0; i < orders.size(); i++)
        {
            System.out.println("Variety: " + orders.get(i).getVariety() + " Number of Boxes: " + orders.get(i).getNumBoxes());
        }
        
    }
}
