
package cookieorders;

/**
 * @author Charmi
 */
public class CookieDriver 
{
     public static void main(String [] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.showOrders();
        goodies.removeVariety("Chocolate Chip");
        goodies.showOrders();
    }
}
