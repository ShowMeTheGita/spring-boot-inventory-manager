$(document).ready(function () {
    $.getJSON('http://localhost:8080/api/products', function(json) {
        var tr;
        for (var i = 0; i < json.length; i++) {
            tr =$('<tr/>');
            tr.append("<td>" + json[i].name + "</td>");
            tr.append("<td>" + json[i].quantity + "</td>");
            $('products').append(tr);
        }
    });
});