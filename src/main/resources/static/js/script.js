$(document).ready(function () {
    fetchProducts();
})

function fetchProducts() {
    fetch("http://localhost:8080/api/products")
        .then(response => response.json())
        .then(function (data) {
            data.forEach(element => {
                $("<tr><td>" + element.name + "</td>" + "<td>" + element.quantity + "</td></tr>").appendTo('#products');
            });
        });
}

function submitProduct() {

    var formData = $("#productform").serializeArray();
    var toSend = {
        name:formData[0].value,
        quantity:formData[1].value
    }

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/api/addProduct",
        data: JSON.stringify(toSend),
        success: location.reload(),
        dataType: "json",
        contentType: "application/json",
        error: (function(xhr, textStatus, errorThrown) {
            alert('Error! Status = ' + xhr.status);
        })
    })
}