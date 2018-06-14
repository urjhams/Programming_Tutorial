import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;


public class Login {

	//todo: This is a little Example how to use HTMLUnit to log into Bison.
	//Look at this code and try to understand it. Afterwards, create a
	//similar Application where you log into https://moodle.uni-weimar.de/

	public static void main(final String[] args) {
        final WebClient webClient = new WebClient();
        webClient.setJavaScriptTimeout(1000);
        try {
            System.out.println("Querying");
            final HtmlPage page1 = webClient.getPage("https://www.uni-weimar.de/qisserver/rds?state=user&type=0");
            final HtmlForm form = page1.getFormByName("loginform");

            //____________________________

            final HtmlSubmitInput button = form.getInputByName("submit");
            final HtmlTextInput textFieldLoginName = form.getInputByName("username");
            final HtmlPasswordInput textFieldPassword = form.getInputByName("pass");

            // Change the value of the text field
            textFieldLoginName.setValueAttribute(args[0]);
            textFieldPassword.setValueAttribute(args[1]);

            // Now submit the form by clicking the button and get back the second page.
            final HtmlPage page2 = button.click();

            webClient.close();

            //____________________________

            System.out.println("Success");
        } catch (final FailingHttpStatusCodeException e) {
            System.out.println("One");
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            System.out.println("Two");
            e.printStackTrace();
        } catch (final IOException e) {
            System.out.println("Three");
            e.printStackTrace();
        } catch (final Exception e) {
            System.out.println("Four");
            e.printStackTrace();
        }
        System.out.println("Finished");
    }

}
