package App;

import com.online.restorant.Customer;
import com.online.restorant.Order;
import com.online.restorant.Vendor;

import java.util.Date;


public class Application {
    public static void main(String[] args) {
        Customer bhushan =new Customer();
        bhushan.setName("Bhushan");
        bhushan.setCity("Nagpur");
        bhushan.setAddress("Hudkeshwar Road Nagpur");
        bhushan.setState("Maharashtra Mazha");
        bhushan.setEmailId("bhushan@gmail.com");
        bhushan.setPhoneNumber(9885455552L);

        System.out.println("Name :"+bhushan.getName());
        System.out.println("City :"+bhushan.getCity());
        System.out.println("Address:"+bhushan.getAddress());
        System.out.println("State :"+bhushan.getState());
        System.out.println("EmailId :"+bhushan.getEmailId());
        System.out.println("PhoneNumber :"+bhushan.getPhoneNumber());

        Vendor haldiram = new Vendor();
        haldiram.setName ("Haldiram Veg Restorsnt");
        haldiram.setAddress ("Ajni Nagpur");
        haldiram.setCategory ("VEG");
        haldiram.setPhoneNumber(7894561230L);
        haldiram.setRating  (4.5);
        haldiram.setState ("Maharashtra Mazha");
        haldiram.setCity ("Nagpur");

        System.out.println("Name="+haldiram.getName());
        System.out.println("Address="+haldiram.getAddress());
        System.out.println("Category="+haldiram.getCategory());
        System.out.println("PhoneNo.="+haldiram.getPhoneNumber());
        System.out.println("Rating="+haldiram.getRating());
        System.out.println("State="+haldiram.getState());
        System.out.println("City="+haldiram.getCity());


        Order order = new Order();
        order.setCustomer(bhushan);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDilliveryAddress( "Manewada Nagpur");

        System.out.println("Customer="+order.getCustomer());
        System.out.println("Vendor="+order.getVendor());
        System.out.println("TotalAmount="+order.getTotalAmount());
        System.out.println("OrderDate="+order.getOrderDate());
        System.out.println("DilliveryAddress="+order.getDilliveryAddress());



    }
}
