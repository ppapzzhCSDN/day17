package com.day16.zuoye;

import java.sql.*;

public class Work7 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            //第一步：加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        //第二步：获取连接
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        //第三步：获取Statement对象
        try {
            preparedStatement = connection.prepareStatement("student");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        String sql = "select from student (id,class_id,name,sex,hiredate) values(?,?,?,?,?) ;";   //查询语句   分页  ？？
            //第四步:执行SQL语句
            rs = preparedStatement.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String class_id = rs.getString(2);
                String name = rs.getString(3);
                String sex = rs.getString(4);
                System.out.println("id:" + id + "class_id" + class_id + ",name:" + name + "sex" + sex);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (connection != null) {
                    connection.close();
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    }

