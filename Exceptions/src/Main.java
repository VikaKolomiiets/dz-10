import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.util.Arrays;

/*
Викликати метод process з наступними параметрами:
4.1 id = accountId000, amount 50, currency USD
4.2 id = accountId003, amount 250, currency HRV
4.3 id = accountId001, amount 50, currency EUR
4.4 id = accountId001, amount 50, currency USD
 */
public class Main {
    public static void main(String[] args) throws Exception {
        getServiceWithExceptions("accountId000", 50, "USD");
        getServiceWithExceptions("accountId003", 250, "HRV");
        getServiceWithExceptions("accountId001", 50, "EUR");
        getServiceWithExceptions("accountId001", 50, "USD");
    }

    private static void getServiceWithExceptions(String id, int amount, String currency){
        BankApplication bankApplication = new BankApplication();
        try{
            bankApplication.process(id, amount, currency);
        }catch (WrongAccountException wrongAccountException){
            System.out.println(wrongAccountException);
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println(wrongCurrencyException);
        } catch (WrongOperationException wrongOperationException) {
            System.out.println(wrongOperationException);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Thank you for using our service!");
        }
    }
}