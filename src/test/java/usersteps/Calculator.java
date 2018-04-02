package usersteps;

import org.jbehave.core.annotations.*;
import org.junit.Assert;
import pages.CalculatorPage;


public class Calculator  {

    CalculatorPage page = new CalculatorPage();

    private char sign;
    private String number1;
    private String number2;
    private String result;



    @Given("user opens calculator page")

    public void givenUserOpensCalculatorPage() throws Exception {
     page.open();
    }


    @Given("user gets empty entry field")
    public void givenUserGetsEmptyEntryField() throws Exception {

        page.resset();
    }

    @When("user selects the first number as <number1>")

    public void whenUserSelectsTheFirstNumber(@Named("number1") String number1) {
       this.number1=number1;
       page.typeInput(number1);
    }

    @When("user selects the operation sign as <sign>")

    public void whenUserSelectsTheOperationSignP(@Named("sign") String sign) {
        this.sign = sign.charAt(0);
        switch (this.sign){

            case '+':
                page.addition();
                break;

            case '-':
                page.subtraction();
                break;

            case '*':
                page.multiplication();
                break;

            case '/':
                page.division();
                break;

            default:
                System.out.println("Please give a correct operation");
        }

      }

    @When("user selects the second number as <number2>")

    public void whenUserSelectsTheSecondNumber(@Named("number2") String number2) {
        this.number2=number2;
        page.typeInput(number2);
    }

    @When("user selects the equal sign")

    public void whenUserSelectsTheEqualSign() {
       page.equal();
    }

    @Then("user gets the result as <result>")

    public void thenUserGetsTheResult(@Named("result") String result) {
        Assert.assertEquals(result,page.output());

    }

    @Then("user closes calculator page")

    public void givencloseBrowser(){
        page.closeBrowser();

    }

}
