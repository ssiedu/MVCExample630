<jsp:useBean scope="session" id="info" class="mypkg.ProductBean"/>
<html>
    <body>
        <h3>Product-Details</h3>
        <hr>
        <pre>
            PCode   <jsp:getProperty name="info" property="code"/>
            Name    <jsp:getProperty name="info" property="name"/>
            Desc    <jsp:getProperty name="info" property="desc"/>
            Catg    <jsp:getProperty name="info" property="catg"/>
            Price   <jsp:getProperty name="info" property="price"/>
        </pre>
        <hr>
    </body>
</html>
