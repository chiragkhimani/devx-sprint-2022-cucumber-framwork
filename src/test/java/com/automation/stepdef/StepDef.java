package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

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

    @Then("verify item details on cart page")
    public void verify_item_details_on_cart_page() {
        
    }

    @When("user click on remove button")
    public void user_click_on_remove_button() {

    }

    @Then("verify cart is empty")
    public void verify_cart_is_empty() {

    }

    @When("user increase quantity of item to {int}")
    public void user_increase_quantity_of_item_to(Integer int1) {

    }

    @Then("verify total price is updated with the quantity")
    public void verify_total_price_is_updated_with_the_quantity() {

    }

    @When("user click on continue shopping button")
    public void user_click_on_continue_shopping_button() {

    }

    @When("user search with Laptop")
    public void user_search_with_laptop() {

    }

    @Then("verify cart page has more than one item in cart")
    public void verify_cart_page_has_more_than_one_item_in_cart() {

    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @When("user eat one packet of Biscuit")
    public void user_validate_dropdown_menu_with_below_options(DataTable dataTable) {
        List<String> expectedData = dataTable.asList();

        for(String item : expectedData){
            System.out.println(item);
        }
    }

    @When("user eats collections of Biscuit")
    public void user_validate_collection_of_data(DataTable dataTable) {
        List<List<String>> collectionOfData = dataTable.asLists();

        for(List<String> packets: collectionOfData){

            for(String item   :  packets){
                    System.out.print(item+" ");
            }

            System.out.println();
        }
    }
}
