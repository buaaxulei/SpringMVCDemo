$(document).ready(function() {
        ajaxRequest();
      });

      function ajaxRequest() {
        $.ajax({
          url: "/ajax/hello",
          type: "POST",
          dataType: "json",
          data: {
            "a": 1,
            "b": 2,
            "c": 3
          },
          async: false,
          success: function(data) {
            alert("success");
            $.each(data, function(index, element) {
              alert(element.a);
              alert(element.b);
              alert(element.c);
            });
          },
          error: function() {
            alert("error");
          }
        });
      }