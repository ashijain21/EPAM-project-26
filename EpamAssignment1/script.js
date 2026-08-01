// Welcome popup when mouse comes on welcome text
function trigger() {
    document.getElementById("hover").addEventListener("mouseover", popup);
}

function popup() {
    alert("Welcome to XYZ Bank !!!");
}

// Validate customer ID
function validateCustomer() {
    var custId = document.getElementById("custID").value;
    var validateCust = custId.includes("XYZ");

    if (validateCust) {
        document.getElementById("result").innerHTML =
            "Customer ID is valid, you can proceed further to generate coupon.";
    } else {
        document.getElementById("result").innerHTML =
            "You are not a valid customer.";
    }
}

// Generate coupon
function generateCoupon() {
    var custId = document.getElementById("custID").value;
    var validateCust = custId.includes("XYZ");

    if (validateCust) {
        var coupon = custId + "789456";
        document.getElementById("coupon").innerHTML =
            "<b>Your coupon is: </b>" + coupon;
    } else {
        document.getElementById("coupon").innerHTML =
            "Invalid customer ID, coupon cannot be generated.";
    }
}

// Hide instructions
function registerCustomer() {
    document.getElementById("demo").style.display = "none";
}
