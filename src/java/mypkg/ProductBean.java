package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductBean {
    private int code;
    private String name;
    private String desc;
    private String catg;
    private int price;

    
    
    public ProductBean searchProduct(int code){
        
        ProductBean bean=new ProductBean();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomdata", "root", "root");
            String sql="SELECT * FROM products WHERE pcode=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, code);
            ResultSet rs=ps.executeQuery();
            rs.next();
            bean.setCode(rs.getInt(1));
            bean.setName(rs.getString(2));
            bean.setDesc(rs.getString(3));
            bean.setCatg(rs.getString(4));
            bean.setPrice(rs.getInt(5));
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bean;
    }
    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}
