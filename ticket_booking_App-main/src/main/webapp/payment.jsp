<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>payment</title>
    <link rel="stylesheet" href="styles/payment.css">
</head>
<body>
    <header id="main-header">
        <img src="" alt="Logo">
        <button>Profile</button>
    </header>
    <div class="payment-container">
        <h2>Select Payment:</h2>
        <div class="payment-section">
          <label>
            <input type="radio" name="payment" checked>
            Credit/Debit Card
          </label>
    
          <div class="card-info">
            <label>Name on Card:
              <input type="text" placeholder="Enter cardholder name">
            </label>
    
            <label>Card Number:
              <input type="text" placeholder="Enter card number">
            </label>
    
            <div class="expiry-cvv">
              <label>End Date (MM/YY):
                <input type="text" placeholder="MM">
                <input type="text" placeholder="YYYY">
              </label>
              <label>CVV:
                <input type="text" placeholder="CVV">
              </label>
            </div>
            <button class="submit-btn"> Pay</button>
          </div>
        </div>
        <div class="payment-section">
          <label>
            <input type="radio" name="payment">
            UPI Number
          </label>
          <label>UPI ID:
            <input type="text" placeholder="Enter UPI number">
          </label>
          <button class="submit-btn">Pay</button>
        </div>
      </div>
</body>
</html>