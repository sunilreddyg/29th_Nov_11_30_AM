Feature:  Product quantity increas and decrease
	Background:  Add Item to Cart
		Given site address flipkart
		And user search product
		And user click on add product
		
	Scenario: Verifying Increase product
			When user click plus button
			Then verify product is increased
			
	Scenario: Verify no effect on product increase
			When user click on minus button
			Then verify no effect on increase
			
	Scenario: Verify no effect on product increase
			When user click on plus button
			And click on Minus button after one product incresed
			Then verify Product quantity decreased to 1
				