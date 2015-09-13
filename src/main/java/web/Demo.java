package web;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import  java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class Demo {
	
	@RequestMapping("/balance")
	String balance() {
		return "balance";
	}
	
	@RequestMapping("/calculate")
	String calculate(double balance, Model model) {
		double result = balance * 1.25 / 100;
		model.addAttribute("result", result);
		return "interest";
	}
        
        @RequestMapping("/vat")
        String vat(){
            return "vat";
        }
        @RequestMapping("/resultvat")
        String resultvat (double vat, Model model){
            double result = vat * 7 / 100;
            model.addAttribute("result",result);
            return "interest";
        }
        @RequestMapping("/Circle")
        String Circle(){
            return "Circle";
        }
        
        @RequestMapping("/areaOfCircle")
        String Circle (double Circle,Model model){
            double result = Math.PI * Circle * Circle;
            double result1 = 2* Math.PI * Circle;
            model.addAttribute("result",result);
            model.addAttribute("result1",result1);
            return "interest1";
        }
        
        @RequestMapping("/area")
        String area(){
            return "area";
        }
        @RequestMapping("/areaOfRectangle")
        String areaOfRectangle (double width,double height,Model model){
            double result = width * height;
            model.addAttribute("result",result);
            return "interest";
        }
        @RequestMapping("/zipcode")
        String zipcode(){
            return "zipcode";
        }
        @RequestMapping("/searchzipcode")
        String searchzipcode(String Text,Model model){
            String [] input = {"เมืองนนทบุรี","บางบัวทอง","ปากเกร็ด","บางกรวย","บางใหญ่","ไทรน้อย"}; 
            int [] number = {11000,11110,11120,11130,11140,11150};
            int i = 0;
            int result = 0;
        while(i < input.length ){
            if (input[i].equals(Text)) {
                result = number[i];
            }
            i = i + 1;
        }
            model.addAttribute("result",result);
            return "interest";
        }
        @RequestMapping("/domain")
        String domain(){
            return "domain";
        }
        @RequestMapping("/searchip")
        String searchip(String domain,Model model) throws UnknownHostException{
        InetAddress result = InetAddress.getByName(domain);
        model.addAttribute("result",result);
        return "interest";
        }
}
