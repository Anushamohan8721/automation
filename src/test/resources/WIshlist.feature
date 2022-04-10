Feature: Wishlist
  As a custoemr
  I want to add a product into basket
  SO that i can view / purchase the products

  @smoke
  Scenario: Add Product to basket
    Given Iam on homepage
    When I search for product "puma"

  @smoke
  Scenario: Add Product to mutiple basket
    Given Iam on homepage
    When I search for product "puma"