package day5;

import java.sql.*;
import java.text.SimpleDateFormat;

import static java.lang.Class.forName;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
//        Date date =new Date(1000,1,1);   //1000/1/1为格式
//        Date date2 = new Date(System.currentTimeMillis());
//        String str = "2021-11-2";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date parse = sdf.parse(str);
//        java.sql.Date date3 = new Date(parse.getTime());
//        Student student = new Student("张志航","男",2010-11-21,12);  //刚才没传值进去
//        add(student);========================================
//        update(student);

    }
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet rs = null;
//        try {
//            //第一步：加载驱动
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e1) {
//            e1.printStackTrace();
//        }
//        //第二步：获取连接
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
//        //第三步：获取Statement对象
//        try {
//            preparedStatement = connection.prepareStatement("student");
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
//        String sql = "select from student (limit 0,5) values(?,?) ;";   //查询语句   分页  ？？
//            //第四步:执行SQL语句
//            rs = preparedStatement.executeQuery(sql);
//            while (rs.next()) {
//                String id = rs.getString(1);
//                String class_id = rs.getString(2);
//                String name = rs.getString(3);
//                String sex = rs.getString(4);
//                System.out.println("id:" + id + "class_id" + class_id + ",name:" + name + "sex" + sex);
//            }
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null)
//                    rs.close();
//                if (connection != null) {
//                    connection.close();
//                    if (preparedStatement != null) {
//                        preparedStatement.close();
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }

    //    public static void add(Student stu) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");
//        String sql = "insert into student(id,class_id,name,sex,hiredate) values(?,?,?,?,?) ";   //增加 add(）语句
//        //第四步:执行SQL语句
//        PreparedStatement prep = conn.prepareStatement(sql);
//        prep.setInt(1,stu.getId());
//        prep.setInt(2,stu.getClass_id());
//        prep.setString(3,stu.getName());
//        prep.setString(4,stu.getSex());
//        prep.setDate(5, stu.getDate());
//
//        int result = prep.executeUpdate();
//        if (result > 0) {
//            System.out.println("success");
//        } else {
//            System.out.println("fail");
//        }
//
//        if (prep != null) {
//            prep.close();
//        }
//        if (conn != null) {
//            conn.close();
//        }
//    }
//    public static <connection> void update(Student stu) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false\", \"root\", \"root");
//        String sql = "update student set name=?,sex=?hiredate=? where id=?";
//        PreparedStatement prep = conn.prepareStatement(sql);
//        prep.setString(1, stu.getName());
//        prep.setString(2, stu.getSex());
//        prep.setDate(3, stu.getDate());
//        prep.setInt(4, stu.getId());
//        int result = prep.executeUpdate();
//        if (result > 0) {
//            System.out.println("success");
//        } else {
//            System.out.println("fail");
//        }
//
//        if (prep != null) {
//            prep.close();
//        }
//        if (conn != null) {
//            conn.close();
//        }
//   }

}

