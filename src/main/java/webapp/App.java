package webapp;

import org.springframework.web.filter.CharacterEncodingFilter;

import webapp.beans.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Calculator c = Calculator.getInstance();
    	c.sum(10, 20);
        
    }
}
