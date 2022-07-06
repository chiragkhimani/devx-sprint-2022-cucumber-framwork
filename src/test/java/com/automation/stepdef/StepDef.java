package com.automation.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

    @Then("user open website")
    public void user_open_website() {
        System.out.println("Step 1");
    }

    @Then("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        System.out.println("Step 2");
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        System.out.println("Step 3");
    }

    @Then("user login with invalid credentials")
    public void user_login_with_invalid_credentials() {
        System.out.println("Step 4");
    }

    @Then("verify invalid login error message")
    public void verify_invalid_login_error_message(){
        System.out.println("Step 5");
    }

    @When("user search with TV")
    public void user_search_with_tv() {

    }

    @Then("verify list of search results are displayed")
    public void verify_list_of_search_results_are_displayed() {

    }

    @When("user click on first result")
    public void user_click_on_first_result() {

    }

    @Then("verify product details page is displayed")
    public void verify_product_details_page_is_displayed() {

    }

    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {

    }

    @Then("verify product added into the cart")
    public void verify_product_added_into_the_cart() {

    }

    @Then("click on cart icon")
    public void click_on_cart_icon() {

    }

    @Then("verify cart page is displayed")
    public void verify_cart_page_is_displayed() {

    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button() {

    }

    @Then("verify checkout page is displayed")
    public void verify_checkout_page_is_displayed() {

    }

    @Then("verify shipping address section is displayed")
    public void verify_shipping_address_section_is_displayed() {

    }
}
