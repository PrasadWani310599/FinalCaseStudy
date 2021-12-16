package com.example.PaymentGateway.Controller;


import com.example.PaymentGateway.Order.Order;
import com.example.PaymentGateway.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaypalController {

    @Autowired
    PaypalService service;

    public static final String SUCCESS_URL= "pay/success";
    public static final String CANCEL_URL= "pay/cancel";


    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    //payment processing method

    @PostMapping ("/pay")
    public String payment(@ModelAttribute("order") Order order) {
        try {
            Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    order.getIntent(), order.getDescription(), "http://localhost:9090/" + CANCEL_URL,
                    "http://localhost:9090/" + SUCCESS_URL);

            //we need to get the link to get redirected to our paypal
            for(Links link:payment.getLinks()) {
                //if getrel equals string named approval_url then get that link and redirect to our paypal payment
                if(link.getRel().equals("approval_url")) {
                    return "redirect:"+link.getHref();
                }
                //if the link which we are getting from payment object contains the string approval_url then it will redirect to link.gethref
            }

        } catch ( PayPalRESTException e) {

            e.printStackTrace();
        }
        return "redirect:/";
    }

    @GetMapping(value = CANCEL_URL)
    public String cancelPay() {
        return "cancel";
    }

    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
        try {
            Payment payment = service.executePayment(paymentId, payerId);
            //if response is success then it will print in console
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "success";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";
    }
}
