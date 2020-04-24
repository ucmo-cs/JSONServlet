<html>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    function sendJSON() {
        let article = {title : "test",
                       url : "http://test.com",
                       categories : ["Fiction","Mystery"],
                       tags : ["New"]};
        axios.post("http://localhost:8080/JSONServlet_war/jsonservlet",
                   article);
    }
</script>
<body>
<h2>Hello World!</h2>
<button onclick="sendJSON()">Send Article</button>
</body>
</html>
