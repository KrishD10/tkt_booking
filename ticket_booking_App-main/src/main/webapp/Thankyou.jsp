<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Thank You!</title>
  <link rel="stylesheet" href="styles/Thankyou.css">
</head>
<body>
  <div class="thank-you-container">
    <div class="thank-you-card">
      <h1>🎉 Thank You! 🎟️</h1>
      <p>Your booking has been confirmed successfully.</p>
      <p>We hope you enjoy your movie experience.</p>
      <p><strong>Booking Reference:</strong> <span class="ref-number">ABC123456</span></p>
      <button onclick="goHome()">Go to Home</button>
    </div>
  </div>

  <script>
    function goHome() {
      window.location.href = "index.html"; // Change to your desired page
    }
  </script>
</body>
</html>
